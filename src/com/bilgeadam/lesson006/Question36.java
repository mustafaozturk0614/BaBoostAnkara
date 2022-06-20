package com.bilgeadam.lesson006;

public class Question36 {

	public static void main(String[] args) {
		// Tek sayıları ayrı bir diziye yazdıran kod
		int sayac = 0;
		int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654, 33, 32, 67, 2 },
				{ 189, 35, 56, 89, 8 }

		};

		int[] teksayilar = new int[matris.length * matris[0].length];

		for (int i = 0; i < matris.length; i++) {

			for (int j = 0; j < matris[i].length; j++) {

				if (matris[i][j] % 2 != 0) {
					teksayilar[sayac] = matris[i][j];
					sayac++;

				}

			}

		}

		for (int i = 0; i < sayac; i++) {

			System.out.print(teksayilar[i] + " ");

		}

	}
}