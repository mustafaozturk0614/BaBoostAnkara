package com.bilgeadam.lesson006;

public class Question34 {

	public static void main(String[] args) {

		// Sehirleri plaka kodlarıyla birlikte bir diziye atayalım daha sonra
		// “Adananın plaka kodu 01” örnek çıktışı gibi

		String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;"
				+ "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya";

		String array[] = sehirler.split(";");

		for (int i = 0; i < array.length; i++) {
			int index = array[i].indexOf("-");// [01-Adana]

			System.out.println(
					array[i].substring(index + 1) + " adlı şehirin plaka kodu: " + array[i].substring(0, index));

		}

	}

}
