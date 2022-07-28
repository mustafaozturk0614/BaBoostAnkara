package com.bilgeadam.lesson026;

/*
 * 
 * Thread yapmanız 
 * run metodu içerisinde 
 * 100 metre koşu yaptıracağız 0-100 hersayıda mesafemiz 1 artacak 
 * her 10 metrede 1 çıktı verelim kosucu su mesefade
 *  metodumuzun sonunda suremizi heseplasın 
 * 
 * 
 * 
 */
public class Kosucu implements Runnable {

	String name;
	int mesefa;
	long sure;

	public Kosucu(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		long baslangıc = System.currentTimeMillis();
		System.out.println(name + "Yarışa başladı");
		while (mesefa != 100) {
			mesefa++;
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (mesefa % 10 == 0) {
				System.out.println(name + "-->" + mesefa + ".metrede");
			}

		}
		long bitis = System.currentTimeMillis();
		sure = bitis - baslangıc;
		System.out.println(name + "adlı kosucu 100 metreyi" + sure + " mili saniyede koştu");

	}

}
