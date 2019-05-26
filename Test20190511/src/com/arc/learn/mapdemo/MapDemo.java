package com.arc.learn.mapdemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		/**
		 * Map�����д�����Ǽ�ֵ�ԡ�
		 * Map���ϱ��뱣֤����Ψһ�ԡ�
		 *  ���÷���
		 *  	���
		 *  		put(key, value):��ָ����ֵ��ӳ����ָ���ļ�����
		 *  	ɾ��
		 *  		clear():���ӳ��������ӳ���ϵ
		 *  		value remove(key):�������һ������ӳ���ϵ������Ӵ�ӳ�����Ƴ�
		 *  	�ж�
		 *  		boolean containKey(key)
		 *  		boolean containValue(value)
		 *  		boolean isEmpty()
		 *  	��ȡ
		 *  		value get(key):ͨ��ָ������ȡӳ���ϵ�е�ֵ,���û�иü��򷵻�null
		 *  		int size():��ȡ��ֵ�Ը���
		 *  Map����ʵ����
		 *  	|-- HastTable:�ڲ����ݽṹ�ǹ�ϣ��ͬ������֧��null��
		 *  		|--Properties�������洢��ֵ�����͵������ļ���Ϣ��
		 *  	|-- HashMap���ڲ����ݽṹ�ǹ�ϣ������ͬ���ġ�֧��null��
		 *  		|-- LinkedHashMap �����˼�¼�Ĳ���˳��
		 *  	|-- TreeMap���ڲ����ݽṹ�Ƕ�����������ͬ���ġ����Զ�ӳ���м���������
		 */
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// put
		map.put(2, "aaa");
		map.put(5, "bbb");
		map.put(1, "ccc");
		map.put(7, "ddd");
		map.put(7, "ggg"); // key��ͬʱ��ֵ������
		System.out.println(map);
//		testMap(map);
//		testKeySet(map);
//		testEntrySet(map);
//		testValues(map);

	}
	
	public static void testMap(Map<Integer, String> map) {
		System.out.println(map);
		
		// remove
//		System.out.println(map.remove(7));
//		System.out.println(map);
		
//		// containsKey
//		System.out.println(map.containsKey(5));
//		System.out.println(map.containsKey(9));
//		
//		// containsValue
//		System.out.println(map.containsValue("ddd"));
//		
//		// get
//		System.out.println(map.get(5));
	}
	
	
	public static void testKeySet(Map<Integer, String> map) {
		System.out.println(map);
		// ͨ��keySet��������ȡӳ�������м��ļ��ϡ�
		Set<Integer> keys = map.keySet();
		// ����������
		Iterator<Integer> it = keys.iterator();
		while(it.hasNext()) {
			// ��ȡӡӳ�������еļ�
			Integer key = it.next();
			// ͨ��get������ȡӳ�������е�ֵ
			String value = map.get(key);
			System.out.println(key + ":" + value);
		}
	}
	
	public static void testEntrySet(Map<Integer, String> map) {
		System.out.println(map);
		// ͨ��entrySet��������ȡEntry����ļ��ϣ�Entry���װ��ӳ���еļ�ֵ�ԡ� 
		Set<Map.Entry<Integer, String>> entries = map.entrySet();
		// ��������
		Iterator<Map.Entry<Integer, String>> it = entries.iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
			// ȡ�ü�
			Integer key = entry.getKey();
			// ȡ��ֵ
			String value = entry.getValue();
			System.out.println(key + ":" +value);
		}
		
	}
	
	
	public static void testValues(Map<Integer, String> map) {
		System.out.println(map);
		// ͨ��values������ȡӳ��������ֵ�ļ���
		Collection<String> c = map.values();
		// ��������
		Iterator<String> it = c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
