package com.bilgeadam.lesson026;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Durak {

	List<Taksi> taksilerList = new ArrayList<Taksi>();

	static Queue<Integer> kuyruk = new LinkedList<Integer>();

	public Durak() {
		this.kuyrukOlustur();
		this.taksiOlustur();
	}

	public void kuyrukOlustur() {

		for (int i = 1; i < 101; i++) {

			kuyruk.offer(i);
		}
		System.out.println("Kuyruk oluştu");
	}

	public void taksiOlustur() {

		for (int i = 1; i < 11; i++) {

			taksilerList.add(new Taksi(i));
		}
		System.out.println("Taksiler oluştu");
	}

	public void musteriAl() {
//		ExecutorService ex = Executors.newFixedThreadPool(12);
//
//		for (int i = 0; i < 10; i++) {
//
//			ex.submit(taksilerList.get(i));
//
//		}
//
//		ex.shutdown();

		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(taksilerList.get(i));
			thread.start();
		}

	}

	public static void main(String[] args) {

		Durak durak = new Durak();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		durak.musteriAl();

	}

}
