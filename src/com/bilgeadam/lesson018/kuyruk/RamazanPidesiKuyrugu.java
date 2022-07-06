package com.bilgeadam.lesson018.kuyruk;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/*
 *  String kuyruk tanımlıyacağız 
 *  
 *  buna değerler ekleyeceğiz 
 *  
 *  10 12 tane isim ekleyeceğiz
 *  
 *  random 1-10 arası sayı üretecez bu sayı bizim pide sayımız olacak
 *  
 *  kuyruga göre pideleri dağıtcaz pide bittiğinde pide biiti uyarısnı yazdıralım 
 *  birde geriye kuyrukta kimler kalmış onları yazdıralım 
 * 
 * 
 * 
 * 
 * 
 */

public class RamazanPidesiKuyrugu {

	public static void main(String[] args) throws InterruptedException {

		Queue<String> kuyruk = new LinkedList<String>();

		kuyruk.offer("Ahmet");
		kuyruk.offer("Murat");
		kuyruk.offer("Hasan");
		kuyruk.offer("Okan");
		kuyruk.offer("Zeliha");
		kuyruk.offer("Sümeyye");
		kuyruk.offer("Ezgi");
		kuyruk.offer("Gizem");
		kuyruk.offer("Oğuz");
		kuyruk.offer("Atilla");
		kuyruk.offer("Mustafa");
		Random random = new Random();

		int pideSayisi = 1 + random.nextInt(10);
		System.out.println("Pideler Çıkıyor....");
		System.out.println("Çıkan Pide sayısı= " + pideSayisi);
		Thread.sleep(2000);

		while (pideSayisi != 0) {
			System.out.println(kuyruk.poll() + " pidesini aldı");
			pideSayisi--;
			Thread.sleep(1000);

		}
		System.out.println("Pide kalmadı ....");

		kuyruk.forEach(s -> System.out.println(s));

	}

}
