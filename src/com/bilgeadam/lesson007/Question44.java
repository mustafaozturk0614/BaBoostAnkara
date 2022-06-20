package com.bilgeadam.lesson007;

import java.util.Scanner;

public class Question44 {
	/*
	 * 
	 * System.out.println("==Hesap makinesi===\n"); System.out.println("1- Topla");
	 * System.out.println("2- Çıkar"); System.out.println("3- Çarp");
	 * System.out.println("4- Böl"); System.out.println("0- Çıkış");
	 * System.out.println("Bir işlem Seçiniz");
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		//
		Scanner scanner = new Scanner(System.in);
		int input = 0;

		do {
			System.out.println("==Hesap makinesi===\n");
			System.out.println("1- Topla");
			System.out.println("2- Çıkar");
			System.out.println("3- Çarp");
			System.out.println("4- Böl");
			System.out.println("5- Faktöriyel");
			System.out.println("6- Üs heseaplama");
			System.out.println("7- Asal Kontrolü");
			System.out.println("0- Çıkış");
			System.out.println("Bir işlem Seçiniz");
			input = scanner.nextInt();
			switch (input) {
			case 1:
				topla();
				break;
			case 2:
				cıkar();
				break;

			case 0:
				System.out.println("Güle Güle ...");
				break;

			default:
				break;
			}

		} while (input != 0);

	}

	private static void cıkar() {
		Scanner scanner = new Scanner(System.in);
		String input = "";
		int sayı;
		int count = 0;
		int toplam = 0;
		do {

			System.out.println("Lütfen Bir sayı giriniz");
			sayı = scanner.nextInt();
			count++;
			scanner.nextLine();
			if (count == 1) {
				toplam = sayı;
			} else {
				toplam -= sayı;

			}
			System.out.println(
					"İşlemi sonlandırmak için = tuşuna basın devam etmek için herhangi bir tuşa basabilirsiniz");

			input = scanner.nextLine();

		} while (!input.equals("="));
		System.out.println("toplam=" + toplam);
	}

	public static void topla() {
		Scanner scanner = new Scanner(System.in);
		String input = "";
		int sayı;
		int toplam = 0;

		do {

			System.out.println("Lütfen Bir sayı giriniz");
			sayı = scanner.nextInt();
			scanner.nextLine();
			toplam += sayı;
			System.out.println(
					"İşlemi sonlandırmak için = tuşuna basın devam etmek için herhangi bir tuşa basabilirsiniz");

			input = scanner.nextLine();
		} while (!input.equals("="));
		System.out.println("toplam=" + toplam);
	}

}
