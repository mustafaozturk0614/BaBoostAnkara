package com.bilgeadam.lesson003;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		// Girilen sayının 5'in kuvveti olup olmadığını bulan program.

		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayı giriniz");
		double num = scanner.nextDouble();
		double result;

		boolean check = true;

		while (check) {
			if (num % 5 == 0) {
				num = num / 5;
				if (num == 1) {
					System.out.println("5 in Kuvvetidir");
					check = false;
				}
			} else {

				System.out.println("5 in kuvveti değildir");
				check = false;
			}

		}

	}

}
