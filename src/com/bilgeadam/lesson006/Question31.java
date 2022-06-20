package com.bilgeadam.lesson006;

import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) {
		// iki kez üst üste aynı sayı klavyeden girilene kadar girilmiş
		// tüm sayıların ortalamasını bulup ekrana yazdıran
		// (girilen aynı sayının sonuncusu işleme alınmayacaktır)

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		double sum = 0;

		double count = 0;

		int number1 = scanner.nextInt();
		count++;

		sum += number1;

		while (true) {
			System.out.println("Lütfen bir sayı daha giriniz");
			int number2 = scanner.nextInt();
			if (number2 == number1) {

				System.out.println("ortl=" + sum / count);
				break;
			} else {
				sum += number2;
				count++;
				number1 = number2;
			}

		}

	}

}
