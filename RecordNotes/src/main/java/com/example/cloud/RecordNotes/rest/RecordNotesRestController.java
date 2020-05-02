package com.example.cloud.RecordNotes.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.cloud.RecordNotes.pojo.NotesDetails;
import com.example.cloud.RecordNotes.service.RecordNotesService;

@RestController
@CrossOrigin("*")
public class RecordNotesRestController {
	
	@Autowired
	private RecordNotesService recordNotesService;
	
	@RequestMapping(value = "/getnotes/{keyword}",method = RequestMethod.GET)
	public NotesDetails getNotes(@PathVariable(value = "keyword") String keyword) {
		
			return recordNotesService.getNotes(keyword);
		
	}
	
	@RequestMapping(value="/savenotes/{keyword}/{notes}",method = RequestMethod.PUT)
	public ResponseEntity<Object> saveNotes(@PathVariable(value="keyword") String keyword,@PathVariable(value="notes") String notes){
		
		boolean savedNotes=recordNotesService.saveNotes(keyword, notes);
		
		if(savedNotes) {
			return new ResponseEntity<>("Notes Saved",HttpStatus.OK);		
		}
		else {
			return new ResponseEntity<>("Error in Saving Notes",HttpStatus.BAD_REQUEST);		
		}
		
	}

}
