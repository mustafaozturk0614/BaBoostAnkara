package com.bilgeadam.lesson003;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		// Menü
//		
//
//		1 Eğer boşluk varsa  ilk boşluktan stringin sonuna kadar olan kısmı başka bir değişkene atayın 
//		Ve dışardan bir string girip onunla birleştirin.
//		2 İçinde kaç tane a ve olduğunu bulunuz 

//		3-2.sorunun farklı yolla çözümü
//		4-

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir değer giriniz");
		String value = scanner.nextLine();
		value = value.trim();

		System.out.println("====Menü====");
		System.out.println("1- Boşluktan Bölme");
		System.out.println("2- Harf Sayısı");
		System.out.println("Bir işlem seçiniz");
		int input = scanner.nextInt();

		scanner.nextLine();
		switch (input) {
		case 1:

			int check = value.indexOf(" ");
			if (check != -1) {
				String value2;
				value2 = value.substring(check + 1, value.length());
				System.out.println("Bir değer daha giriniz");
				value2 += " " + scanner.nextLine();
				System.out.println(value2);

			}

			break;

		case 2:
			int count = 0;
			for (int i = 0; i < value.length(); i++) {
				if (value.charAt(i) == 'a' || value.charAt(i) == 'A') {

					count++;

				}

			}
			System.out.println(count + " tane a var");

			break;
		case 3:
			int index = 0, sayac = 0;
			while (index != -1) {
				int ind = value.indexOf("a", index);
				index = ind == -1 ? -1 : ind + 1;
				if (ind != -1) {
					sayac++;
				}

			}
			System.out.println(sayac);

			break;

		default:
			break;
		}

	}

}
