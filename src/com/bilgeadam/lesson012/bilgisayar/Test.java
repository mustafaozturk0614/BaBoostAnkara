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

		MasaUstu masaUstu = new MasaUstu();
		masaUstu.islemci = new Islemci();
		masaUstu.islemci.islemciHızı = "500";
		masaUstu.klavye = klavye;
		masaUstu.mouse = mouse;
		masaUstu.ram = ram;
		masaUstu.usb = new Usb();
		masaUstu.usb.tipi = "3.0";
		masaUstu.usb.hız = 400;
		masaUstu.anakartOlustur();
		masaUstu.kasaBoyutu = 100;
		System.out.println(masaUstu.ram.name);
		System.out.println(masaUstu.mouse.agırlık);
		System.out.println(masaUstu.islemci.name);
		System.out.println(masaUstu.anaKart.model);
		System.out.println(masaUstu.klavye.mekanikMi);
		System.out.println(masaUstu.usb.tipi);
		System.out.println(masaUstu.kasaBoyutu);
		System.out.println("/////////////////////////////////");
		Laptop laptop = new Laptop();
		laptop.islemci = ıslemci;
		laptop.klavye = klavye;
		laptop.mouse = mouse;
		laptop.ram = ram;
		laptop.usb = new Usb();
		laptop.usb.tipi = "3.0";
		laptop.usb.hız = 400;
		laptop.anakartOlustur();
		laptop.bataryaKapasitesi = 15;
		System.out.println(laptop.ram.name);
		System.out.println(laptop.mouse.agırlık);
		System.out.println(laptop.islemci.name);
		System.out.println(laptop.anaKart.model);
		System.out.println(laptop.klavye.mekanikMi);
		System.out.println(laptop.usb.tipi);
		System.out.println(laptop.bataryaKapasitesi);
		laptop.bataryaKontrol();
	}

}
