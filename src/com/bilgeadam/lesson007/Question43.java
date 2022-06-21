package com.bilgeadam.lesson007;

import java.util.Scanner;

public class Question43 {

	// Dışardan kaç sayı gireceksiniz 2 ,3
	// iki tane toplama metodu eğer 2 sayı birtanseini çalıştırısın eğer
	// 3 sayı girmisse diğerini çalıştırsın.
//	yazdır("MErhaba");
//	yazdır(5, "defa");
//	yazdır("Merhaba", "Dünya");
//
//}
//
//public static void yazdır(String a) {
//	System.out.println(a);
//
//}
//
//public static void yazdır(String a, String b) {
//	System.out.println(a + "-" + b);
//}
//
//public static void yazdır(int a, String b) {
//	System.out.println(a + "-" + b);
//}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int sayi1, sayi2, sayi3, sayiAdedi;
		System.out.println("Lütfen sayı adedini giiniz");
		sayiAdedi = scanner.nextInt();

		if (sayiAdedi == 2) {

			topla();

		} else if (sayiAdedi == 3) {
			System.out.println("Lütfen 1.sayıyı giriniz");
			sayi1 = scanner.nextInt();
			System.out.println("Lütfen 2. sayıyı giriniz");
			sayi2 = scanner.nextInt();
			System.out.println("Lütfen 3. sayıyı giriniz");
			sayi3 = scanner.nextInt();
			System.out.println(topla(sayi1, sayi2, sayi3));
			;
		}

	}

	public static int topla() {

		int sayi1, sayi2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen 1.sayıyı giriniz");
		sayi1 = scanner.nextInt();
		System.out.println("Lütfen 2. sayıyı giriniz");
		sayi2 = scanner.nextInt();

		return sayi1 + sayi2;

	}

	public static int topla(int sayi1, int sayi2, int sayi3) {

		return sayi1 + sayi2 + sayi3;

	}

}