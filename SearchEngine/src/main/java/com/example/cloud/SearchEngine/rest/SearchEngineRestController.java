package com.example.cloud.SearchEngine.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cloud.SearchEngine.service.SearchDetailsService;
import com.searchengine.pojo.BookDetails;

@RestController
@CrossOrigin(origins="*")
@RequestMapping(value="/api")
public class SearchEngineRestController {
	
	@Autowired
	private SearchDetailsService searchDetailsService;
	
	@RequestMapping(value="/search/{keyword}",method = RequestMethod.GET)
	public @ResponseBody List<BookDetails> getSearchResults(@PathVariable(value = "keyword") String keyword){
		System.out.println(keyword);
		return searchDetailsService.getDetails(keyword);	
	}

}
