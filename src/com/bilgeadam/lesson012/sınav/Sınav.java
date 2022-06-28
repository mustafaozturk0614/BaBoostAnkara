package com.bilgeadam.lesson012.sınav;

import java.util.Random;

public class Sınav {

	String sınavNo;
	String konu;
	Sorular[] sorular = new Sorular[6];
	String[] cevaplar = new String[6];
	String[] dogruCevaplar = new String[6];
	String kullanıcıIsmi;

	public void cevapOlustur() {

		String[] cevap = { "A", "B", "C", "D" };
		Random random = new Random();
		for (int i = 0; i < dogruCevaplar.length; i++) {

			int index = random.nextInt(4);

			dogruCevaplar[i] = cevap[index];

		}

	}

}
