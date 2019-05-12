package com.arc.learn.mapdemo;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		/**
		 * ��ϰ�������ַ�����fdgavcbsacdfs����ͳ���ַ������ַ����ֵĴ���
		 * Ҫ���ӡ�����a(2)b(1)...
		 *  
		 */
		calcNumOfChar();
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
