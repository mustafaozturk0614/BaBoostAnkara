package com.bilgeadam.lesson026;

public class ThreadTest {

	public static void main(String[] args) {

		Calisan calisan = new Calisan("Ali");
		Calisan calisan2 = new Calisan("Mert");

		calisan.start();
		calisan2.start();

	}

}
