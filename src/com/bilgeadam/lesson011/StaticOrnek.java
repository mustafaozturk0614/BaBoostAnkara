package com.bilgeadam.lesson011;

public class StaticOrnek {

	int number = 0;
//	static int number2;

	public static void main(String[] args) {

		StaticOrnek staticOrnek = new StaticOrnek();
		staticOrnek.number = 2;
		staticOrnek.numaraVer();
		StaticOrnek staticOrnek2 = new StaticOrnek();
		staticOrnek2.numaraVer();

	}

	public void numaraVer() {
		number += 1;
//		number2 += 1;
		System.out.println("number1=" + number);
//		System.out.println("number2=" + number2);
	}

}
