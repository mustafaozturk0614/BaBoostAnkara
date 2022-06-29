package com.bilgeadam.lesson013.odeme;

/*
 * 
 *1- Market --Class
 * -ozellik1
 * -ozellik2
 * -ozellik3
 * -ozellik4
 * -Fonksiyon
 * 
 *2-Urunlerimiz -> Ana sınıf Class
 * -Alt sınıf -
 * -Alt sınıf
 * -Altsınıf
 * -Fonksiyon
 * 
 * Market yönetimi --> marketimize urunleri ekleyelim / urunleri listeleyelim; 
 * 
 * /
 */

public class Test {

	public static void main(String[] args) {

		KrediKartı krediKartı = new KrediKartı();
		krediKartı.limit = 5000;
		krediKartı.alıcınınIsmı = "xxx";
		krediKartı.ccvNo = 123;
		krediKartı.odeyeninIsmı = "yyy";
		krediKartı.odemeMıktarı = 1000;
		krediKartı.tutar = 1000;
		krediKartı.sonKullanmaTarihi = 25062023;

		System.out.println(krediKartı.alıcınınIsmı);
		System.out.println(krediKartı.odeyeninIsmı);
		System.out.println(krediKartı.odemeMıktarı);
		System.out.println(krediKartı.tutar);

		Nakit nakit = new Nakit();
		nakit.alıcınınIsmı = "yyy";
		nakit.odeyeninIsmı = "xxx";
		nakit.odemeTarihi = 29062022;
		nakit.odemeMıktarı = 1200;
		nakit.tutar = 1000;
		nakit.paraUstu = nakit.odemeMıktarı - nakit.tutar;

		System.out.println(nakit.alıcınınIsmı);
		System.out.println(nakit.odeyeninIsmı);
		System.out.println(nakit.odemeMıktarı);
		System.out.println(nakit.tutar);
		System.out.println(nakit.paraUstu);

	}
}
