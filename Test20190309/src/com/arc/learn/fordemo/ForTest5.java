package com.arc.learn.fordemo;

public class ForTest5 {

	public static void main(String[] args) {
		
		/*
		 
		 1*1
		 1*2 2*2 
		 1*3 2*3 3*3
		 ...
		 1*9 2*9 3*9 ... 9*9
		 
		 */
		for(int x = 1; x<=9; x++) { 
			for(int y = 1; y<=x; y++) {
				System.out.print(y + "*" +x +"="+ x*y +"\t");
			}
			System.out.println();
		}
		

		System.out.println("hello\tworld");
		System.out.println("hello\r\nworld");
		
		//hello	world
		//hello
		//world
	}

}
