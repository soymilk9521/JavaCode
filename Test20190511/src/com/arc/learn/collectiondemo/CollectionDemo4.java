package com.arc.learn.collectiondemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class CollectionDemo4 {
	public static void main(String[] args) {
		/**
		 * List
		 * 	|--Vector���ڲ�������ṹ����ͬ����
		 * 		���
		 * 			addElement(Object obj)
		 * 			insertElementAt(Object obj, int index)
		 * 		��ȡ
		 * 			capacity()����ȡ��ǰ����
		 * 			elementAt(int index):��ȡָ������Ԫ��
		 * 			elements()������һ��ö���ࣨEnumeration�൱��Iterator���Ƽ�ʹ��Iterator��
		 * 			firstElement()
		 * 			lastElement()
		 * 		ɾ��
		 * 			removeAllElements() 
		 * 			 
		 *  |--ArrayList���ڲ�������ӿڣ�����ͬ���ģ���ѯ�ٶȿ졣
		 *  |--LinkedList���ڲ�������ṹ������ͬ���ģ���ɾԪ���ٶȿ졣
		 *  	���
		 *  		addFirst()
		 *  		addLast()
		 *      ��ȡ
		 *      	getFirst()����ȡ�����е�һ��Ԫ�أ��������û�����������쳣
		 *      	peekFirst():��ȡ�����Ƴ������е�һ��Ԫ�أ��������û�������򷵻�null
		 *      	pollFirst():��ȡ���Ƴ������е�һ��Ԫ�أ��������û�������򷵻�null
		 *      	getLast()����ȡ���������һ��Ԫ�أ��������û�����������쳣
		 *      	peekLast()����ȡ�����Ƴ����������һ��Ԫ�أ��������û�������򷵻�null
		 *      	pollLast():��ȡ���Ƴ����������һ��Ԫ�أ��������û�������򷵻�null
		 *      ɾ��
		 *      	removeFirst()
		 *      	removeLast()
		 */
		
		testAddFirst();
//		testVector();
		
	}
	
	public static void testVector() {
		Vector v = new Vector();
		v.addElement("abc1");
		v.addElement("abc2");
		v.addElement("abc3");
		v.addElement("abc4");
		// �ɣ�Enumeration�൱��Iterator���Ƽ�ʹ��Iterator
		Enumeration en =  v.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		// ��
		Iterator it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public static void testAddFirst() {
		LinkedList<String> ll = new LinkedList<>();
		// addFirst
		ll.addFirst("abc1");
		ll.addFirst("abc2");
		ll.addFirst("abc3");
		ll.addFirst("abc4");
		System.out.println(ll);
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		// getFirst
//		ll = new LinkedList<>();
		System.out.println(ll.getFirst()); // ��ȡ�����е�һ��Ԫ�أ�����ɾ��,���������û�����ݲ��׳��쳣
//		
//		// removeFirst
		System.out.println(ll.removeFirst()); // ��ȡ��һ��Ԫ�ز�ɾ����
		System.out.println(ll);
//		
//		// isEmpty
		while(!ll.isEmpty()) {
			System.out.println(ll.removeFirst());
		}
//		System.out.println(ll);
		
		
	}
	
	
}
