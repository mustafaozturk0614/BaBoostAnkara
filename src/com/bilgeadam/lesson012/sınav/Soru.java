package com.bilgeadam.lesson012.sınav;

import java.util.Scanner;

public class Soru {

	int sıraNo;
	String icerik;
	String sorununCevabı;

	public void cevapGir(String[] cevapSecenekleri) {
		Scanner scanner = new Scanner(System.in);
		boolean kontrol = true;
		do {
			System.out.println("Lütfen Sorunun Cevabını Giriniz");
			String cevap = scanner.nextLine().toUpperCase();
			for (int i = 0; i < cevapSecenekleri.length; i++) {
				if (cevap.equals(cevapSecenekleri[i])) {
					kontrol = false;
					sorununCevabı = cevap;
					break;
				}
			}

			if (kontrol) {
				System.out.println("Lütfen Cevap secenekleri dahilinde bir cevap girin (A,B,C,D)");
			}
		} while (kontrol);

	}
}