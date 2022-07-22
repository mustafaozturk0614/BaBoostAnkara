package com.bilgeadam.lesson022;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class SipraisGunu {

	/*
	 * 
	 * bir alışveris tarihi yaratalım
	 * 
	 * fatura gunumuz tarihimiz ise her ayın 15 i olsun
	 * 
	 * 
	 * 1 . alışveris tarihi fatura gunumuzden oncemi kontrol edelim.
	 * 
	 * 
	 */
	public static void main(String[] args) {

		LocalDate alısverisTarihi = LocalDate.of(2022, 7, 12);

		LocalDate faturaGunu = LocalDate.of(alısverisTarihi.getYear(), alısverisTarihi.getMonthValue(), 15);

		if (alısverisTarihi.isBefore(faturaGunu)) {
			System.out.println("Önce");
		} else {
			System.out.println("Sonra");
			faturaGunu = faturaGunu.plusMonths(1);
			System.out.println("Yeni fatura tarihi " + faturaGunu);
		}

		long kalanGun = alısverisTarihi.until(faturaGunu, ChronoUnit.DAYS);
		System.out.println("kalanGun gun" + kalanGun);

//		if (alısverisTarihi.getDayOfMonth() < 15) {
//			System.out.println("Önce");
//		} else {
//			System.out.println("Sonra");
//		}

	}
}
