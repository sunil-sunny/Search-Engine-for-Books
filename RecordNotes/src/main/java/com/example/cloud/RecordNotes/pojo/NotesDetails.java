package com.example.cloud.RecordNotes.pojo;

import java.util.ArrayList;
import java.util.List;

public class NotesDetails {
	
	
	private String keyWord;
	private List<String> notesList=new ArrayList<String>();
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	public List<String> getNotesList() {
		return notesList;
	}
	public void setNotesList(List<String> notesList) {
		this.notesList = notesList;
	}
	
	public void addNotes(String str) {
		this.notesList.add(str);
	}

}
