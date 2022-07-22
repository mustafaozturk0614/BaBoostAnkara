package com.bilgeadam.lesson021;

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

	public Urun(String isim, double fiyat) {
		super();
		this.isim = isim;
		this.fiyat = fiyat;
	}

}
