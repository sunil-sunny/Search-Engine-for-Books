package com.example.cloud.RecordNotes.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.cloud.RecordNotes.pojo.NotesDetails;

@Service
public class RecordNotesServiceImpl implements RecordNotesService {
	
	private static List<NotesDetails> listOfNotes=new ArrayList<NotesDetails>();

	@Override
	public NotesDetails getNotes(String keyword) {
		
		//System.out.println("get notes");
		for(NotesDetails notes:listOfNotes) {
			
			if(notes.getKeyWord().equalsIgnoreCase(keyword)) {
				
				//System.out.println("Notes Requested for  :"+notes.getKeyWord());
				return notes;
			}
		}
		
		return null;
	}

	@Override
	public boolean saveNotes(String keyword, String notes) {
		
		
		boolean savedStatus=false;
		for(NotesDetails saveNotes:listOfNotes) {
			
			if(saveNotes.getKeyWord().equalsIgnoreCase(keyword)) {
				saveNotes.addNotes(notes);
				
				savedStatus= true;
			}
			if(savedStatus) {
				break;	
			}	
		}
		
		if(!savedStatus) {
			NotesDetails newNotes=new NotesDetails();
			newNotes.setKeyWord(keyword);
			newNotes.addNotes(notes);
			listOfNotes.add(newNotes);
			savedStatus=true;
		}
		
		return savedStatus;
	}
	
	

}
