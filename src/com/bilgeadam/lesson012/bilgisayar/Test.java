package com.bilgeadam.lesson012.bilgisayar;

public class Test {

	public static void main(String[] args) {
		//
// Anakartımızı oluşturduk
//		Anakart anakart = new Anakart();
//		anakart.name = "Asus";
//		anakart.model = "Atx";

//İşlemcimizi de oluşturduk
		Islemci ıslemci = new Islemci();
		ıslemci.name = "İntel";
		ıslemci.islemciHızı = "2.60 Ghz";
//Kalavye

		Klavye klavye = new Klavye();
		klavye.klavyeTipi = "Q";
		klavye.mekanikMi = true;

//Mouse 
		Mouse mouse = new Mouse();
		mouse.agırlık = 50;
		mouse.name = "logitech";
		mouse.tusSayısı = 4;
		mouse.hassasiyeti = 5600;
//Ram
		Ram ram = new Ram();
		ram.hızı = 400;
		ram.kapasitesi = 16;
		ram.name = "kingston";

// Usb
//
//		Usb usb = new Usb();
//		usb.hız = 400;
//		usb.tipi = "3.0";

		Bilgisayar bilgisayar = new Bilgisayar();

		bilgisayar.islemci = ıslemci;
		bilgisayar.klavye = klavye;
		bilgisayar.mouse = mouse;
		bilgisayar.ram = ram;
		bilgisayar.usb = new Usb();
		bilgisayar.usb.tipi = "3.0";
		bilgisayar.usb.hız = 400;
		bilgisayar.anakartOlustur();

		System.out.println(bilgisayar.ram.name);
		System.out.println(bilgisayar.mouse.agırlık);
		System.out.println(bilgisayar.islemci.name);
		System.out.println(bilgisayar.anaKart.model);
		System.out.println(bilgisayar.klavye.mekanikMi);
		System.out.println(bilgisayar.usb.tipi);
	}

}
