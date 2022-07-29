package com.bilgeadam.lesson027.singelton.enumSingelton;

public class Ev3 {

	public static void main(String[] args) {

		EvHalkı3 evHalkı1 = new EvHalkı3();
		EvHalkı3 evHalkı2 = new EvHalkı3();
//		Robot robot = new Robot(); // private olduğu için newleme işlemi yapılamıyor
		evHalkı1.start();
		evHalkı2.start();

	}

}
