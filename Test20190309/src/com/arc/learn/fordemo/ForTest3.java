package com.arc.learn.fordemo;

public class ForTest3 {

	public static void main(String[] args) {
		
		/*
		 
		 *****
		 ****
		 ***
		 **
		 *
		 
		 */
		for(int x = 1; x<=5; x++) { //1~5, 2~5, 3~5..
			for(int y = x; y<=5; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-------");
		
		int z = 5;
		for(int x = 1; x<=5; x++) { //1~5, 1~4, 1~3...
			for(int y = 1; y<=z; y++) {
				System.out.print("$");
			}
			z--;
			System.out.println();
		}
		
	}

}
