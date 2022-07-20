package com.project.lesson021;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Test {

	List<Urun> urunList = new ArrayList<Urun>();

	public static void main(String[] args) {
		Test test = new Test();

		for (int i = 0; i < 3; i++) {
//			Urun urun = test.urunYarat();
//			test.listeyeEkle(Optional.ofNullable(urun));

			test.listeyeEkle(test.urunYarat2());
		}

		System.out.println("Ürün listesi");
		test.urunList.forEach(s -> System.out.println(s.isim));

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

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir isim giriniz");
		String isim = scanner.nextLine();
		System.out.println("Lütfen urun fiyatı giriniz");
		double fiyat = scanner.nextDouble();
		scanner.nextLine();

		if (isim.equals("") || fiyat <= 0) {

			return Optional.ofNullable(null);
		} else {
			return Optional.of(new Urun(isim, fiyat));
		}

	}
}
