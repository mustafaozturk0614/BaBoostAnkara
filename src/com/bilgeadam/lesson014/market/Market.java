package com.bilgeadam.lesson014.market;

public class Market {

	private Urun[] urunler;
	private String name;
	private int calısanSayisi;
	private int mesaiSaati;

	public Market() {
		this.urunler = new Urun[5];
	}

	public Market(String name, int calısanSayisi, int mesaiSaati) {
		this();
		this.name = name;
		this.calısanSayisi = calısanSayisi;
		this.mesaiSaati = mesaiSaati;
	}

	public Urun[] getUrunler() {
		return urunler;
	}

	public void setUrunler(Urun[] urunler) {
		this.urunler = urunler;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalısanSayisi() {
		return calısanSayisi;
	}

	public void setCalısanSayisi(int calısanSayisi) {
		this.calısanSayisi = calısanSayisi;
	}

	public int getMesaiSaati() {
		return mesaiSaati;
	}

	public void setMesaiSaati(int mesaiSaati) {
		this.mesaiSaati = mesaiSaati;
	}

}
