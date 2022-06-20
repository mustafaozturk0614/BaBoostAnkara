package com.bilgeadam.lesson006;

public class Question37 {

	public static void main(String[] args) {
		// Dizideki elemanlar arasında ki farkın en küçük olduğu değer nedir.
		int[] array = { 1, 5, -4, 3 };
		Math.abs(-4);

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				int fark = Math.abs(array[i] - array[j]);
				if (fark < min) {
					min = fark;

				}

			}

		}
		System.out.println(min);

	}

}
