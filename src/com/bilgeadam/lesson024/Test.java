package com.bilgeadam.lesson024;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		eksiDegerKontolu2();

		try {
			eksiDegerKontolu1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private static void eksiDegerKontolu1() {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("Lütfen bir sayı giriniz");
			int sayi = scanner.nextInt();
			if (sayi < 0) {

				throw new EksiDegerException("Deger sıfırdan küçük olamaz");

			}

		}
	}

	private static void eksiDegerKontolu2() {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("Lütfen bir sayı giriniz");
			int sayi = scanner.nextInt();
			if (sayi < 0) {
				try {
					throw new EksiDegerException("Deger sıfırdan küçük olamaz");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			}

		}
	}
}
