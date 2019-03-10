package com.arc.learn.arraydemo;

public class ArrayTest3 {

	public static void main(String[] args) {
		String str = getWeek(2);
		System.out.println(str);
	}
	
	/**
	 * 星期转换
	 */
	
	public static String getWeek(int num) {
		if(num > 7 || num <0) {
			System.out.println("输入错误");
		}
		String[] weeks = new String[] {"","星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"};
		return weeks[num];
	}

}
