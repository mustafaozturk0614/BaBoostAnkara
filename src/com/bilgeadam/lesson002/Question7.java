package com.bilgeadam.lesson002;

import java.util.Scanner;

public class Question7 {
//Girilen rakamın basamakları toplamı

	public static void main(String[] args) {
		//

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		int n = scanner.nextInt();
		int k = 0;
		int sum = 0;

		do {
			k = n % 10;
			n = n / 10;// toplam+=n%10 n=n/10
			sum += k;

		} while (n != 0);

		System.out.println("Basamaklarının  toplamı =" + sum);

	}

}
