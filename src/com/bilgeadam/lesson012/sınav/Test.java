package com.bilgeadam.lesson012.sınav;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Sınav sınav = new Sınav();
		sınav.sınavNo = "1";
		sınav.konu = "Oop";
		sınav.soruIcerigiGir();// Soru içeriklerimizi girdik sınav clası içerisindeki sorular arayımize
								// soruları atadık
		System.out.println("/////////////////////"); // Artık sınavımız hazır

		cevaplarıGir(sınav.cevaplar);// dışarıdan kullanıcı cevaplarını aldık

		sınav.cevaplarıKontrolEt();// dışarıdan girilen değerler ile sorularımızn cevaplarını karşılastıracağız.
	}

	public static String[] cevaplarıGir(String[] cevaplar) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < cevaplar.length; i++) {

			System.out.println("Lütfen Bir Cevap giriniz");
			cevaplar[i] = scanner.nextLine();
		}

		return cevaplar;

	}

}
