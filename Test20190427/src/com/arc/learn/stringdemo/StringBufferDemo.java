package com.arc.learn.stringdemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		/**
		 * StringBuffer�ַ��������������ڴ洢���ݵ�������
		 * StringBuffer�ص㣺
		 * 	1. ���Դ洢�����������ݡ�
		 *  2. �ɱ䳤��������
		 *  3. ����Ҫת���ַ���ʹ�á�
		 *  4. ���Զ��ַ��������޸ġ�
		 * 
		 * 
		 * 1. ���
		 * 		StringBuffer append(data);
		 * 		StringBuffer insert(int index, data);
		 * 2. ɾ��
		 * 		StringBuffer delete(start, end);
		 *      StringBuffer deleteCharAt(index);
		 *      StringBuffer setLength(0);
		 * 3. �޸�
		 * 		StringBuffer replace(start, end, str);
		 * 		void setCharAt(index, char);
		 * 4. ����
		 * 		char charAt(index);
		 * 		int indexOf(String str);
		 * 		int lastIndexOf(String str);
		 * 
		 * StringBuffer�ڲ�Ϊһ��Ĭ�ϳ���Ϊ16���ַ����顣
		 * 
		 * StringBuilder��StringBuffer����
		 * 	StringBuffer�̰߳�ȫ�����ڶ��̣߳�Ч�ʽϵ������ٶ�����
		 *  StringBuilder�̲߳���ȫ����һ�߳�ʱʹ�ã�Ч�ʸ������ٶȿ졣
		 */
		
		
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = sb.append("abc");
		
		System.out.println(sb == sb1);
	}

}
