package com.arc.learn.fordemo;

public class ForTest2 {

	public static void main(String[] args) {
		for(int x = 0; x<4; x++) { 
			for(int y = 0; y<5; y ++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 外层循环决定行数
		// 内存循环决定列数
	}

}
