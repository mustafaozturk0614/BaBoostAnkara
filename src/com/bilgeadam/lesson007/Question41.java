package com.bilgeadam.lesson007;

public class Question41 {

	public static void main(String[] args) {
		// 1 den 1000 ekadar olan sayıların asal olup olmadığını kontrol eden methodu
		// yazınız
		// method sadece
		// asal olup olmadığını kontrol etsin döngümüzü main methoda kuralım ;

		for (int i = 1; i < 1000; i++) {

			asalmı(i);

		}

	}

	public static void asalmı(int sayi) {
		boolean kontrol = true;
		if (sayi == 1) {

			kontrol = false;

		} else {
			for (int i = 2; i < sayi; i++) {
				if (sayi % i == 0) {

					kontrol = false;
					break;
				}

			}
		}

		if (kontrol) {
			System.out.println(sayi + " Asal saydır");

		}

	}
}
