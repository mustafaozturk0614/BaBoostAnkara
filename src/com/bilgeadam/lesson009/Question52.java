package com.bilgeadam.lesson009;

import java.util.Random;

/*
 * Iskambil destesini diziler ile olusturun. 
 * Sonrasında bu destedeki elemanları 
 * karıştırın ve de ilk kullanıcıya 
 * hangi 4 kartın geldiğini ekrana yazdırın.
 * 
 * 
 * */
public class Question52 {

	String kartTurleri[];
	String kartNumaralari[];

	public static void main(String[] args) {

	}

	public void desteyiKaristir(int[] deste) {

		for (int i = 0; i < deste.length; i++) {
			int rastgeleIndex = rastgeleSayi();
			int gecici = deste[i];// 0
			deste[i] = deste[rastgeleIndex];
			deste[rastgeleIndex] = gecici;

		}

	}

	public int rastgeleSayi() {

		Random random = new Random();

		return random.nextInt(52);
	}

	public int[] desteyiOlustur(int[] deste) {

		for (int i = 0; i < deste.length; i++) {

			deste[i] = i;

		}

		return deste;

	}

	public void desteyiGoster(int[] deste, String[] kartNumaraları, String[] kartTurleri, int kartSayısı) {
		// String kartTurleri[] = { "Kupa", "Maça", "Karo", "Sinek" };
		// String kartNumaralari[] = { "As", "2", "3", "4", "5", "6", "7", "8", "9",
		// "10", "J", "Q", "K" };
//		for (int i = 0; i < kartTurleri.length; i++) {
//			for (int j = 0; j < kartNumaraları.length; j++) {
//				
//				System.out.println(kartTurleri[i] + " " + kartNumaraları[j]);
//			}
//		}
		for (int i = 0; i < kartSayısı; i++) {
			int index = deste[i] / 13;
			int kartIndex = deste[i] % 13;
			String kartTuru = kartTurleri[index];
			String kartNumarası = kartNumaraları[kartIndex];
			System.out.println(kartTuru + " " + kartNumarası);
		}

	}

}
