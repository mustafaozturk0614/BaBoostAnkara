package com.bilgeadam.lesson027.singelton.eager;

public class Ev2 {

	public static void main(String[] args) {

		EvHalkı2 evHalkı1 = new EvHalkı2();
		EvHalkı2 evHalkı2 = new EvHalkı2();
//		Robot robot = new Robot(); // private olduğu için newleme işlemi yapılamıyor
		evHalkı1.start();
		evHalkı2.start();

	}

}
