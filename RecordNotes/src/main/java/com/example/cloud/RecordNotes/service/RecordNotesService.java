package com.example.cloud.RecordNotes.service;

import com.example.cloud.RecordNotes.pojo.NotesDetails;

public interface RecordNotesService {
	
	public NotesDetails getNotes(String keyword);
	public boolean saveNotes(String keyword,String notes);

}
