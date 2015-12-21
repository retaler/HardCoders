package com.gmail.grezin.v;

import java.io.File;

public class AudioFile extends File{

	private String fileName;

	
	public AudioFile(String pathname, String fileName) {
		super(pathname);
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
}
