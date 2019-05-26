package com.arc.learn.mapdemo;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		/**
		 * 练习：给定字符串“fdgavcbsacdfs”，统计字符串中字符出现的次数
		 * 要求打印结果：a(2)b(1)...
		 *  
		 */
		
		String str = "fdgavcaaabsacdfs";
		char[] chars = str.toCharArray();
		
		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		for(char cc : chars) {
			if(!map.containsKey(cc)) {
				map.put(cc, 1);
			} else {
				int count = map.get(cc);
				map.put(cc, ++count);
			}
		}
		
		Set<Character> keys = map.keySet();
		Iterator<Character> it = keys.iterator();
		
		// 方法一：
		String result = "";
		while(it.hasNext()) {
			Character key = it.next();
			Integer value = map.get(key);
			// result = result +  key + "(" + value + ")";
			result += key + "(" + value + ")";
		}
		System.out.println(result);
		
		// 方法二：
		Set<Map.Entry<Character, Integer>> entries = map.entrySet();
		StringBuilder sb = new StringBuilder();
		Iterator<Map.Entry<Character, Integer>> it2 = entries.iterator();
		while(it2.hasNext()) {
			Map.Entry<Character, Integer> entry = it2.next();
			Character key = entry.getKey();
			Integer value = entry.getValue();
			sb.append(key).append("(").append(value).append(")");
		}
		
		System.out.println(sb);
		
		
//		for (int i = 0; i < chars.length; i++) {
//			char cc = chars[i];
//			if(!map.containsKey(cc)) {
//				map.put(cc, 1);
//			} else {
//				int count = map.get(cc);
//				map.put(cc, ++count);
//			}
//		}
//		System.out.println(map);
		
		
//		calcNumOfChar();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void calcNumOfChar() {
		String str = "fdgavcbsacdfs";
		char[] cs = str.toCharArray();
		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		for(char c : cs) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}else {
				Integer i = map.get(c);
				map.put(c, ++i);
			}
		}
		
		Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator();
		StringBuffer sb = new StringBuffer();
		while(it.hasNext()) {
			Map.Entry<Character, Integer> entry = it.next();
			sb.append(entry.getKey() +"("+entry.getValue() +")");
		}
		System.out.println(sb.toString());
	}
	
	
	

}
