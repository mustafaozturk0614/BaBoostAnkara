package com.bilgeadam.lesson005;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		// Java’da dizideki bir öğeyi arama
		String[] dizi = { "Türkiye", "Japonya", "Moğolistan", "Fransa", "Danimarka" };

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir değer giriniz");
		String deger = scanner.nextLine();
		String kontrol = "Değer Bulunamadı";
		boolean kontrol2 = false;

		for (int i = 0; i < dizi.length; i++) {

			if (dizi[i].equalsIgnoreCase(deger)) {
				kontrol2 = true;
				kontrol = "Girdiğiniz Değer Bulundu";
				break;
			}
		}

		if (kontrol2) {
			System.out.println("Girdiğiniz Değer Bulundu");
		} else {
			System.out.println("Girdiğiniz Değer Bulunamadı");
		}

		System.out.println(kontrol);

	}

}
