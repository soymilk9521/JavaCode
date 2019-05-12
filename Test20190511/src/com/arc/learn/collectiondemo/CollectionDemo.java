package com.arc.learn.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		/**
		 * ������
		 * 	1. ���飺�洢��ͬԪ�ص�һ�����ݵļ���
		 *  2. StringBuilder��StringBuffer�����Դ���������Ԫ�أ�����תΪ�ַ������͡�
		 *  3. ���󣺽����Ժ���Ϊ��װ������
		 *  
		 * �����ص㣺
		 *  1. �������ڴ洢���������
		 *  2. ���ϵĳ����ǿɱ��
		 *  3. ���ϲ��ܴ洢������������
		 *  
		 * Collection�ӿڳ�������
		 * 	1. ��� 
		 * 		boolean add(Object object);
		 * 		boolean addAll(Collection c);
		 *  2. ɾ��
		 *      boolean remove(Object object);
		 *      boolean removeAll(Collection c);
		 *      void clear();
		 *  3. �ж�
		 *  	boolean contains(Object object);
		 *  	boolean containAll(Collection c);
		 *  	boolean isEmpty();
		 *  4. ��ȡ
		 *  	int size();
		 *  	Iterator iterator()��������
		 *  5. ����
		 *  	boolean retainAll(collection c):ȡ����
		 *  	Object[] toArray();
		 *  
		 * 
		 */
		Collection<String> c = new ArrayList<>();
		Collection<String> c2 = new ArrayList<>();
//		show(c);
		show(c,c2);
		
	}
	
	public static void show(Collection<String> c) {
		c.add("abc");
		c.add("def");
		c.add("ghi");
		Collection<String> sub = new ArrayList<>();
		sub.add("123");
		sub.add("345");
		sub.add("456");
		c.addAll(sub);
		System.out.println(c); // AbstractCollection#toString()
		
		// contains
		System.out.println(c.contains("abc"));
		
		// remove
		c.remove("abc");
		System.out.println(c);
		
		System.out.println(c.contains("abc"));
		
		c.removeAll(sub);
		System.out.println(c);
		
		System.out.println(c.isEmpty());
		
		System.out.println(c.size());
		
//		
//		// clear
//		c.clear();
//		System.out.println(c);
	}
	
	public static void show(Collection c1 , Collection c2) {
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");
		
		c2.add("abc1");
		c2.add("abc2");
		c2.add("bcd3");
		c2.add("bcd4");
//		System.out.println(c1);
		
		// addAll
//		c1.addAll(c2);
//		System.out.println(c1);
		
		// containsAll
		boolean flg = c1.containsAll(c2);
		System.out.println(flg);
		
		// retainAll
		c1.retainAll(c2);
		System.out.println(c1);
		
		// removeAll
		c1.removeAll(c2);
		System.out.println(c1);
		
		
	}

}
