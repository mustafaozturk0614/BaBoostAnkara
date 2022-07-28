package com.bilgeadam.lesson026;

/*
 * 
 * 
 * 
 * run metodumuzdada 10 kere donsun ve her donuste 
 *calışanımızn ismi + çalışıyor -->kaçıncı kez çalıştığını yazdıralım ;
 *
 */

public class Calisan extends Thread {

	String name;

	public Calisan(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {

			System.out.println(name + " çalışıyor --->" + (i + 1));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
