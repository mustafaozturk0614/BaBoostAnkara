package com.bilgeadam.lesson021;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 * 
 *  urun clasımıza Son kullanma tarihi Localdate
 * urun yarat fonksiyonun son kullanma tarihini de alıp ona göre urun yaratacağız 
 * 
 * urun listesi uzerinden once 
 * 1- son kullnma tarihi geçmiş urunleri ayrı bir listeye ekleyeceğiz;(stream)
 * 2- urun listemizdeki urunlere %30 zam yapalım ve bunu zamlı urun listesi diye bir listeye ekleyeim(stream
 */
public class UrunTest {

	List<Urun> urunList = new ArrayList<Urun>();

	public static void main(String[] args) {
		UrunTest test = new UrunTest();

		for (int i = 0; i < 3; i++) {
//			Urun urun = test.urunYarat();
//			test.listeyeEkle(Optional.ofNullable(urun));

			test.listeyeEkle(test.urunYarat2());
		}

		System.out.println("Tarihi geçmiş Ürün listesi");
		test.tarihiGecmisUrunleriListele();
		System.out.println("/////////////////////////////////////");
		test.zamYap();

	}

	public void listeyeEkle(Optional<Urun> urun) {

		if (urun.isPresent()) {
			urunList.add(urun.get());
		}

	}

	public Urun urunYarat() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir isim giriniz");
		String isim = scanner.nextLine();
		System.out.println("Lütfen urun fiyatı giriniz");
		double fiyat = scanner.nextDouble();
		scanner.nextLine();

		if (isim.equals("") || fiyat <= 0) {

			return null;
		} else {
			return new Urun(isim, fiyat);
		}

	}

	public Optional<Urun> urunYarat2() {
		Urun urun = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir isim giriniz");
		String isim = scanner.nextLine();
		System.out.println("Lütfen urun fiyatı giriniz");
		double fiyat = scanner.nextDouble();
		scanner.nextLine();
//		System.out.println("Lütfen son kullanma tarihi giriniz");
//		String tarih = scanner.nextLine();
//		LocalDate date = LocalDate.parse(tarih);// yıl-ay-gün
		urun = new Urun(isim, fiyat);
		if (isim.equals("") || fiyat <= 0 || !tarihGir(urun)) {
			urun = null;
			return Optional.ofNullable(urun);
		} else {
//			urun = new Urun(isim, fiyat);
			return Optional.of(urun);
		}

	}

	public boolean tarihGir(Urun urun) {
		boolean kontrol = false;
		Scanner scanner = new Scanner(System.in);
		LocalDate date = null;
		try {
			System.out.println("Lütfen son kullanma tarihi giriniz");
			String tarih = scanner.nextLine();
			date = LocalDate.parse(tarih);
			urun.setSonKullanmaTarihi(date);
			kontrol = true;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Hatalı Tarih girdiniz");
			kontrol = false;
		}
		return kontrol;

	}

	public void zamYap() {
		List<Urun> zamlıListe = new ArrayList<Urun>();

		zamlıListe = urunList.stream().filter(k -> k.sonKullanmaTarihi.isAfter(LocalDate.now())).map(s -> {

			s.setFiyat(s.getFiyat() * 1.30);
			return s;

		}).collect(Collectors.toList());

		zamlıListe.forEach(System.out::println);

	}

	public void tarihiGecmisUrunleriListele() {
		List<Urun> tarihiGecmisUrunlerList = new ArrayList<Urun>();
		try {

			tarihiGecmisUrunlerList = urunList.stream().filter(s -> s.sonKullanmaTarihi.isBefore(LocalDate.now()))
					.collect(Collectors.toList());
			tarihiGecmisUrunlerList.forEach(System.out::println);
		} catch (Exception e) {
			System.out.println("urunun son kullanma tarihi yok ");
		}

	}

}
