package com.bilgeadam.lesson012.bilgisayar;

public class Bilgisayar {

	Anakart anaKart;
	Islemci islemci;
	Ram ram;
	Klavye klavye;
	Usb usb;
	Mouse mouse;

	public void anakartOlustur() {

		anaKart = new Anakart();
		anaKart.name = "Asus";
		anaKart.model = "Atxx";
	}

}
