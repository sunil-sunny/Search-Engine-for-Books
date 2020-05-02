package com.example.cloud.SearchLog.pojo;

import java.util.ArrayList;
import java.util.List;

public class LogDetails {
	
	private String keyword;
	private int frequency=0;
	private List<String> dateOfSearch=new ArrayList<String>();
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	public List<String> getDateOfSearch() {
		return dateOfSearch;
	}
	public void setDateOfSearch(List<String> dateOfSearch) {
		this.dateOfSearch = dateOfSearch;
	}
	public void addDate(String d) {
		this.getDateOfSearch().add(d);
	}
	public void addFrequency() {
		
		this.frequency++;
		
	}
	

}
