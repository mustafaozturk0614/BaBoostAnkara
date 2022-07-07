package com.bilgeadam.lesson018.kuyruk;

/*
 * isim
 * şikayet
 * öncelik özelliği 
 * 
 * şikayete göre önceliği belirliyeceğiz
 * 
 *      Apandisit ----> En yüksek öncelik
        Yanık -------> Orta Öncelik
        Baş Ağrısı ---> En düşük öncelik
 * 
 * önceliğe göre kuyruğumuzu oluşturacağız
 * 
 * 
 */

public class Hasta implements Comparable<Hasta> {

	private String isim;
	private String sikayet;
	private int oncelik;

	public Hasta(String isim, String sikayet) {
		super();
		this.isim = isim;
		this.sikayet = sikayet;
		setOncelik(sikayet);
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSikayet() {
		return sikayet;
	}

	public void setSikayet(String sikayet) {
		this.sikayet = sikayet;
	}

	public int getOncelik() {
		return oncelik;
	}

	public void setOncelik(String sikayet) {

		if (sikayet.equalsIgnoreCase("Apandisit")) {

			this.oncelik = 1;
		} else if (sikayet.equalsIgnoreCase("Yanık")) {
			this.oncelik = 2;
		} else {
			this.oncelik = 3;
		}

	}

	@Override
	public int compareTo(Hasta hasta) {

		if (this.oncelik > hasta.oncelik) {
			return 1;

		} else if (this.oncelik < hasta.oncelik) {
			return -1;
		} else {
			return 0;
		}

	}

	@Override
	public String toString() {
		return "Hasta [isim=" + isim + ", sikayet=" + sikayet + ", oncelik=" + oncelik + "]";
	}

}
