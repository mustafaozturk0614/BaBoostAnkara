package com.bilgeadam.lesson005;

public class Question23 {

	public static void main(String[] args) {

		String string = "Hayat,kısa,kuşlar,uçuyor";
		int index = 0;

		for (int i = 0; i < string.length(); i++) {

			if (string.charAt(i) == ',') {

				System.out.println(string.substring(index, i));
				index = i + 1;

			}

		}
		System.out.println(string.substring(index));

		for (int i = 0; i < string.length(); i++) {

			if (string.charAt(i) == ',') {
				System.out.println();

			} else {
				System.out.print(string.charAt(i));
			}
		}

		// dışarıdan girilen bir değeri , ile ayırıp alt alta yazma

	}

}
