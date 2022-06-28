package com.bilgeadam.lesson011;

public class Student {

	int studentNumber;
//
//	final  maximumnumberoflessons:6;

	public static void main(String[] args) {

		int sayi1 = 3;
		int sayi2 = 7;

		int toplam = sayi1++ + ++sayi1 + --sayi2 - ++sayi1;
		System.out.println(toplam);
	}
//
//	public static void register() {
//		studentNumber++;
//		System.out.println(studentNumber, "nolu oğrencikayıtolmuştur");
//		System.out.println("En fazla " + maximumnumberoflessons + "tane ders alabilir");
//
//	}

}
