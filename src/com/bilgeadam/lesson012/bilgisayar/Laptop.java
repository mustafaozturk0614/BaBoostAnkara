package com.bilgeadam.lesson012.bilgisayar;

public class Laptop extends Bilgisayar {

	int bataryaKapasitesi;
	String color;

	public void bataryaKontrol() {

		if (bataryaKapasitesi < 20) {

			System.out.println("Sarjınız Azaldı Lütfen prize takınız");

		}

	}

}
