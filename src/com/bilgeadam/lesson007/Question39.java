package com.bilgeadam.lesson007;

import java.util.Scanner;

public class Question39 {
	/*
	 * 
	 * 4 7 7 7 7 1 4 7 7 7 1 1 4 7 7 1 1 1 4 7 1 1 1 1 4
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int satir, sutun, sayi;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen tek bir sayı giriniz");
		sayi = scanner.nextInt();
		System.out.println("Lütfen satır sayısını giriniz");
		satir = scanner.nextInt();
		System.out.println("Lütfen Sutun saısını giriniz");
		sutun = scanner.nextInt();
		printArray(satir, sutun, sayi);

	}

	public static void printArray(int satir, int sutun, int sayi) {
		int orta = (sayi + 1) / 2;
		int min = 1;

		int[][] matris = new int[satir][sutun];

		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {

				if (i == j) {
					matris[i][j] = orta;
				} else if (i > j) {
					matris[i][j] = min;

				} else {
					matris[i][j] = sayi;
				}

				System.out.print(matris[i][j] + " ");

			}
			System.out.println();
		}

	}

}
