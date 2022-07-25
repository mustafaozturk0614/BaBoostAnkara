package com.bilgeadam.lesson023;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/*
 * 
 * Dışarıdan 2 değer gireceğiz
 * 
 * değerlerden biri tarih olacak 2. int bir sayi değeri olacak
 * 
 * bu işlemler sonucun girdiğimiz sayı değeri kadar önceki yasımızı bize hesaplayan fonksiyonu yazacağız
 * 
 * 
 * 
 */
public class TryCatchOrnek2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		sayiKontrolu(scanner);
//
//		tarihKontrolu(scanner);

//		try {
//			sayiKontrolu(scanner);
//		} catch (Exception e1) {
//			System.out.println(e1.getMessage());
//			e1.printStackTrace();
//		}

		boolean kontrol = false;

		do {

			try {

//				System.out.println("Lütfen bir Tarih giriniz");
//
//				LocalDate date = LocalDate.parse(scanner.nextLine());
//
//				System.out.println("Lütfen Bir Sayı giriniz");
//				int sayi = scanner.nextInt();

				yasHesapla(tarihKontrolu(scanner), sayiKontrolu(scanner));

				kontrol = false;

			} catch (Exception e) {
				System.out.println(e.getMessage());
				kontrol = true;
			} finally {
				scanner.nextLine();
			}

		} while (kontrol);

	}

	private static LocalDate tarihKontrolu(Scanner scanner) throws Exception {
		try {
			System.out.println("Lütfen bir Tarih giriniz");
			LocalDate date = LocalDate.parse(scanner.nextLine());
			return date;
		} catch (Exception e) {

			throw new Exception("Hatalı Bir Tarih değeri Girdiniz");

		}
	}

	private static int sayiKontrolu(Scanner scanner) throws Exception {

		try {

			System.out.println("Lütfen Bir Sayı giriniz");
			int sayi = scanner.nextInt();
			return sayi;

		} catch (Exception e) {

			throw new Exception("Hatalı Bir değer girdiniz");
		} finally {
			scanner.nextLine();
		}
	}

	public static void yasHesapla(LocalDate date, int sayi) {

		int result = (int) date.until((LocalDate.now().minusYears(sayi)), ChronoUnit.YEARS);
		System.out.println(result);

	}
}
