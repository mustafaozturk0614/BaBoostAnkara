package com.bilgeadam.lesson007;

import java.util.Scanner;

public class Question42 {

	public static void main(String[] args) {
		// Obeb Okek ;
		// sayi1 sayi 2
		// obeb(sayi1,sayi2)

		// okek=sayi1*sayi2/obeb;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen 1. sayıı giriniz");
		int sayi1 = scanner.nextInt();
		System.out.println("Lütfen 2. sayıı giriniz");
		int sayi2 = scanner.nextInt();
		int ekok = (sayi1 * sayi2) / ebob(sayi1, sayi2);

		System.out.println("ekok= " + ekok);

	}

	public static int ebob(int sayi1, int sayi2) {
		int ebob = 1;
		int count;

		if (sayi2 > sayi1) {

			count = sayi1;
		} else {
			count = sayi2;
		}

		while (count > 0) {
			if (sayi1 % count == 0 && sayi2 % count == 0) {
				ebob = count;
				break;
			}
			count--;

		}

		System.out.println(sayi1 + " ile " + sayi2 + " ebobu= " + ebob);

		return ebob;

	}

}
