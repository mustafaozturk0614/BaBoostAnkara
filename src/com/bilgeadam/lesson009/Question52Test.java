package com.bilgeadam.lesson009;

public class Question52Test {

	public static void main(String[] args) {
		String kartTurleri[] = { "Kupa", "Maça", "Karo", "Sinek" };
		String kartNumaralari[] = { "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		Question52 question52 = new Question52();

		question52.kartTurleri = kartTurleri;
		question52.kartNumaralari = kartNumaralari;

		int deste[] = new int[question52.kartTurleri.length * question52.kartNumaralari.length];

		deste = question52.desteyiOlustur(deste);

		question52.desteyiKaristir(deste);

		question52.desteyiGoster(deste, kartNumaralari, kartTurleri, 10);

	}

}
