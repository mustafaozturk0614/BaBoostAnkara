package com.bilgeadam.lesson003;

import java.util.Scanner;

public class Question16 {

	// Mükemmel sayı=kendisi hariç pozitif tam bölenlerinin toplamı kendisine eşit
	// olan sayı
	// 6=1+2+3;
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sayac = 1;
		int ms = 0;

		while (n > sayac) {
			if (n % sayac == 0) {
				ms += sayac;
			}
			sayac++;

		}

		if (ms == n) {
			System.out.println(n + " Mükemmel Sayıdır");

		} else {
			System.out.println(n + " Mükemmel sayı değildir");
		}

	}
}
