package com.bilgeadam.lesson021;

import java.time.LocalDate;

/*
 * 
 * 
 * iki tane özellik 
 * isim birde fiyatı 
 * 
 * urun yarat metodu 
 * dışarıdan scanner ile isim ve fiyat değerlerini alacağız
 *  koşul oluşturacağız eğer urunun ismi yok ise veya urunun fiyatı 0 dan küçük ise bize null 
 *  eğer ikisi bu kontrolleri geçiyorsa bize yeni bir urun yaratıp o urunu donsun 
 * 
 * 
 * Son kullanma tarihi Localdate
 * 
 */
public class Urun {

	String isim;
	double fiyat;
	LocalDate sonKullanmaTarihi;

	public Urun(String isim, double fiyat) {
		super();
		this.isim = isim;
		this.fiyat = fiyat;
	}

	public Urun(String isim, double fiyat, LocalDate sonKullanmaTarihi) {
		super();
		this.isim = isim;
		this.fiyat = fiyat;
		this.sonKullanmaTarihi = sonKullanmaTarihi;
	}

	@Override
	public String toString() {
		return "Urun [isim=" + isim + ", fiyat=" + fiyat + ", sonKullanmaTarihi=" + sonKullanmaTarihi + "]";
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	public LocalDate getSonKullanmaTarihi() {
		return sonKullanmaTarihi;
	}

	public void setSonKullanmaTarihi(LocalDate sonKullanmaTarihi) {
		this.sonKullanmaTarihi = sonKullanmaTarihi;
	}

}
