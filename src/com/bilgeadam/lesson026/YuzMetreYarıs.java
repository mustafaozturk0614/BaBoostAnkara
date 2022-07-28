package com.bilgeadam.lesson026;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class YuzMetreYarıs {

	public static void main(String[] args) {

//		Kosucu kosucu1 = new Kosucu("ŞahBatur");
//		Kosucu kosucu2 = new Kosucu("OymaPınar");
//
//		Thread thread1 = new Thread(kosucu1);
//		Thread thread2 = new Thread(kosucu2);
//
//		thread1.start();
//		thread2.start();

//		try {
//			Thread.sleep(21000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		if (kosucu1.sure > kosucu2.sure) {
//			System.err.println(kosucu2.name + " Yarışı kazandı");
//
//		} else {
//			System.err.println(kosucu1.name + " Yarışı kazandı");
//		}

		yaris();

	}

	public static void yaris() {

		ExecutorService ex = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			ex.submit(new Kosucu((i + 1) + ".Koşucu"));
		}
		ex.shutdown();

	}

}
