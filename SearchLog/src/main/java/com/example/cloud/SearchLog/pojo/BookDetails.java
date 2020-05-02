package com.example.cloud.SearchLog.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Document(collection="book_details")
public class BookDetails {
	
	@Id
	@JsonProperty(access = Access.WRITE_ONLY)
	private String id;
	private String title;
	private String author;
	public BookDetails() {
		super();
	}
	public BookDetails(String id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	

	
	
}
