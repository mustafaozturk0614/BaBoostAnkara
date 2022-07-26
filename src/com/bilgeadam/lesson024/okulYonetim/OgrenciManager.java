package com.bilgeadam.lesson024.okulYonetim;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class OgrenciManager {

	static Scanner scanner = new Scanner(System.in);

	public void isimKontrol() {

		System.out.println("Lütfen isminizi giriniz");
		String isim = scanner.nextLine();
		if (isim.length() < 3) {
			try {
				throw new IsımException("İsminizin  en az 3 karakterden oluşmalıdır");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

	}

	public void yasKontrol() {

		LocalDate date = Utils.stringToLocalDateKontol("LütfenYaşınızı giriniz");

		int yas = yasHesapla(date);

		if (yas < 8) {
			try {
				throw new YasException("Yasınız 8 den kucuk olmamalıdır.");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
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

		Double[] notlar = new Double[3];

		try {
			ogrenciManager.notKontrol(notlar);
		} catch (NotlarException2 e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		System.out.println("Burası Çalıştı");
	}

}
