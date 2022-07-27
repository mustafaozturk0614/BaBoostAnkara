package com.bilgeadam.lesson024.okulYonetim;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Okul {

	List<Ogrenci> ogrenciListesi;
	OgrenciManager ogrenciManager;

	public Okul() {
		ogrenciListesi = new ArrayList<Ogrenci>();
		ogrenciManager = new OgrenciManager();
	}

	public void listeyeEkle(Optional<Ogrenci>... ogrenci) {

		for (int i = 0; i < ogrenci.length; i++) {

			if (ogrenci[i].isEmpty()) {
				try {
					throw new OgrenciException("Null değer eklenemez");
				} catch (OgrenciException e) {
					System.out.println(e.getMessage());
				}

			} else {
				ogrenciListesi.add(ogrenci[i].get());
			}

		}

	}

	public static void main(String[] args) {
		Okul okul = new Okul();
		Optional<Ogrenci> ogrenci1 = okul.ogrenciManager.ogrenciOlustur();
		Optional<Ogrenci> ogrenci2 = okul.ogrenciManager.ogrenciOlustur();
		okul.listeyeEkle(ogrenci1, ogrenci2);

		okul.ogrenciListesi.forEach(System.out::println);
	}

}
