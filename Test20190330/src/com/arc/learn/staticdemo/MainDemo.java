package com.arc.learn.staticdemo;

public class MainDemo {

	public static void main(String[] args) {
		/*
		 * 1. 主函数特殊之处:
		 * 	1.1. 格式固定
		 *  1.2. 被jvm识别调用
		 * 2. 解析：
		 * 	2.1. public：权限必须是最大的
		 * 	2.2. static：不需要对象，直接用主函数所属类名调用即可
		 * 	2.3. void：值函数没有返回值
		 * 	2.4. main：函数名，不是关键字，只是一个jvm识别的固定的名字
		 * 	2.5. String[] args：这是一个参数列表，字符串数组类型参数 
		 * 3. 一个类只能有一个主函数。
		 */
		
		System.out.println(args); // [Ljava.lang.String;@7852e922
		System.out.println(args.length); // 参数长度
		// TODO for循环打印字符串数组内容
		
	}
	
	// TODO 再定义一个主函数。

}
