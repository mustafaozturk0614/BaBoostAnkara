package com.bilgeadam.lesson005;

public class Question27 {

	public static void main(String[] args) {
		int[] sayilar = { 0, 120, 5, 85, -256, 16, 1258, 81, 14 };
		// dizi deki tüm sayıların toplamı ve
		// bu sayı çiftdir ve bu sayı tekdir şeklinde çıktı alalım.

		int toplam = 0;

		for (int i = 0; i < sayilar.length; i++) {
			toplam += sayilar[i];
			if (sayilar[i] % 2 == 0) {
				System.out.println(sayilar[i] + " sayısı çifttir.");
			} else {
				System.out.println(sayilar[i] + " sayısı tektir.");
			}

		}

		System.out.println("toplam= " + toplam);

	}

}
