package com.bilgeadam.lesson001;

public class Question2 {

	public static void main(String[] args) {
		// amount türk lirası
		// excahangeRate 1 dolar 16.96 tl
		double amount = 5200;
		double excahangeRate = 16.96;
		double result = amount / excahangeRate;

		System.out.println(result);
	}
}