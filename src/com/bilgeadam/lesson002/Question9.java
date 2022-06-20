package com.bilgeadam.lesson002;

public class Question9 {
//fibonachhi sayılarını yazdıran 
//kod parçacığını yazınız 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ilk 11 tanesi

	public static void main(String[] args) {
		int number1 = 0;
		int number2 = 1;

		for (int i = 0; i < 11; i++) {
			System.out.print(number1 + " ");
			int number3 = number1 + number2;
			number1 = number2;
			number2 = number3;
		}
	}
}
