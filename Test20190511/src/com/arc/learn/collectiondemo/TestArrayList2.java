package com.arc.learn.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class TestArrayList2 {

	public static void main(String[] args) {
		// 练习：去除ArrayList中的重复元素
		ArrayList al = new ArrayList<>();
		al.add("abc");
		al.add("abc2");
		al.add("abc");
		al.add("abc2");
		al.add("abc3");
		System.out.println(al);
		ArrayList arr = distinctArrayList(al);
		System.out.println(arr);
		
		
		ArrayList alList = new ArrayList<>();
		alList.add(new Person("Tom", 20));
		alList.add(new Person("Green", 21));
		alList.add(new Person("Tom", 20));
		alList.add(new Person("Green", 20));
		System.out.println(alList);
//		arr = distinctArrayList(alList);
//		System.out.println(arr);
//		alList.remove(new Person("Green", 20)); // 创建新对象
//		System.out.println(alList);
		
		
	}
	
	public static ArrayList distinctArrayList(ArrayList al) {
		// 定义一个临时容器
		ArrayList temp = new ArrayList<>();
		// 迭代
		Iterator it = al.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			// 判断是否包含元素，contains方法调用equals方法比较的是内容是否相等
			// 类似方法remove()
			if(!temp.contains(obj)){// it.next()
				temp.add(obj);      // it.next()
			}
		}
		return temp;
	}

}
