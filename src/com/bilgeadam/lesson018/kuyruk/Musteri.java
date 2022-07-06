package com.bilgeadam.lesson018.kuyruk;

/*
 * 
 * isim ve yas
 */
public class Musteri implements Comparable<Musteri> {

	String isim;
	int yas;

	public Musteri(String isim, int yas) {
		super();
		this.isim = isim;
		this.yas = yas;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	@Override
	public String toString() {
		return "Musteri [isim=" + isim + ", yas=" + yas + "]";
	}

	@Override
	public int compareTo(Musteri o) {

		if (this.yas < 65) {
			return -1;

		} else if (this.yas > 65) {
			return 1;

		} else {
			return 0;
		}

	}

}
