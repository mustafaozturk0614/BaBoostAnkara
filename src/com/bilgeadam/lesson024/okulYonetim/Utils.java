package com.bilgeadam.lesson024.okulYonetim;

import java.time.LocalDate;
import java.util.Scanner;

public class Utils {

	static Scanner scanner = new Scanner(System.in);

	public static LocalDate stringToLocalDateKontol(String sorgu) {

		LocalDate date = null;
		String deger = "";
		boolean kontrol = false;

		do {
			try {
				System.out.println(sorgu);
				deger = scanner.nextLine();
				date = LocalDate.parse(deger);
				kontrol = false;
			} catch (Exception e) {
				System.out.println("Hatalı Giriş");
				kontrol = true;
			}
		} while (kontrol);
		return date;
	}

	public static double doubleOku(String sorgu) {

		double deger = 0;
		boolean kontrol = false;
		do {
			System.out.println(sorgu);
			try {
				deger = Double.parseDouble(scanner.nextLine());
				kontrol = false;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				kontrol = true;
			}

		} while (kontrol);

		return deger;

	}

}
