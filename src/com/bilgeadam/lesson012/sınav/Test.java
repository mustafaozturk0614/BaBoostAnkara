package com.bilgeadam.lesson012.sınav;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Sınav sınav = new Sınav();
		sınav.sınavNo = "1";
		sınav.cevapOlustur();
		sınav.konu = "Oop";

		for (int i = 0; i < sınav.dogruCevaplar.length; i++) {
			System.out.println(sınav.dogruCevaplar[i]);
		}

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < sınav.sorular.length; i++) {
			System.out.println("Lütfen Soru içeriğini giriniz");
			Sorular soru = new Sorular();
			soru.icerik = scanner.nextLine();
			soru.sıraNo = i + 1;
			sınav.sorular[i] = soru;
		}
		for (Sorular string : sınav.sorular) {
			System.out.println(string.icerik);
		}
		cevaplarıGir(sınav.cevaplar);
		cevaplarıKontrolEt(sınav.dogruCevaplar, sınav.cevaplar);
	}

	public static String[] cevaplarıGir(String[] cevaplar) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < cevaplar.length; i++) {

			System.out.println("Lütfen Bir Cevap giriniz");
			cevaplar[i] = scanner.nextLine();
		}

		return cevaplar;

	}

	public static void cevaplarıKontrolEt(String[] dogruCevaplar, String[] cevaplar) {

		int dogruCevapSaysı = 0;

		for (int i = 0; i < dogruCevaplar.length; i++) {
			if (dogruCevaplar[i].equals(cevaplar[i])) {

				dogruCevapSaysı++;
			}

		}

		System.out.println("dogru cevap sayınız= " + dogruCevapSaysı);
		System.out.println("yanlış cevap sayınız= " + (dogruCevaplar.length - dogruCevapSaysı));

	}

}
