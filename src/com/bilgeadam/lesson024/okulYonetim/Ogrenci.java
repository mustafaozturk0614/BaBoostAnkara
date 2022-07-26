package com.bilgeadam.lesson024.okulYonetim;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;

/*
 * 1- ogrencimiz 
 * 
 * ad 3 tane notu olacak birde dogum tarihi olacak
 * 
 * 1-ogrenci clası olusturucağız
 * 2-ogrencimanager clası olusturacağız
 * 3-okul clasımız olsun
 * 
 * 1-isim uzunlugu en az 3 olsun
 * ogrenci yası 8 den buyuk olacak
 * 2-notlar 0-100 arasında olacak
 * Her Biri için ayrı Exceptions sınıfları yaratacağım
 * -Ogrenci Manager de ise isim kontolu  yas kontrolu ve notları kontrol eden işlemleri yapacağız 
 * bu işlemlerde ise yarattımız exception sınıflarını kullancağız
 * ogrenci yaratma işlemi yapalım
 *  Ayrıca ogrenci için bir exception sınıfı daha oluşturup 
 *  
 *  Okul sınıfı içerisinde ögrenci listemize ogrenciler ekleyelim 
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class Ogrenci implements Serializable {

	private String name;
	private Double[] notlar;
	private LocalDate dogumTarihi;

	public Ogrenci(String name, LocalDate dogumTarihi) {
		super();
		this.name = name;
		this.dogumTarihi = dogumTarihi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double[] getNotlar() {
		return notlar;
	}

	public void setNotlar(Double[] notlar) {
		this.notlar = notlar;
	}

	public LocalDate getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(LocalDate dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	@Override
	public String toString() {
		return "Ogrenci [name=" + name + ", notlar=" + Arrays.toString(notlar) + ", dogumTarihi=" + dogumTarihi + "]";
	}

}
