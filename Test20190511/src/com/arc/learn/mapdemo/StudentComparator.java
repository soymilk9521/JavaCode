package com.arc.learn.mapdemo;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int temp = o1.getName().compareTo(o2.getName());
		return temp == 0 ? o1.getAge() - o2.getAge() : temp;
	}
	
	
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "cba";
		int i = s1.compareTo(s2);
		System.out.println(i);
	}

}
