package com.example.cloud.SearchEngine.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.searchengine.pojo.BookDetails;

@Repository
public interface SearchDetailsRepository extends MongoRepository<BookDetails, String> {
	
	@Query(value = "{ '$or' : [ {'title' : {$regex : ?0, $options: 'i'}}, {'author' : {$regex : ?1, $options: 'i'}}] }")
	List<BookDetails> findByTitlesOrAuthorLike(String title, String author);
}
