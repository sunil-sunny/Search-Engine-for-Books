package com.example.cloud.SearchLog.service;

import java.util.List;

import com.example.cloud.SearchLog.pojo.LogDetails;

public interface SearchLogService {
	
	public void recordLog(String keyword, String string);
	public List<LogDetails> getLog();

}
