package com.gmail.grezin.v;

import java.io.File;

public class TextFile extends File {

	private String fileName;

	
	public TextFile(String pathname, String fileName) {
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
