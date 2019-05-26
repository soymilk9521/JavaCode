package com.arc.learn.mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo2 {

	public static void main(String[] args) {
		/**
		 * 练习：将学生和归属地存入map中
		 */
//		testHashMap();
		
		testTreeMap();
		
//		testLinkedHashMap();
		
		
	}


	private static void testHashMap() {
		Map<Student, String> map = new HashMap<Student, String>();
		map.put(new Student("Tom", 21),  "Tokyo");
		map.put(new Student("Lily", 20),  "BeiJing");
		map.put(new Student("Green", 27),  "ShangHai");
		map.put(new Student("Karl", 26),  "ChengDu");
		System.out.println(map);
		// entrySet()
		Set<Map.Entry<Student, String>> entries = map.entrySet();
		Iterator<Map.Entry<Student, String>> it = entries.iterator();
		while(it.hasNext()) {
			Entry<Student, String> entry = it.next();
			Student stu = entry.getKey();
			String city = entry.getValue();
			System.out.println(stu.getName() + ":" + stu.getAge() + "---" +city);
		}
	}
	
	private static void testLinkedHashMap() {
		HashMap<Integer, String> map = new LinkedHashMap<>();
		map.put(3, "abc3");
		map.put(1, "abc1");
		map.put(7, "abc7");
		map.put(5, "abc5");
		Set<Entry<Integer, String>> set = map.entrySet();
		Iterator<Map.Entry<Integer, String>> it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}
	
	private static void testTreeMap() {
		Map<Student, String> map = new TreeMap<Student, String>(new StudentComparator());
		map.put(new Student("Tom", 21),  "Tokyo");
		map.put(new Student("Lily", 20),  "BeiJing");
		map.put(new Student("Green", 27),  "ShangHai");
		map.put(new Student("Karl", 26),  "ChengDu");
		map.put(new Student("Karl", 27),  "ChengDu");
		
		Set<Student> keys = map.keySet();
		Iterator<Student> it = keys.iterator();
		while(it.hasNext()) {
			Student student = it.next();
			String city = map.get(student);
			System.out.println( student.getName() + ":" + student.getAge() + "---" + city);
		}
	}

}
