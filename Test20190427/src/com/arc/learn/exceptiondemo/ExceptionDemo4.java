package com.arc.learn.exceptiondemo;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		/**
		 * 1. �쳣��׽
		 * 	1.1. �쳣��׽�Ƕ��쳣��������Դ���ķ�ʽ
		 *  1.2. ��ʽ��
		 *     try {
		 *     	 // ��Ҫ����쳣�Ĵ���
		 *     }catch(�쳣�� ����) { // �������ڽ��շ������쳣���� ���൱�� �쳣�� ���� = new �쳣�ࣨ����
		 *       // �����쳣����
		 *       // ����.printStackTrace()�� JVMĬ�ϵ��ø÷���
		 *     }finally {
		 *       // ���һ����ִ�еĴ���
		 *       // һ�����ڹر���Դ
		 *     }
		 *     
		 *  2. ��ͼ����쳣��׽���й��̡�   
		 *  
		 *  3. ��catch�����ʾ��
		 *    3.1. �׳������쳣���󣬾�catch������
		 *    3.2. ��catch���ע�⣺����catch���������
		 *    
		 *  4. try catch finally��ϣ�
		 * 	  4.1. try catch finally
		 *    4.2. try catch(���) ��û�б�Ҫ��Դ�ͷ�ʱ�����Բ��ö���finally
		 *    4.3. try finally
		 */
		int[] arr = new int[3];
		
		
		ArrayTest at = new ArrayTest();
		
		try {
			at.getNumberByIndex(arr, 10);
		} catch (MinusNumberException e) { // MinusNumberException e = new MinusNumberException();
			System.out.println(e.getMessage());
//			e.printStackTrace();
		} catch (NullPointerException e) { //
			System.out.println(e.getMessage());
			//e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {//
//			System.exit(0);
			e.printStackTrace();
		} catch (Exception e) {
			
		}finally {
			System.out.println("finally is running...");
		}
		
		
	}

}

class ArrayTest {
	public int getNumberByIndex(int[] arr, int index) throws MinusNumberException {
		if (arr == null) {
			throw new NullPointerException("���鲻��Ϊ�ա�");
		}
		if (index >= arr.length) {
			throw new ArrayIndexOutOfBoundsException("��������Խ���ˡ�");
		}
		if (index < 0) {
			throw new MinusNumberException("������������Ϊ������");
		}
		return arr[index];
	}
}
