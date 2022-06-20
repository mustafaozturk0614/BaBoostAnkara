package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		// Dışarıdan Bir kelime girin her harfi
		// başına index numarası kullanark alt alta yazdırınız

		Scanner scanner = new Scanner(System.in);

		String kelime = scanner.nextLine();

		for (int i = 0; i < kelime.length(); i++) {

			System.out.println(i + "-" + kelime.charAt(i));
		}
	}

}
