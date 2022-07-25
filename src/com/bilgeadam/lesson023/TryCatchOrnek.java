package com.bilgeadam.lesson023;

import java.util.Scanner;

public class TryCatchOrnek {
//Bir metot ile dışarıdan bir index değeri alsın bu değere göre arayımizn o indexdeki değerini donsun 
	/*
	 * 2-Array üzerinde gezelim sayısal değerleri stringden ıntegeri cevirip bir
	 * toplama işlemi yapalım döngü sonunda sizden istedğim toplam birde hata sayısı
	 * 
	 * 
	 */

	public static void main(String[] args) {

		String[] array = { "a", "10", "bc", null, "20" };

//		elamanıGetir(array);

//		sum(array);

		sum2(array);

	}

	private static void sum(String[] array) {

		int toplam = 0;
		int hata = 0;

		for (String string : array) {

			try {

				int num2 = Integer.parseInt(string);
				toplam += num2;
			} catch (Exception e) {
				System.out.println(e.getMessage());

				hata++;
			}

		}
		System.out.println("hata sayısı " + hata);
		System.out.println("toplam " + toplam);
	}

	public static String nullCheck(String string) throws Exception {
		if (string == null) {

			throw new Exception("Null olamazzzz!");

		}
		return string;

	}

	public static void sum2(String[] array) {

		int toplam = 0;
		int hata = 0;

		for (String string : array) {

			try {
				nullCheck(string);

				int num2 = Integer.parseInt(string);
				toplam += num2;

			} catch (Exception e) {
				System.out.println(e.getMessage());

				hata++;
			}

		}
		System.out.println("hata sayısı " + hata);
		System.out.println("toplam " + toplam);
	}

	private static void elamanıGetir(String[] array) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Bir değer giriniz");
			int secim = scanner.nextInt();
			System.out.println("Dizinin " + (secim + 1) + " .elemanı " + array[secim]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Girdiğiniz sayı dizinin boyutlarını aşmıştır");
			e.printStackTrace();
			System.out.println(e.getMessage() + " get message");

			System.out.println(e + " sadece e");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
