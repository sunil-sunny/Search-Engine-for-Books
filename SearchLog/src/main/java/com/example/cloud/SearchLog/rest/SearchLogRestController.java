package com.example.cloud.SearchLog.rest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.cloud.SearchLog.pojo.BookDetails;
import com.example.cloud.SearchLog.pojo.LogDetails;
import com.example.cloud.SearchLog.service.SearchLogService;

@RestController
@CrossOrigin(origins="*")
public class SearchLogRestController {
	
	@Autowired
	private SearchLogService searchLogService;
	@RequestMapping(value="/search/{keyword}",method = RequestMethod.GET)
	public BookDetails[] getSearchResults(@PathVariable(value = "keyword") String keyword){
		//System.out.println("Search Log");
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		System.out.println(formatter.format(date));
		searchLogService.recordLog(keyword,formatter.format(date));
		RestTemplate restTemplate=new RestTemplate();
		String uri="http://localhost:8080/api/search/"+keyword;		
		BookDetails[] BookDetails = restTemplate.getForObject(uri, BookDetails[].class);
		return BookDetails;	
	}
	
	@RequestMapping(value="/logdetails",method=RequestMethod.GET)
	public List<LogDetails> getLogDetails(){
		return searchLogService.getLog();
		
	}

}
