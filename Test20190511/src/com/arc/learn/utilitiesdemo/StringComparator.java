package com.arc.learn.utilitiesdemo;

import java.util.Comparator;

public class StringComparator implements Comparator<String>{

	/**
	 * ×ÖÄ¸×ÔÈ»Ë³Ğòµ¹ĞòÅÅÁĞ
	 */
	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}

}
