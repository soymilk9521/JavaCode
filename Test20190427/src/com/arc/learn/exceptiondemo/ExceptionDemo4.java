package com.arc.learn.exceptiondemo;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		/**
		 * 1. 异常捕捉
		 * 	1.1. 异常捕捉是对异常进行针对性处理的方式
		 *  1.2. 格式：
		 *     try {
		 *     	 // 需要检测异常的代码
		 *     }catch(异常类 变量) { // 变量用于接收发生的异常对象 ，相当于 异常类 变量 = new 异常类（）；
		 *       // 处理异常代码
		 *       // 变量.printStackTrace()， JVM默认调用该方法
		 *     }finally {
		 *       // 最后一定会执行的代码
		 *       // 一般用于关闭资源
		 *     }
		 *     
		 *  2. 画图理解异常捕捉运行过程。   
		 *  
		 *  3. 多catch语句演示。
		 *    3.1. 抛出几个异常对象，就catch几个。
		 *    3.2. 多catch语句注意：父类catch语句放在最后。
		 *    
		 *  4. try catch finally组合：
		 * 	  4.1. try catch finally
		 *    4.2. try catch(多个) 当没有必要资源释放时，可以不用定义finally
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
			throw new NullPointerException("数组不能为空。");
		}
		if (index >= arr.length) {
			throw new ArrayIndexOutOfBoundsException("数组索引越界了。");
		}
		if (index < 0) {
			throw new MinusNumberException("数组索引不能为负数。");
		}
		return arr[index];
	}
}
