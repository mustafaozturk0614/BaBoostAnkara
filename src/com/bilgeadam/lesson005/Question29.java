package com.bilgeadam.lesson005;

public class Question29 {

	public static void main(String[] args) {

		// bir dizide en büyük ikinci sayıyı bulma
		int[] sayilar = { 0, 120, 5, 85, -256, 16, 1258, 240, 81, 14 };

		int enBuyuk = sayilar[0];
		int ikinci = sayilar[0];
//
//		for (int i = 0; i < sayilar.length; i++) {
//
//			if (sayilar[i] > enBuyuk) {
//				ikinci = enBuyuk;
//				enBuyuk = sayilar[i];
//
//			} else if (sayilar[i] > ikinci) {
//				ikinci = sayilar[i];
//
//			}
//
//		}

		for (int i = 0; i < sayilar.length; i++) {

			if (sayilar[i] > enBuyuk) {
				enBuyuk = sayilar[i];

			}
		}

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] < enBuyuk && sayilar[i] > ikinci) {
				ikinci = sayilar[i];

			}

		}

		System.out.println(ikinci);

	}

}
