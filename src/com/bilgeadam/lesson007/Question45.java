package com.bilgeadam.lesson007;

import java.util.Random;
import java.util.Scanner;

public class Question45 {

	public static void main(String[] args) {
		// Taş kağıt makas

		game();

	}

	public static void game() {
		Scanner scanner = new Scanner(System.in);
		String[] kontrol = { "Taş", "Kağıt", "Makas" };
		String input = "";

		do {
			System.out.println("Lütfen bir değer giriniz Taş Kağıt Makas üçlüsünden birini.");
			String deger = scanner.nextLine();

			if (degeriKontrolEt(deger, kontrol)) {

				int rastgeleSayi = rastgeleSayıUret();
				System.out.println(kontrol[rastgeleSayi]);

				switch (deger.toLowerCase()) {
				case "taş": {

					if (kontrol[rastgeleSayi].equals("Kağıt")) {
						System.out.println("Kaybettiniz");
					} else if (kontrol[rastgeleSayi].equals("Makas")) {
						System.out.println("Kazandınız");
					} else {
						System.out.println("Beraberlik");
					}

					break;
				}
				case "kağıt": {

					if (kontrol[rastgeleSayi].equals("Kağıt")) {
						System.out.println("Beraberlik");
					} else if (kontrol[rastgeleSayi].equals("Makas")) {
						System.out.println("Kaybettiniz");
					} else {
						System.out.println("Kazandız");
					}

					break;
				}
				case "makas": {
					if (kontrol[rastgeleSayi].equals("Kağıt")) {
						System.out.println("Kazandınız");
					} else if (kontrol[rastgeleSayi].equals("Makas")) {
						System.out.println("Beraberlik");
					} else {
						System.out.println("Kaybettiniz");
					}

					break;
				}
				default:
					break;
				}

				System.out.println("Bir daha oynamak istiyormusnuz E/H");
				input = scanner.nextLine();
			}

		} while (!input.equalsIgnoreCase("H"));

	}

	public static int rastgeleSayıUret() {

		Random random = new Random();

		return random.nextInt(3);

	}

	public static boolean degeriKontrolEt(String deger, String[] kontrol) {
		boolean kontrol1 = false;

		for (int i = 0; i < kontrol.length; i++) {

			if (kontrol[i].equalsIgnoreCase(deger)) {
				kontrol1 = true;
				break;

			}

		}

		return kontrol1;

	}

}
