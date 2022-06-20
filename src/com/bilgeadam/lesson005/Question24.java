package com.bilgeadam.lesson005;

import java.util.Scanner;

public class Question24 {

	/*
	 * 
	 * Dışarıdan bir ıban değeri girelim TR 1001005001 ,TR 1001005002 veya OTH
	 * 2002002000 gibi daha sonra bu değerleri kontrol edelim eğer Tr ile başlıyorsa
	 * yurt içi işlemler yazsın ve Eğer 5001 ile Bitiyorsa Ziraat 5002 ile bitiyorsa
	 * Garanti 5003 ile bitiyorsa İş bankası yazdırsın eğer OTH ise Yurt dışı
	 * işlemler yazdıralım 2000ile bitiyorsa kıta içi işelmeler ve OTH yerine Ki
	 * 200200… değilse kıta dışı işlemler yazsın ve OTH yerine Kd 200200…
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen İbanınızı giriniz");
		String iban = scanner.nextLine().toUpperCase();

		if (iban.startsWith("TR")) {
//			System.out.println("Yurt İçi işlemler");
//			if (iban.endsWith("5001")) {
//				System.out.println("Ziraat Bankası");
//
//			} else if (iban.endsWith("5002")) {
//				System.out.println("Garanti Bankası");
//
//			} else if (iban.endsWith("5003")) {
//
//				System.out.println("İş Bankası ");
//			}

			String banka = switch (iban.substring(iban.length() - 4)) {

			case "5001" -> "Ziraat Bankası";

			case "5002" -> "Garanti Bankası";

			case "5003" -> "İş Bankası";

			default -> "";

			};
			System.out.println(banka);

		} else if (iban.startsWith("OTH")) {
			System.out.println("Yurt Dışı işlemler");
			String newValue;
			if (iban.endsWith("2000")) {
				newValue = iban.replace("OTH", "Ki");
				newValue = newValue.substring(0, iban.length() - 5) + "...";
				System.out.println(newValue);

			} else {
				newValue = iban.replace("OTH", "Kd").substring(0, iban.length() - 5) + "...";
				System.out.println(newValue);
			}

		} else {

			System.out.println("Yanlış iban girdiniz");

		}

	}

}
