package com.bilgeadam.lesson002;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// Klavyeden 0 girilinceye kadar sayı okunmaya devam edilecektir.0 girildiğinde
		// girilen sayıların toplamı ve ortalamasını
		Scanner input = new Scanner(System.in);
		double number, i = 1, toplam = 0;
		int l = 1;
		double ortalama;

		do {
			System.out.println("Lütfen Bir sayı giriniz");
			number = input.nextDouble();
			toplam = toplam + number;
			ortalama = (toplam) / (l);
			i++;
			l = (int) (i - 1);

		} while (number != 0);

		System.out.println("ortalama=" + ortalama);
		System.out.println("toplam= " + toplam);

	}

}
