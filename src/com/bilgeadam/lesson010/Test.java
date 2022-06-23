package com.bilgeadam.lesson010;

public class Test {

	public static void main(String[] args) {
		Araba araba = new Araba();
		araba.marka = "Toyata";
		araba.model = "Corolla";
		araba.renk = "Beyaz";
		araba.uretimYılı = 2020;
		araba.motor = new Motor();
		System.out.println(araba.motor.motorGucu);
		araba.motor.motorGucu = 1.4;
		System.out.println(araba.motor.motorGucu);

	}
}