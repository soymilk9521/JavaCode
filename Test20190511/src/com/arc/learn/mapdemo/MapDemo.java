package com.arc.learn.mapdemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		/**
		 * Map集合中储存的是键值对。
		 * Map集合必须保证建的唯一性。
		 *  常用方法
		 *  	添加
		 *  		put(key, value):将指定的值与映射中指定的键关联
		 *  	删除
		 *  		clear():清空映射中所有映射关系
		 *  		value remove(key):如果存在一个键的映射关系，则将其从此映射中移除
		 *  	判断
		 *  		boolean containKey(key)
		 *  		boolean containValue(value)
		 *  		boolean isEmpty()
		 *  	获取
		 *  		value get(key):通过指定键获取映射关系中的值,如果没有该键则返回null
		 *  		int size():获取键值对个数
		 *  Map常见实现类
		 *  	|-- HastTable:内部数据结构是哈希表，同步。不支持null键
		 *  		|--Properties：用来存储键值对类型的配置文件信息。
		 *  	|-- HashMap：内部数据结构是哈希表，不是同步的。支持null键
		 *  		|-- LinkedHashMap 保存了记录的插入顺序
		 *  	|-- TreeMap：内部数据结构是二叉树，不是同步的。可以对映射中键进行排序
		 */
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// put
		map.put(2, "aaa");
		map.put(5, "bbb");
		map.put(1, "ccc");
		map.put(7, "ddd");
		map.put(7, "ggg"); // key相同时，值被覆盖
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
		// 通过keySet方法，获取映射中所有键的集合。
		Set<Integer> keys = map.keySet();
		// 迭代键集合
		Iterator<Integer> it = keys.iterator();
		while(it.hasNext()) {
			// 获取印映射中所有的键
			Integer key = it.next();
			// 通过get方法获取映射中所有的值
			String value = map.get(key);
			System.out.println(key + ":" + value);
		}
	}
	
	public static void testEntrySet(Map<Integer, String> map) {
		System.out.println(map);
		// 通过entrySet方法，获取Entry对象的集合，Entry类封装了映射中的键值对。 
		Set<Map.Entry<Integer, String>> entries = map.entrySet();
		// 迭代集合
		Iterator<Map.Entry<Integer, String>> it = entries.iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
			// 取得键
			Integer key = entry.getKey();
			// 取得值
			String value = entry.getValue();
			System.out.println(key + ":" +value);
		}
		
	}
	
	
	public static void testValues(Map<Integer, String> map) {
		System.out.println(map);
		// 通过values方法获取映射中所有值的集合
		Collection<String> c = map.values();
		// 迭代集合
		Iterator<String> it = c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
