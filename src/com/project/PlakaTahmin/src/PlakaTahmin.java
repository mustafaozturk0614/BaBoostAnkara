package com.project.PlakaTahmin.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PlakaTahmin {

	int oyunsayısı = 1;

	int hak = 3;

	HashMap<Integer, String> hMap = new HashMap<Integer, String>();

	HashMap<Integer, List<String>> tahminler = new HashMap<>();

	public PlakaTahmin() {
		mapOlustur();
	}

	public void mapOlustur() {
		hMap.put(1, "Adana");
		hMap.put(2, "Adıyaman");
		hMap.put(3, "Afyonkarahisar");
		hMap.put(4, "Ağrı");
		hMap.put(5, "Amasya");
		hMap.put(6, "Ankara");
		hMap.put(7, "Antalya");
		hMap.put(8, "Artvin");
		hMap.put(9, "Aydın");
		hMap.put(10, "Balıkesir");
		hMap.put(11, "Bilecik");
		hMap.put(12, "Bingöl");
		hMap.put(13, "Bitlis");
		hMap.put(14, "Bolu");
		hMap.put(15, "Burdur");
		hMap.put(16, "Bursa");
		hMap.put(17, "Çanakkale");
		hMap.put(18, "Çankırı");
		hMap.put(19, "Çorum");
		hMap.put(20, "Denizli");
		hMap.put(21, "Diyarbakır");
		hMap.put(22, "Edirne");
		hMap.put(23, "Elazığ");
		hMap.put(24, "Erzincan");
		hMap.put(25, "Erzurum");
		hMap.put(26, "Eskişehir");
		hMap.put(27, "Gaziantep");
		hMap.put(28, "Giresun");
		hMap.put(29, "Gümüşhane");
		hMap.put(30, "Hakkari");
		hMap.put(31, "Hatay");
		hMap.put(32, "Isparta");
		hMap.put(33, "Mersin");
		hMap.put(34, "İstanbul");
		hMap.put(35, "İzmir");
		hMap.put(36, "Kars");
		hMap.put(37, "Kastamonu");
		hMap.put(38, "Kayseri");
		hMap.put(39, "Kırkareli");
		hMap.put(40, "Kırşehir");
	}

	private static void menu() {

		PlakaTahmin plakaTahmin = new PlakaTahmin();

		String message = "Şehir Tahmin Oyununa Hoşgeldiniz\n" + "Oyunumuzda toplam 3 tahmin hakkınız bulunmaktadır.\n"
				+ "1- Oyuna başla \n" + "2- Tahminlerim \n" + "3- Çıkış \n";

		int input = 0;
		do {
			System.out.println("=================================");
			System.out.println(plakaTahmin.oyunsayısı + ". oyun");
			System.out.println(message);
			Scanner scanner2 = new Scanner(System.in);
			input = scanner2.nextInt();
			scanner2.nextLine();
			switch (input) {
			case 1:
				plakaTahmin.tahmin();

				break;
			case 2:
				plakaTahmin.tahminListem();
				break;

			case 3:
				System.out.println("Güle güle ...");
				System.exit(0);
				break;

			default:
				break;
			}

		} while (input != 0);
	}

	public void tahminListem() {

		tahminler.forEach((k, v) -> System.out.println(k + ". oyun tahminleri= " + v));

	}

	public void tahminEkle(String sehir_tahmin, List<String> tahminList) {

		tahminList.add(sehir_tahmin);
		tahminler.put(oyunsayısı, tahminList);
	}

	public void tahmin() {

		Scanner scanner = new Scanner(System.in);

		int plaka = plakaSec();

		List<String> tahminList = new ArrayList<>();

		for (int i = hak; i > 0; i--) {
			System.out.println((hak - i + 1) + ". hakkınız");
			System.out.println(plaka + " hangi şehrimizin plakasıdır ?");
			String sehir_tahmin = scanner.nextLine();
			tahminList.add(sehir_tahmin);
//			tahminEkle(sehir_tahmin, tahminList);

			if (sehir_tahmin.equals(hMap.get(plaka))) {
				String message2 = "Tebrikler " + sehir_tahmin + " adlı şehiri " + (hak - i + 1)
						+ ". hakkınızda  doğru tahmin ettiniz\n";
				System.out.println("*********************");
				System.out.println(message2);
				System.out.println("*********************");
				scanner.nextLine();

				break;

			} else {
				if (i - 1 == 0) {
					System.out.println("Hakkınız kalmadı");
				} else {
					System.out.println("Yanlış tahmin " + (i - 1) + "hakkınız kaldı");
				}

			}
		}

		tahminler.put(oyunsayısı, tahminList);
		oyunsayısı += 1;
	}

	private int plakaSec() {
		Random random = new Random();
		int plaka = random.nextInt(1, 41);
		return plaka;
	}

	public static void main(String[] args) {

		menu();

	}
}