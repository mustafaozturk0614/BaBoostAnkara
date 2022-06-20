package com.bilgeadam.lesson002;

public class Question5 {
//	birden 10 a kadar olan sayılardan her sayı ve bir fazlası sayının toplamını
//	 ekrana yazdıran program 

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i < 10; i++) {
			sum = i + (i + 1);
		}

		System.out.println("toplam= " + sum);
	}
}
