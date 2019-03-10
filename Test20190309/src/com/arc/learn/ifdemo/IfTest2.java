package com.arc.learn.ifdemo;

public class IfTest2 {

	public static void main(String[] args) {
		/*
		 * if语句实现月份与季节转换：
		 * 12 ~ 2月  ... 冬季
		 * 3 ~ 5月    ... 春季
		 * 6 ~ 8月    ... 夏季
		 * 9~11月    ... 秋季
		 */
		int month = 6;
		if(month >12 || month < 1) {
			System.out.println("不知道");
		}else {
			if(month>=3 && month<=5) {
				System.out.println("春季");
			}else if(month >=6 && month <=8) {
				System.out.println("夏季");
			}else if(month >=9 && month <=11) {
				System.out.println("秋季");
			}else {
				System.out.println("冬季");
			}
		}
	}

}
