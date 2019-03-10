package com.arc.learn.ifdemo;

public class IfTest {

	public static void main(String[] args) {
		/*if语句实现数字转星期
		 1 ... 星期一
		 2 ... 星期二
		 3 ... 星期三
		 4 ... 星期四
		 5 ... 星期五
		 6 ... 星期六
		 7 ... 星期日*/
		int x = 9;
		if(x == 1) {
			System.out.println("星期一");
		}else if(x == 2) {
			System.out.println("星期二");
		}else if(x == 3) {
			System.out.println("星期三");
		}else if(x == 4) {
			System.out.println("星期四");
		}else if(x == 5) {
			System.out.println("星期五");
		}else if(x == 6) {
			System.out.println("星期六");
		}else if(x == 7) {
			System.out.println("星期日");
		}else {
			System.out.println("不知道");
		}
		 
	}

}
