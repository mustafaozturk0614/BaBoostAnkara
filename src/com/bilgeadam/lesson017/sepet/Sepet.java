package com.bilgeadam.lesson017.sepet;

import java.util.ArrayList;
import java.util.List;
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

public class Sepet {

	String product[] = { "Cips", "Kola", "Şeker", "Yağ", "Un", "Ekmek", "Çay", "Yumurta", "Yoğurt", "Süt" };
	List<String> sepet;

	public Sepet() {
		sepet = new ArrayList<String>();
	}

	public static void main(String[] args) {
		Sepet sepet = new Sepet();
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

	private void urunleriGoster(String[] urunler) {

		for (int i = 0; i < urunler.length; i++) {

			System.out.println(i + 1 + "- " + urunler[i]);

		}

	}

	public void urunEkle(List<String> sepet) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen ürün numarasınız giriniz");
		int input = scanner.nextInt();
		sepet.add(product[input - 1]);

	}

	public void sepetGöster(List<String> sepet) {

		System.out.println("======Spetimdeki Ürünler=======");
		System.out.println("------------------------------");
		for (String urun : sepet) {
			System.out.println(urun);
		}
		System.out.println("------------------------------");
	}

}
