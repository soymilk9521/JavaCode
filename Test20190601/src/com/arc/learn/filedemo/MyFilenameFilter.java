package com.arc.learn.filedemo;

import java.io.File;
import java.io.FilenameFilter;

public class MyFilenameFilter implements FilenameFilter {
	
	public MyFilenameFilter(String filename) {
		this.filename = filename;
	}
	private String filename;
	
	@Override
	public boolean accept(File dir, String name) {
		
		return name.endsWith(filename);
	}

}
