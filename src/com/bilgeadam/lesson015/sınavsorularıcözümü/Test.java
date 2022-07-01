package com.bilgeadam.lesson015.sınavsorularıcözümü;

public class Test {

	public static void main(String[] args) {

		CustomString customString = new CustomString();

		customString.string = "Merhaba dünya ";
		System.out.println(customString.uzunluk());
		System.out.println(customString.iceriyormu("Mer"));

	}
}
