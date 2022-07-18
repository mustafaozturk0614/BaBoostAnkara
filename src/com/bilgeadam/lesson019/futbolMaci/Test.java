package com.bilgeadam.lesson019.futbolMaci;

public class Test {

	public static void main(String[] args) {
		Takim takim = new Takim("Ev Sahibi");

		takim.getOyunculistesi().forEach(s -> System.out.println(s));

	}

}
