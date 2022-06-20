package com.bilgeadam.lesson002;

public class Question3 {

//	* * * * * 
//	*       * 
//	*       * 
//	*       * 
//	* * * * * 

	public static void main(String[] args) {

		int n = 7;
		String karater = "*";

		for (int i = 1; i <= (n * n); i++) {

			if (i <= n || i > n * (n - 1) || i % n == 1 || i % n == 0) {
				System.out.print(karater + " ");

			} else {
				System.out.print("  ");

			}
			if (i % n == 0) {
				System.out.println();
			}

		}

	}

}
