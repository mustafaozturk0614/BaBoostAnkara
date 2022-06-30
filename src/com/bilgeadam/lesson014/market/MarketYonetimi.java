package com.bilgeadam.lesson014.market;

import java.util.Scanner;

public class MarketYonetimi {

	Market market;

	public MarketYonetimi() {
		this.market = new Market();

	}

	public void menu() {

		Scanner scanner = new Scanner(System.in);
		int input = 0;
		do {

			System.out.println("====Market Uygulaması=======\n");
			System.out.println("1-Yeni ürün Ekle(Stokta olmayan ürün ekle)");
			System.out.println("2-Ürün ekle(Stokta bulunan ürün üzerine yeni sini eklemek) ");
			System.out.println("3-Ürünleri Listele ");
			System.out.println("Lütfen bir secim yapınız \n");
			input = scanner.nextInt();
			scanner.nextLine();

			switch (input) {
			case 1:
				System.out.println("Lütfen urun Turunu giriniz");
				String urunTuru = scanner.nextLine();
				yeniUrunGir(urunTuru);
				break;
			case 2:

				break;
			case 3:

				urunleriListele();

				break;

			default:
				break;
			}

		} while (input != 0);

	}

	private void urunleriListele() {

		for (Urun urun : market.getUrunler()) {
			if (urun != null) {
				System.out.println(urun);
			}

		}

	}

	private void yeniUrunGir(String urunTuru) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen urununuzun markasını giriniz");
		String marka = scanner.nextLine();
		System.out.println("Lütfen urununuzun ismini giriniz");
		String name = scanner.nextLine();
		System.out.println("Lütfen Son kullanma tarihini markasını giriniz");
		String sonKullanmaTarihi = scanner.nextLine();
		System.out.println("Lütfen uretim Tarihini markasını giriniz");
		String uretimTarihi = scanner.nextLine();
		System.out.println("Lütfen stok adedini giriniz");
		int stokAdedi = scanner.nextInt();
		System.out.println("Lütfen alıs fiyatını giriniz");
		double alısFiyatı = scanner.nextDouble();
		System.out.println("Lütfen satıs fiyatını giriniz");
		double satısFiyatı = scanner.nextDouble();
		scanner.nextLine();

		if (urunTuru.equalsIgnoreCase("Temizlik")) {

			System.out.println("Tehlikeli madde içeriyor mu");
			boolean tehlikeliMi = scanner.nextBoolean();
			Temizlik temizlik = new Temizlik(marka, name, sonKullanmaTarihi, uretimTarihi, stokAdedi, alısFiyatı,
					satısFiyatı, tehlikeliMi);
			market.getUrunler()[Urun.index] = temizlik;
			Urun.index++;

		} else if (urunTuru.equalsIgnoreCase("Süt")) {
			System.out.println("Günlük mü");
			boolean günlükMü = scanner.nextBoolean();
			System.out.println("Ürün tipini giriniz");
			String tip = scanner.nextLine();
			SutUrunleri sutUrunleri = new SutUrunleri(marka, name, sonKullanmaTarihi, uretimTarihi, stokAdedi,
					alısFiyatı, satısFiyatı, tip, günlükMü);
			market.getUrunler()[Urun.index] = sutUrunleri;
			Urun.index++;

		} else if (urunTuru.equalsIgnoreCase("içecek")) {
			System.out.println("Gazlı içecek mi");
			boolean gazlıMı = scanner.nextBoolean();
			System.out.println("Alkollü içecek mi");
			boolean alkolluMu = scanner.nextBoolean();
			Icecek ıcecek = new Icecek(marka, name, sonKullanmaTarihi, uretimTarihi, stokAdedi, alısFiyatı, satısFiyatı,
					gazlıMı, alkolluMu);
			market.getUrunler()[Urun.index] = ıcecek;
			Urun.index++;

		}

	}

	public static void main(String[] args) {

		MarketYonetimi marketYonetimi = new MarketYonetimi();
		;
		marketYonetimi.menu();

	}

}
