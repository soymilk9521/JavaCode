package com.arc.learn.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class TestArrayList2 {

	public static void main(String[] args) {
		// ��ϰ��ȥ��ArrayList�е��ظ�Ԫ��
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
//		alList.remove(new Person("Green", 20)); // �����¶���
//		System.out.println(alList);
		
		
	}
	
	public static ArrayList distinctArrayList(ArrayList al) {
		// ����һ����ʱ����
		ArrayList temp = new ArrayList<>();
		// ����
		Iterator it = al.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			// �ж��Ƿ����Ԫ�أ�contains��������equals�����Ƚϵ��������Ƿ����
			// ���Ʒ���remove()
			if(!temp.contains(obj)){// it.next()
				temp.add(obj);      // it.next()
			}
		}
		return temp;
	}

}
