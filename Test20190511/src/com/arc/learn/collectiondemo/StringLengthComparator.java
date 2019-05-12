package com.arc.learn.collectiondemo;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {
		int temp = str1.length() - str2.length();
		return temp == 0? str1.compareTo(str2): temp;
	}
	
}
