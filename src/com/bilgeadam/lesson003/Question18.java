package com.bilgeadam.lesson003;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		// Switch case
		// Dışarıdan bir gününü kaçıncı gün olduğuna dair bir sayı giriniz bu sayıya
		// göre gün isimini bize dönsün

		Scanner scanner = new Scanner(System.in);
		int value;

		switch (scanner.nextInt()) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Salı");
			break;
		case 3:
			System.out.println("Çarşamba");
			break;
		case 4:
			System.out.println("Perşembe");

		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
		default:
			System.out.println("Hatalı Değer Girdiniz");
			break;
		}

	}

}
