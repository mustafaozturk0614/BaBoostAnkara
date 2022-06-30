package com.bilgeadam.lesson014;

public class Kitap {

	private int sayfaSayisi;
	private String kitapAdı;
	private String yazarAdı;

	public Kitap(String kitapAdı, String yazarAdı, int safyaSayisi) {
		setSayfaSayisi(safyaSayisi);
		this.kitapAdı = kitapAdı;
		this.yazarAdı = yazarAdı;
	}

	// getter setter için kısa yol shift alt s
	public int getSayfaSayisi() {
		return sayfaSayisi;
	}

	public void setSayfaSayisi(int sayfaSayisi) {

		if (sayfaSayisi < 10) {
			this.sayfaSayisi = 10;

		} else {
			this.sayfaSayisi = sayfaSayisi;
		}

	}

	public String getKitapAdı() {
		return kitapAdı;
	}

	public void setKitapAdı(String kitapAdı, boolean karar) {
		if (karar) {
			this.kitapAdı = kitapAdı;
		} else {
			System.out.println("Mahkeme kararı geçersizdir");
		}

	}

	public String getYazarAdı() {
		return yazarAdı;
	}

	@Override
	public String toString() {
		return "sayfaSayisi=" + sayfaSayisi + ",\n kitapAdı=" + kitapAdı + ",\n yazarAdı=" + yazarAdı;
	}

}
