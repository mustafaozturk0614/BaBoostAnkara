package com.bilgeadam.lesson003;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		// Klavyeden girilen 0 ile 100 arasında 100 dahil
		// 5 adet sayıdan en büyük ve en küçük olanı bulup ekrana yazan programın kod
		// parçacığı
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int num;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		while (i < 5) {
			System.out.println("Bir sayı giriniz");
			num = scanner.nextInt();

			if (num <= 100 && num >= 0) {
				if (num > max) {
					max = num;

				}
				if (num < min) {
					min = num;
				}
				i++;

			} else {
				System.out.println("Sayı yanlış aralıkta tekrar giriniz");
			}

		}
		System.out.println("max= " + max);
		System.out.println("min= " + min);

	}

}
