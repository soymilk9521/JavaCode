package com.arc.learn.array2demo;

public class ArrayTest {

	public static void main(String[] args) {
		int[][] arr = {{3, 5, 6, 12,9}, {6, 19, 90}, {12, 3, 99, 10}};
		int[][] arr2 = new int[3][];
		int[][] arr3 = null;
	}
	
	/**
	 * ���󣺴�ӡ��ά�������һ��һά�����е����һ��Ԫ��ֵ
	 * ��ȷ�����б� һ����ά����
	 * ��ȷ����ֵ��  void
	 * @param arr
	 */
	public static void printLastValue(int[][] arr) {
		// 1.����һ��������ʾ��ά���鳤��

		// 2.����һ��һά�������

		// 3. �пմ���

		// 4.��ӡԪ��ֵ
	}
	
	/**
	 * ���󣺴�ӡ��ά��������Ԫ��
	 * ��ʽ���£� [3, 5, 6, 12, 9, 6, 19, 90, 12, 3, 99, 10] 
	 * ��ȷ�����б� һ����ά����
	 * ��ȷ����ֵ�� void
	 * @param arr
	 */
	public static void printAllValue(int[][] arr) {
		// TODO �пմ���
		
		System.out.print("[");
		// ѭ��Ƕ�״�ӡ����Ԫ������
		for (int i = 0; i < arr.length; i++) {
			// TODO �пմ���
			for (int j = 0; j < arr[i].length; j++) {
				// TODO ȥ�����һ������
				System.out.print(arr[i][j] + ", ");
			}
		}
		System.out.println("]");
	}
	
	/**
	 * ���� ��int���Ͷ�ά����������Ԫ�صĺ�
	 * ��ȷ�����б� һ����ά����
	 * ��ȷ����ֵ�� int
	 * @param arr
	 * @return
	 */
	public static int sum(int[][] arr) {
		// TODO �пմ���
		// ��ά����������Ԫ�صĺ�
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			// TODO �пմ���
			for (int j = 0; j < arr[i].length; j++) {
				// TODO ��ʹ���
				System.out.println(arr[i][j]);
			}
		}
		return sum;
	}

}
