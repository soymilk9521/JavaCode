package com.arc.learn.interfacedemo4;

public class InterfaceDemo4 {
	public static void main(String[] args) {
		
	}
}	

/**
 * 1. �ӿڵ��ص㣺
 *  1.1. �ӿ��Ƕ��Ⱪ¶�Ĺ���
 *  1.2. �ӿ��ǳ���Ĺ�����չ
 *  1.3. �ӿڵĳ��ֽ����������
 *  1.4. �ӿڿ���������ʵ��
 * 
 * ���У���׿�ֻ�type-c�ӿڣ�ƻ���ֻ����ӿ�
 * 
 */

/**
 * 
 * ʹ�ñʼǱ�����
 * �ʼǱ�����ʹ�õ������豸��device����
 * 	��ꡢ���̵�
 *
 */
class BookPC {
	
	void useMouse(Mouse m) {
		
	}
	
}

/**
 * 
 * ��꣨mouse��
 *
 */
class Mouse {
	void run() {
		System.out.println("Mouse is running ...");
	}
}

/**
 * 
 * ���̣�USB flash drive��
 *
 */
class UDisc {
	void run() {
		System.out.println("UDisc is running ...");
	}
}

/**
 * 
 * ������꣨wireless mouse��
 *
 */
class WirelessMouse{
	void run() {
		System.out.println("WirelessMouse is running ...");
	}
}