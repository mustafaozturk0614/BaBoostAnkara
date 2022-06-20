package com.bilgeadam.lesson006;

public class Question32 {

	public static void main(String[] args) {
		// Çarpım tablosu
		// 1x1=1
		// 1x2=2

		int x, y;

		for (int i = 1; i < 10; i++) {

			for (int j = 1; j < 10; j++) {

				System.out.print(i + "x" + j + "=" + i * j + " ");
			}
			System.out.println();
		}

	}

}
