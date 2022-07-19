package com.bilgeadam.lesson017.sepet;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/*
 * 
 * 1 menü yapacağız 
 * 
 * 1-ürün listesi göster 
 * 2 ürün ekle  tane ürün sececeğiz  sectiğimiz numaraya göre o ürünü bir listeye ekleyeceğiz 
 * 3- sepetimiz göster
 * 
 * 
 * 
 * 
 * 
 */

public class Sepet2 {

	Urun product[] = Urun.values();
	Map<Urun, Integer> sepet;

	public Sepet2() {
		sepet = new LinkedHashMap<>();
	}

	public static void main(String[] args) {
		Sepet2 sepet = new Sepet2();
		sepet.menu();

	}

	public void menu() {
		int input = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("----------------");
			System.out.println("1-Ürün Listesi Göster");
			System.out.println("2-Ürün Ekle");
			System.out.println("3-Sepeti Göster");
			System.out.println("----------------");
			input = scanner.nextInt();
			switch (input) {
			case 1:
				urunleriGoster(product);
				break;
			case 2:
				urunEkle(sepet);
				break;
			case 3:
				sepetGöster(sepet);
				break;
			default:
				break;
			}

		} while (input != 0);

	}

	private void urunleriGoster(Urun[] urunler) {

		for (int i = 0; i < urunler.length; i++) {

			System.out.println(i + 1 + "- " + urunler[i]);

		}

	}

	public void urunEkle(Map<Urun, Integer> sepet) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen ürün numarasınız giriniz");
		int input = scanner.nextInt();
		Urun urun = product[input - 1];
		if (sepet.containsKey(urun)) {

			sepet.replace(urun, sepet.get(urun) + 1);
		} else {
			sepet.put(urun, 1);
		}

	}

	public void sepetGöster(Map<Urun, Integer> sepet) {

		System.out.println("======Spetimdeki Ürünler=======");
		System.out.println("------------------------------");
		int toplam = 0;
		for (Entry<Urun, Integer> urun : sepet.entrySet()) {
			int tutar = urun.getValue() * urun.getKey().fiyat;
			toplam += tutar;
			System.out.println(urun.getKey() + "-" + "adet " + urun.getValue() + " tutar" + tutar);

		}
		System.out.println("------------------------------");
		System.out.println("Toplam tutar " + toplam);
	}

}
