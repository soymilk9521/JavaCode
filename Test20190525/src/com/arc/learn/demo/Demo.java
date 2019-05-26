package com.arc.learn.demo;

public class Demo {

	public static void main(String[] args) {
//		System.out.println(Byte.MAX_VALUE); // ���ֵ
//		System.out.println(Byte.MIN_VALUE); // ��Сֵ
//		System.out.println(Byte.BYTES); // 1byte
//		System.out.println(Byte.SIZE); // ������λ 8bit
//		
//		
//		System.out.println(Long.MAX_VALUE); // ���ֵ
//		System.out.println(Long.MIN_VALUE); // ��Сֵ
//		System.out.println(Long.BYTES); // 8byte
//		System.out.println(Long.SIZE); //������λ 64bit
		
//		System.out.println(Byte.valueOf("127")); // ��String����תΪByte����
//		System.out.println(Byte.valueOf("128")); // ����byte���ֵ
//		System.out.println(Byte.valueOf("aa"));  // ������
		
//		testConstructor();
		
//		testCompare();
		
//		testCompare2();
		
//		testInteger();
		
		testCharacter();
	}
	
	public static void testConstructor() {
		Byte b = new Byte((byte)45);
		Byte b2 = new Byte("45");
		Byte b3 = 45; // �Զ�װ��
		byte b4 = b2; // �Զ�����
		System.out.println(b.equals(b2)); // true
		System.out.println(b == b2); // false
		
	}
	
	public static void transDemo() {
		Byte b = 50;
		
		// ��Byte����ת��Ϊint�� long�� String
		int i = b;
		int i2 = b.intValue();
		long l = b.longValue();
		String s = b.toString();
		double d = b.doubleValue();
		float f = b.floatValue();
		
		// ��String תΪByte����
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
		System.out.println(Integer.toHexString(60)); // ʮ����תʮ������
		System.out.println(Integer.toBinaryString(60)); // ʮ����ת�����ƽ���
		System.out.println(Integer.toOctalString(60)); // ʮ����ת�˽��ƽ���
		
		System.out.println(Integer.toString(60, 16));
	}
	
	public static void testCharacter() {
		System.out.println(Character.isLetter('a'));
		System.out.println(Character.isLetter('1'));
		
		System.out.println(Character.isDigit('a'));
		System.out.println(Character.isDigit('1'));
	}

}
