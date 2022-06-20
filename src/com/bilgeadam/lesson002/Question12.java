package com.bilgeadam.lesson002;

import java.util.Scanner;

public class Question12 {

	/*
	 * 1- dışarıdan girdiğimiz bir sayının Asal sayı olup olmadığını kontrol eden
	 * kod
	 * 
	 *
	 * 
	 */

	public static void main(String[] args) {
		System.out.println("Bir sayı giriniz");
		Scanner scanner = new Scanner(System.in);

		long num = scanner.nextLong();
		boolean isPrimeNumber = true;

		if (num < 2) {
			isPrimeNumber = false;

		} else {

			for (long i = 2; i <= Math.sqrt(num); i++) {

				if (num % i == 0) {
					isPrimeNumber = false;
					break;
				}
			}
		}
		if (isPrimeNumber) {
			System.out.println("Girdiniz sayı asal sayıdır");

		} else {
			System.out.println("Girdiniz sayı asal sayı değildir");
		}
	}

}
