package com.arc.learn.utilitiesdemo;

import java.util.Comparator;

public class StringComparator implements Comparator<String>{

	/**
	 * ��ĸ��Ȼ˳��������
	 */
	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}

}
