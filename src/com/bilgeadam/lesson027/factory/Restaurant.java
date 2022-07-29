package com.bilgeadam.lesson027.factory;

import java.util.Scanner;

/*
 * 
 * 
 * consola gelecek menusu olacak 
 * 1- sapişver 
 * 2- uygulamayı sonlandır
 * 
 * 1- urunturusec ,boyutsec, hamurtipisec  fonskıyonlarını yazalım bu fonksiyonlardan donen değerlere
 *
 * restondada bir sipariş hazrıla metodu olsun   bu metoda vrelim bu metot bize pizzamızı yatarıp 
 * hazırlasın ve pizzamız hazır desin  
 * 
 * 
 * 
 */
public class Restaurant {
	static Scanner scanner = new Scanner(System.in);

	public void menu() {

		System.out.println("1-Sipariş ver");
		System.out.println("2-Çıkış");
		int input = Integer.parseInt(scanner.nextLine());

		switch (input) {
		case 1: {
			try {
				ETur tur = urunTuruSec();
				EBoyut boyut = boyutSec();
				EHamur hamur = hamurTuruSec();
				siparisHazırla(tur, boyut, hamur);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
			break;
		case 2: {
			System.out.println("Çıkış Yapılıyor");
			System.exit(0);
		}
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}

	}

	public void siparisHazırla(ETur tur, EBoyut boyut, EHamur hamur) {

		try {
			Thread.sleep(2000);
			Pizza pizza = PizzaFactory.getPizza(tur, boyut, hamur);
			System.out.println("Pizzanız hazır" + pizza);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public ETur urunTuruSec() throws Exception {

		for (ETur tur : ETur.values()) {
			System.out.println((tur.ordinal() + 1) + "-" + tur);

		}

		switch (secim("Lütfen urun turunu seciniz")) {
		case 1:

			return ETur.VEGAN;

		case 2:

			return ETur.TAVUKLU;

		default:
			throw new Exception("Böyle bir urun türü bulunmamaktadır");
		}

	}

	private int secim(String sorgu) {
		System.out.println(sorgu);
		int input = Integer.parseInt(scanner.nextLine());
		return input;
	}

	public EBoyut boyutSec() throws Exception {

		for (EBoyut boyut : EBoyut.values()) {
			System.out.println((boyut.ordinal() + 1) + "-" + boyut);

		}

		switch (secim("Lütfen urun boyutunu seciniz")) {
		case 1:

			return EBoyut.BUYUK;

		case 2:

			return EBoyut.ORTA;
		case 3:

			return EBoyut.KUCUK;

		default:
			throw new Exception("Böyle bir urun boyu bulunmamaktadır");
		}

	}

	public EHamur hamurTuruSec() throws Exception {

		for (EHamur hamur : EHamur.values()) {
			System.out.println((hamur.ordinal() + 1) + "-" + hamur);

		}

		switch (secim("Lütfen urun boyutunu seciniz")) {
		case 1:

			return EHamur.INCE;

		case 2:

			return EHamur.KALIN;

		default:
			throw new Exception("Böyle bir hamur tipi bulunmamaktadır");
		}

	}

	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant();
		restaurant.menu();

	}

}
