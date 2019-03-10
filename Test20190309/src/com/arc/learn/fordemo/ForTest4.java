package com.arc.learn.fordemo;

public class ForTest4 {

	public static void main(String[] args) {
		
		/*
		 
		 *
		 **
		 ***
		 ****
		 *****
		 
		 */
		for(int x = 1; x<=5; x++) { 
			for(int y = 1; y<=x; y++) { //1~1, 1~2, 1~3 ..
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-------");
		
		/*
		 
		 54321
		 5432
		 543
		 54
		 5
		 
		 */
		for(int x = 1; x<=5; x++) { 
			for(int y = 5; y>=x; y--) {
				System.out.print(y);
			}
			System.out.println();
		}
		
		System.out.println("-------");
		
		/*
		 
		 1
		 22
		 333
		 4444
		 55555
		 
		 */
		
		for(int x = 1; x<=5; x++) { 
			for(int y = 1; y<=x; y++) {
				System.out.print(x);
			}
			System.out.println();
		}
		
	}

}
