package com.bilgeadam.lesson026;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//* Taksilerimizin her biri bri thread olacak

//* taksiler için bir id 
//* bilr hız 
//* bir aldığı musterilerin ındexini tutn bir yapı
//* ve toplam musteri sayısı
//* özelliklerimiz olsun
//* 
//* Durağımızda toplam 10 adet taksi olsun ve  durak onunde 100 kişilik 
//* bir müşteri kuygrugu olsun bu musterilerimiz için sınıf yaratmayalım 
//* bir int bir id değeri olarak tutalım 
//* 
//* 10 adet taksimiz hızlarına göre kuyruktan sırayla musteri alacaklardır

public class Taksi implements Runnable {

	int id;
	long beklemeSuresi;
	List<Integer> musteriNolari = new ArrayList<Integer>();
	long musteriSayisi;

	public Taksi(int id) {
		super();
		Random random = new Random();
		this.id = id;
		this.beklemeSuresi = random.nextLong(1000, 5000);
	}

	@Override
	public void run() {
		while (!Durak.kuyruk.isEmpty()) {

			int musteriNo = Durak.kuyruk.poll();
			musteriNolari.add(musteriNo);
			System.out.println(id + ".Taksi --> " + musteriNolari.size() + ".müsterisini aldı-->" + musteriNo);

			try {
				Thread.sleep(beklemeSuresi);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		musteriSayisi = musteriNolari.size();
		System.out.println(id + ".Taksinin mesaisi sona erdi");
	}

}
