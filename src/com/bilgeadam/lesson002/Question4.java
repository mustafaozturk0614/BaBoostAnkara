package com.bilgeadam.lesson002;

import java.util.Scanner;

public class Question4 {
//	Çarpim Tablosu, kullanicinin girdigi her hangi bir sayinin çarpim tablosunu çiziniz;
//	örn: 6 girdi
//	6 x 0 = 0
//	6 x 1 = 6
//	6 x 2 = 12
//	6 x 3 = 18
//	6 x 4 = 24
//	6 x 5 = 30
//	6 x 6 = 36
//	6 x 7 = 42
//	6 x 8 = 48
//	6 x 9 = 54

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Bir sayı giriniz ");
		int sayi = scanner.nextInt();

		for (int i = 0; i < 10; i++) {

			System.out.println(sayi + "x" + i + "=" + (sayi * i));

		}
		scanner.close();
	}
}
