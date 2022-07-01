package com.bilgeadam.lesson015.calısan;

public class Test {

	public static void main(String[] args) {

		Muhendis muhendis = new Muhendis("Mustafa", "ÖZtürk");
		System.out.println(muhendis);
		muhendis.zamYap(10);
		System.out.println(muhendis);
		muhendis = new Muhendis("Kemal ", "Öztürk", 16000);
		System.out.println(muhendis);
		muhendis.zamYap(30);
		System.out.println(muhendis);

		OfisCalisani ofisCalisani = new OfisCalisani("Tuba", "ÖZtürk");
		System.out.println(ofisCalisani);
		ofisCalisani.zamYap(25);
		System.out.println(ofisCalisani);
		ofisCalisani.zamYap(40);
		System.out.println(ofisCalisani);
	}

}
