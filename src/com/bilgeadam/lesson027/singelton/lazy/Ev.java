package com.bilgeadam.lesson027.singelton.lazy;

public class Ev {

	public static void main(String[] args) {

		EvHalkı evHalkı1 = new EvHalkı();
		EvHalkı evHalkı2 = new EvHalkı();
		EvHalkı evHalkı3 = new EvHalkı();
		EvHalkı evHalkı4 = new EvHalkı();
//		Robot robot = new Robot(); // private olduğu için newleme işlemi yapılamıyor
		evHalkı1.start();
		evHalkı2.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		evHalkı3.start();
		evHalkı4.start();

	}

}
