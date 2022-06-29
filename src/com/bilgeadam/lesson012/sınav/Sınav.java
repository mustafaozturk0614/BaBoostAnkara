package com.bilgeadam.lesson012.sınav;

import java.util.Scanner;

public class Sınav {

	String sınavNo;
	String konu;
	Soru[] sorular = new Soru[6];
	String[] cevaplar = new String[6];
	String[] cevapSecenekleri = { "A", "B", "C", "D" };

	public void soruIcerigiGir() {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < sorular.length; i++) {
			Soru soru = new Soru();
			System.out.println("Lütfen Soru içeriğini giriniz");
			soru.icerik = scanner.nextLine();
			soru.sıraNo = i + 1;
			soru.cevapGir(cevapSecenekleri);
			sorular[i] = soru;
		}

	}

	public void cevaplarıKontrolEt() {
		int dogruCevapSaysı = 0;

		for (int i = 0; i < sorular.length; i++) {
			if (cevaplar[i].equalsIgnoreCase(sorular[i].sorununCevabı)) {
				dogruCevapSaysı++;
			}

		}

		System.out.println("dogru cevap sayınız= " + dogruCevapSaysı);
		System.out.println("yanlış cevap sayınız= " + (sorular.length - dogruCevapSaysı));

	}

}
