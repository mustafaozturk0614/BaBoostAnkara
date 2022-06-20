package com.bilgeadam.lesson002;

import java.util.Scanner;

public class Question14 {
//	
//	 * Girilen sayının, kaçıncı Basamak da oluduğu (1ler,10lar,100ler gibi ) o
//	 * basmak daki basamak değerini (1ler basamağı: 5 ,10 lar basmağı :3 gibi)
//	 * yazdıran

	public static void main(String[] args) {

		int valueOfDigits, num, numberOfDigits = 1;

		Scanner scanner = new Scanner(System.in);

		num = scanner.nextInt();

		while (num > 0) {
			valueOfDigits = num % 10;
			num = num / 10;
			System.out.println(numberOfDigits + " ler basamağı=" + valueOfDigits);
			numberOfDigits *= 10;

		}

//		System.out.println(numberOfDigits + "ler basamağı=" + num);

	}

}
