package com.arc.learn.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionDemo3 {

	public static void main(String[] args) {
		/**
		 * Collection�ӿ�
		 * 	-List�ӿڣ����򣨱���Ԫ�ش���ʱ��˳�򣩣������ظ���Ԫ�����ݿ����ظ�����Ԫ�ض�������
		 * 		����������CURD
		 * 			��ӣ�
		 * 				void add(Object e);
		 * 				void add(int index, Object e);
		 * 				void addAll(Collection c);
		 * 				void addAll(int index, Collection c);
		 * 			ɾ����
		 * 				remove(int index);
		 * 				remove(Object e);
		 * 			�޸ģ�
		 * 				set(int index, Object e);
		 * 			��ȡ��
		 * 				Object get(int index);
		 * 				int indexOf(Object e);
		 * 				int lastIndexOf(Object e);
		 * 				List subList(int from, int to);
		 * 			�����޸Ĵ���java.util.ConcurrentModificationException
		 *  -Set�ӿ� ��Ԫ�����򣬲������ظ�
		 *    
		 *  
		 *  
		 */
		
//		showList();
		
		List l = new ArrayList();
		l.add("abc1");
		l.add("abc2");
		l.add("abc3");
		l.add("abc4");
//		iteratorList(l);
//		forList(l);
//		conCurrentModification(l);
		listIteratordemo(l);
	}

	private static void showList() {
		List<String> l = new ArrayList<String>();
		// add, addAll
		l.add("abc1");
		l.add("abc1");
		l.add("abc3");
		l.add(1, "abc4");
//		System.out.println(l);
//		l.addAll(l);
//		System.out.println(l);
//		l.addAll(1, l);
//		System.out.println(l);

//		// remove 
//		l.remove("abc1"); // ����ͬԪ�ص�ʱ��ֻɾ����һ��Ԫ�أ�
//		Iterator<String> iterator = l.iterator();
//		ListIterator<String> it = l.listIterator();
//		while(it.hasNext()) {
//			String str = it.next();
//			if ("abc1".equals(str)) {
//				it.remove();   // ���õ��ǵ�������ɾ������
//				l.remove(str); // ѭ�������в��ܶ����������ӣ�ɾ�����޸�
//			}
//		}
		
//		System.out.println(l);
//		l.remove(7);
		System.out.println(l);
//		
//		// set
//		l.set(0, "999");
		System.out.println(l);
//		
//		// indexOf, lastIndexOf
//		int f = l.indexOf("abc1");
//		System.out.println(f);
//		int t = l.lastIndexOf("abc1");
//		System.out.println(t);
		
		System.out.println(l.get(l.size()-1));
//		
//		// subList
		List<String> sub = l.subList(0, 3);
		System.out.println(sub);
		
		Object[] objs = l.toArray();
		
	}
	
	public static void iteratorList(List l) {
		Iterator it = l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void forList(List l) {
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
	}
	
	public static void conCurrentModification(List l) {
		// �ڵ��������в�Ҫʹ�ü��ϵķ�������Ԫ�أ������java.util.ConcurrentModificationException�쳣
		// ����ʹ��Iterator�ӿڵ��ӽӿ�ListIterator������ڵ��������ж�Ԫ�صĲ�����
		Iterator it = l.iterator();
		while (it.hasNext()) {
			Object object = it.next();
			if("abc1".equals(object)) {
				l.add("999"); 
			}else {
				System.out.println(object.toString());
			}
		}
	}
	
	public static void listIteratordemo(List l) {
		// ListIterator�����ڼ��ϱ��������ж�Ԫ�ؽ�����ɾ�Ĳ�
		ListIterator lit = l.listIterator(); 
		while (lit.hasNext()) {
			Object object = lit.next();
			if("abc1".equals(object)) {
				lit.add("999"); 
			}else {
				System.out.println(object.toString());
			}
			
		}
		System.out.println(l);
	}
	
	
	

}
