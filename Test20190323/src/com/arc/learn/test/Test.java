package com.arc.learn.test;

public class Test {

	public static void main(String[] args) {
		/**
		 * 8�л����������ͣ�
		 * 	���ͣ�byte short int long�� Ĭ��ʹ��int����
		 * 	������:float double��Ĭ��ʹ��double����
		 * 	�ַ��ͣ� char
		 * 	�����ͣ� boolean
		 */
		

//		short s1 = 1; 
//		short s2 = s1 + 1;

//		short s1 = 1;
//		short s2 = 2;
//		short s3 = s1 + s2;
		
//		byte b1 = 1;
//		short s1 = 2;
//		short s2 = b1 + s1;
//		i + 1 < i
//		System.out.println(getValue2(4));
		int re = FirstFactorial(4);
		System.out.println(re);
	}
	
	public static int getValue(int i) {
	    int result = 0;
	    switch (i) {
	    case 1:
	        result = result + i;
	    case 2:
	        result = result + i * 2;
	    case 3:
	        result = result + i * 3;
	    }
	    return result;
	}
	
	public static int FirstFactorial(int num) {
		for(int i= num-1; i>0; i--) {
			num*=i;
		}
		return num;
	}
	
	public static int FirstFactorial2(int num) {
        return (num == 1 ? 1 : num * FirstFactorial(num - 1));
    }

}
