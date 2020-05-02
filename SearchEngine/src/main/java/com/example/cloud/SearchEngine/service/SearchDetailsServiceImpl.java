package com.example.cloud.SearchEngine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cloud.SearchEngine.repository.SearchDetailsRepository;
import com.searchengine.pojo.BookDetails;

@Service
public class SearchDetailsServiceImpl implements SearchDetailsService{
	
	@Autowired
	private SearchDetailsRepository searchDetailsRepository;
	
	public List<BookDetails> getDetails(String keyword){
		
		List<BookDetails> results=searchDetailsRepository.findByTitlesOrAuthorLike(keyword, keyword);
		//System.out.println("result size is:"+results.size());
		return results;	
	}

}
