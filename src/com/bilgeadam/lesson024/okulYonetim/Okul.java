package com.bilgeadam.lesson024.okulYonetim;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
 * 
 * ogrenci olustur()
 * 
 */
public class Okul {

	List<Ogrenci> ogrenciListesi;
	OgrenciManager ogrenciManager;

	public Okul() {
		ogrenciListesi = new ArrayList<Ogrenci>();
		ogrenciManager = new OgrenciManager();
	}

	public void ogrenciOlustur(List<String> ogrenciler) {

		for (int i = 0; i < ogrenciler.size(); i++) {

			try {
				listeyeEkle2(ogrenciManager.ogrenciOlustur2(ogrenciler.get(i).split(",")));
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

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

	public void listeyeEkle2(Optional<Ogrenci> ogrenci) {

		if (ogrenci.isEmpty()) {
			try {
				throw new OgrenciException("Null değer eklenemez");
			} catch (OgrenciException e) {
				System.out.println(e.getMessage());
			}

		} else {
			ogrenciListesi.add(ogrenci.get());
		}
	}

	public static void main(String[] args) {
		Okul okul = new Okul();
//		Optional<Ogrenci> ogrenci1 = okul.ogrenciManager.ogrenciOlustur();
//		Optional<Ogrenci> ogrenci2 = okul.ogrenciManager.ogrenciOlustur();
//		okul.listeyeEkle(ogrenci1, ogrenci2);
		okul.ogrenciOlustur(FileUtils.okuma());

		okul.ogrenciListesi.forEach(System.out::println);
	}

}
