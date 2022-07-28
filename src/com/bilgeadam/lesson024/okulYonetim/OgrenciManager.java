package com.bilgeadam.lesson024.okulYonetim;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Optional;
import java.util.Scanner;

public class OgrenciManager {

	static Scanner scanner = new Scanner(System.in);

	public Optional<Ogrenci> ogrenciOlustur() {
		try {
			String isim = isimKontrol();
			LocalDate date = yasKontrol();
			return Optional.ofNullable(new Ogrenci(isim, date));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return Optional.empty();
		}
	}

	public Optional<Ogrenci> ogrenciOlustur2(String[] array) {
		try {
//			String isim = isimKontrol();
//			LocalDate date = yasKontrol();
			return Optional.ofNullable(new Ogrenci(isimKontrol2(array[0]), yasKontrol2(array[1])));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return Optional.empty();
		}
	}

	public String isimKontrol() {

		System.out.println("Lütfen isminizi giriniz");
		String isim = scanner.nextLine();
		if (isim.length() < 3) {

			throw new IsımException("İsminizin  en az 3 karakterden oluşmalıdır");
		}

		return isim;
	}

	public String isimKontrol2(String isim) {

		if (isim.length() < 3) {

			throw new IsımException("İsminizin  en az 3 karakterden oluşmalıdır");
		}

		return isim;
	}

	public LocalDate yasKontrol2(String string) {

		LocalDate date = null;

		try {
			date = LocalDate.parse(string);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		int yas = yasHesapla(date);

		if (yas < 8) {

			throw new YasException("Yasınız 8 den kucuk olmamalıdır.");
		}

		return date;
	}

	public LocalDate yasKontrol() {

		LocalDate date = Utils.stringToLocalDateKontol("LütfenYaşınızı giriniz");

		int yas = yasHesapla(date);

		if (yas < 8) {

			throw new YasException("Yasınız 8 den kucuk olmamalıdır.");
		}

		return date;
	}

	private int yasHesapla(LocalDate date) {

		return (int) date.until(LocalDate.now(), ChronoUnit.YEARS);
	}

	public void notKontrol(Double[] notlar) throws NotlarException2 {
		int kontrol = 1;
		do {

			double not = Utils.doubleOku("Lütfen" + kontrol + ". notu giriniz");
			if (not < 0 || not > 100) {
				try {
					throw new NotlarException2(kontrol + ".not değeri 0 ile 100 arasında olmalıdır tekrar giriniz");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} else {

				notlar[kontrol - 1] = not;
				kontrol++;

			}

		} while (kontrol < 4);

	}

	public static void main(String[] args) {
		OgrenciManager ogrenciManager = new OgrenciManager();

//		ogrenciManager.isimKontrol();
//		ogrenciManager.yasKontrol();

//		Double[] notlar = new Double[3];
//
//		try {
//			ogrenciManager.notKontrol(notlar);
//		} catch (NotlarException2 e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}

		System.out.println(ogrenciManager.ogrenciOlustur());
		;

		System.out.println("Burası Çalıştı");
	}

}
