package com.arc.learn.demo;

public class Demo {

	public static void main(String[] args) {
//		System.out.println(Byte.MAX_VALUE); // 最大值
//		System.out.println(Byte.MIN_VALUE); // 最小值
//		System.out.println(Byte.BYTES); // 1byte
//		System.out.println(Byte.SIZE); // 二进制位 8bit
//		
//		
//		System.out.println(Long.MAX_VALUE); // 最大值
//		System.out.println(Long.MIN_VALUE); // 最小值
//		System.out.println(Long.BYTES); // 8byte
//		System.out.println(Long.SIZE); //二进制位 64bit
		
//		System.out.println(Byte.valueOf("127")); // 将String类型转为Byte类型
//		System.out.println(Byte.valueOf("128")); // 超过byte最大值
//		System.out.println(Byte.valueOf("aa"));  // 非数字
		
//		testConstructor();
		
//		testCompare();
		
//		testCompare2();
		
//		testInteger();
		
		testCharacter();
	}
	
	public static void testConstructor() {
		Byte b = new Byte((byte)45);
		Byte b2 = new Byte("45");
		Byte b3 = 45; // 自动装箱
		byte b4 = b2; // 自动拆箱
		System.out.println(b.equals(b2)); // true
		System.out.println(b == b2); // false
		
	}
	
	public static void transDemo() {
		Byte b = 50;
		
		// 将Byte类型转换为int， long， String
		int i = b;
		int i2 = b.intValue();
		long l = b.longValue();
		String s = b.toString();
		double d = b.doubleValue();
		float f = b.floatValue();
		
		// 将String 转为Byte类型
		Byte b2 = Byte.parseByte("45");
		Byte b3 = Byte.valueOf("45");
	}
	
	public static void testCompare() {
		byte b1 = 10;
		byte b2 = 10;
		System.out.println(Byte.compare(b1, b2));
	}
	
	public static void testCompare2() {
		Byte b1 = 10;
		Byte b2 = 25;
		System.out.println(b1.compareTo(b2));
	}
	
	public static void testInteger() {
		System.out.println(Integer.toHexString(60)); // 十进制转十六进制
		System.out.println(Integer.toBinaryString(60)); // 十进制转二进制进制
		System.out.println(Integer.toOctalString(60)); // 十进制转八进制进制
		
		System.out.println(Integer.toString(60, 16));
	}
	
	public static void testCharacter() {
		System.out.println(Character.isLetter('a'));
		System.out.println(Character.isLetter('1'));
		
		System.out.println(Character.isDigit('a'));
		System.out.println(Character.isDigit('1'));
	}

}
