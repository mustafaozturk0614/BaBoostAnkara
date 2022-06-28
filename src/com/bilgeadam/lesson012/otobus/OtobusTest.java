package com.bilgeadam.lesson012.otobus;

public class OtobusTest {

	public static void main(String[] args) {

		Otobus otobus = new Otobus();
		otobus.color = "Sarı";
		otobus.marka = "Mercedes";
		otobus.uzunluk = 100;
		otobus.yolcuKapasitesi = 46;
		otobus.otobusBilgileri();
		System.out.println("------------------------------");
		otobus.hareketeGec();
		otobus.hızlan();
		otobus.yavasla();
		otobus.dur();

		Durak durak = new Durak();
		durak.adres = "Ankara";
		durak.durakNo = "1206";
		durak.durakAdı = "Atatürk Bulvarı";

		Durak durak2 = new Durak();
		durak2.adres = "Ankara";
		durak2.durakNo = "1205";
		durak2.durakAdı = "Sıhhiye";

		Guzergah guzergah = new Guzergah();
		guzergah.hatNo = "422";
		guzergah.duraklar = new Durak[2];
		guzergah.duraklar[0] = durak;
		guzergah.duraklar[1] = durak2;

		otobus.guzegah = guzergah;

		Guzergah guzergah2 = otobus.guzegah;
		Durak durak3 = otobus.guzegah.duraklar[0];

		Durak[] duraklar = otobus.guzegah.duraklar;

		for (int i = 0; i < otobus.guzegah.duraklar.length; i++) {

			System.out.println(otobus.guzegah.duraklar[i].durakNo);

		}

		for (int i = 0; i < duraklar.length; i++) {

			System.out.println(duraklar[i].durakNo);

		}

	}

}
