package com.bilgeadam.lesson010;

import java.util.Scanner;

// Kitaplığımız olsun bu kitaplık belirli bir sayıda kitap alsın
// dışardan biz kitaplığımızn boyutunu girelim ve ona göre önce yazar ismi,kitap ismini alıp kitaplığa ekleyelim 
//Yaşar Kemal,İnce Memed

/*
 * 
 * 
 * menü
 * 
 * 		System.out.println("1-Kitap ekle");
		System.out.println("2-Kitap ismi arama");
		System.out.println("3-Yazar ismi arama");
 * 
 * 
 */

public class Kitaplik {

	String[] kitaplik;
	int index;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		Kitaplik kitaplik = new Kitaplik();
		kitaplik.menu();

	}

	public void menu() {

		int input = 0;

		kitaplik = kitaplikOlustur();

		do {

			System.out.println("1-Kitap Ekle");
			System.out.println("2-Kitap ismi Ara");
			System.out.println("3-Yazar ismi Ara");
			System.out.println("4-Kitapları Listele");
			System.out.println("5-Yazarları Listele");
			input = scanner.nextInt();
			scanner.nextLine();

			switch (input) {
			case 1:

				kitapEkle();

				break;
			case 2:

				kitapAra();

				break;

			case 3:

				yazarAra();

				break;

			case 4:

				kitaplariListele();

				break;
			case 5:

				yazarlariListele();

				break;

			default:
				break;
			}

		} while (input != 0);

	}

	public void yazarlariListele() {
		if (kitaplik[0] == null) {
			System.out.println("Kitaplığımızda hiç kitap Yoktur");
		} else {
			for (int i = 0; i < kitaplik.length; i++) {

				if (kitaplik[i] != null) {
					System.out.println(kitaplik[i].substring(0, kitaplik[i].indexOf(",")));
				}

			}
		}

	}

	public void kitaplariListele() {
		if (kitaplik[0] == null) {

			System.out.println("Kitaplığımızda hiç kitap Yoktur");

		} else {
			for (int i = 0; i < kitaplik.length; i++) {

				if (kitaplik[i] != null) {

					System.out.println(kitaplik[i].substring(kitaplik[i].indexOf(",") + 1));
				}

			}
		}

	}

	public void yazarAra() {
		System.out.println("Lütfen yazar ismi Giriniz");
		String value = scanner.nextLine().trim().toUpperCase();
		boolean kontrol = false;

		for (int i = 0; i < kitaplik.length; i++) {

			if (kitaplik[i] != null) {
				String yazarIsmı = kitaplik[i].substring(0, kitaplik[i].indexOf(","));

				if (yazarIsmı.equals(value)) {
					kontrol = true;
				}

			}

		}

		if (kontrol) {
			System.out.println(value + "İsimli Yazar Kütüphanemizde Vardır");

		} else {
			System.out.println(value + "İsimli Yazar Kütüphanemizde Yoktur");
		}

	}

	public void kitapAra() {

		System.out.println("Lütfen kitap ismi Giriniz");
		String value = scanner.nextLine().trim().toUpperCase();
		boolean kontrol = false;

		for (int i = 0; i < kitaplik.length; i++) {

			if (kitaplik[i] != null) {

				String kitapIsmi = kitaplik[i].substring(kitaplik[i].indexOf(",") + 1);

				if (kitapIsmi.equals(value)) {
					kontrol = true;

				}

			}

		}

		if (kontrol) {
			System.out.println(value + "İsimli Kitap Kütüphanemizde Vardır");

		} else {
			System.out.println(value + "İsimli Kitap Kütüphanemizde Yoktur");
		}
	}

	public void kitapEkle() {

		if (index < kitaplik.length) {

			System.out.println("Lütfen Yazar simini giriniz");
			String yazarIsmi = scanner.nextLine().trim().toUpperCase();
			System.out.println("Lütfen Kitap ismini Giriniz");
			String kitapIsmı = scanner.nextLine().trim().toUpperCase();
			kitaplik[index] = yazarIsmi + "," + kitapIsmı;
			index++;
			for (String string : kitaplik) {
				System.out.println(string);
			}

		} else {
			System.out.println("Kitaplığımız Dolmuştur");
		}

	}

	public void kitapBilgileriniOlustur() {

		for (int i = 0; i < kitaplik.length; i++) {
			System.out.println("Lütfen Yazar simini giriniz");
			String yazarIsmi = scanner.nextLine().trim().toUpperCase();
			System.out.println("Lütfen Kitap ismini Giriniz");
			String kitapIsmı = scanner.nextLine().trim().toUpperCase();
			kitaplik[i] = yazarIsmi + "," + kitapIsmı;
		}

		for (String string : kitaplik) {
			System.out.println(string);
		}
	}

	public String[] kitaplikOlustur() {

		System.out.println("Lütfen kitaplığın boyutunu giriniz");
		int kitaplikBoyutu = scanner.nextInt();
		scanner.nextLine();
		kitaplik = new String[kitaplikBoyutu];
		return kitaplik;
	}

}
