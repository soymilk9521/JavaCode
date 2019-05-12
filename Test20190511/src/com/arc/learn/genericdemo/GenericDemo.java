package com.arc.learn.genericdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {

	public static void main(String[] args) {
		
		/**
		 * 泛型：Java1.5出现的一种安全机制
		 * 	好处： 编译期检查类型
		 * 		 运行期降低类型转换异常
		 *  什么时候使用？
		 * 
		 */
		
		// TODO 添加泛型
		ArrayList al = new ArrayList();
		al.add("abc1");
		al.add("abc2");
		al.add("abc3");
//		al.add(new Integer(1));
		Iterator it = al.iterator();
		while(it.hasNext()) {
			String str = (String)it.next();
			System.out.println(str);
		}
		
	}

}
