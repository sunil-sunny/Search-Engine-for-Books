package com.example.cloud.SearchEngine.service;

import java.util.List;

import com.searchengine.pojo.BookDetails;

public interface SearchDetailsService {
	public List<BookDetails> getDetails(String keyword);

}
