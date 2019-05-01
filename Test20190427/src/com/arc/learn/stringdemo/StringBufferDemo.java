package com.arc.learn.stringdemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		/**
		 * StringBuffer字符串缓冲区，用于存储数据的容器，
		 * StringBuffer特点：
		 * 	1. 可以存储任意类型数据。
		 *  2. 可变长度容器。
		 *  3. 最终要转成字符串使用。
		 *  4. 可以对字符串进行修改。
		 * 
		 * 
		 * 1. 添加
		 * 		StringBuffer append(data);
		 * 		StringBuffer insert(int index, data);
		 * 2. 删除
		 * 		StringBuffer delete(start, end);
		 *      StringBuffer deleteCharAt(index);
		 *      StringBuffer setLength(0);
		 * 3. 修改
		 * 		StringBuffer replace(start, end, str);
		 * 		void setCharAt(index, char);
		 * 4. 查找
		 * 		char charAt(index);
		 * 		int indexOf(String str);
		 * 		int lastIndexOf(String str);
		 * 
		 * StringBuffer内部为一个默认长度为16的字符数组。
		 * 
		 * StringBuilder与StringBuffer区别：
		 * 	StringBuffer线程安全，用于多线程，效率较低运行速度慢。
		 *  StringBuilder线程不安全，单一线程时使用，效率高运行速度快。
		 */
		
		
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = sb.append("abc");
		
		System.out.println(sb == sb1);
	}

}
