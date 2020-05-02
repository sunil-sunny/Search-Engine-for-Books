package com.example.cloud.SearchLog.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cloud.SearchLog.pojo.LogDetails;

@Service
public class SearchLogServiceImpl implements SearchLogService{
	
	
	private static List<LogDetails> logDetailsList=new ArrayList<LogDetails>();

	@Override
	public void recordLog(String keyword, String date) {
		
		int flag=0;
		
			for(LogDetails log:logDetailsList) {
				
				if(log.getKeyword().equalsIgnoreCase(keyword)) {
					
					log.addFrequency();
					log.addDate(date);
					flag=1;
				}
				
		     }
			if(flag==0) {
				
				LogDetails newLog=new LogDetails();
				newLog.addDate(date);
				newLog.addFrequency();
				newLog.setKeyword(keyword);
				logDetailsList.add(newLog);
				
			}			
		
		writeLogIntoCSV();
	}

	private void writeLogIntoCSV() {

		File logFile=new File("LogFile.csv");
		BufferedWriter bw=null;
		try {
			bw=new BufferedWriter(new FileWriter(logFile));
			bw.write("keyword,frequency,date");
			
			for(LogDetails logs:logDetailsList) {
				
				bw.newLine();
				String keyword=logs.getKeyword();
				int frequency=logs.getFrequency();
				String dateList="";
				for(String s:logs.getDateOfSearch()) {
					dateList=dateList.concat(s);
					dateList=dateList.concat("  ");
				}
				bw.write(keyword+","+frequency+","+dateList);
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<LogDetails> getLog() {
		return SearchLogServiceImpl.logDetailsList;	
	}	

}
