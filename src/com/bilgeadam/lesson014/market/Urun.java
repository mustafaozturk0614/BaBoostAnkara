package com.bilgeadam.lesson014.market;

public class Urun {

	private String marka;
	private String name;
	private String sonKullanmaTarihi;
	private String uretimTarihi;
	private int stokAdedi;
	private double alisFiyati;
	private double satisFiyati;
	static int index;

//	public Urun() {
//		// TODO Auto-generated constructor stub
//	}

	public Urun(String marka, String name, String sonKullanmaTarihi, String uretimTarihi, int stokAdedi,
			double alisFiyati, double satisFiyati) {
		super();
		this.marka = marka;
		this.name = name;
		this.sonKullanmaTarihi = sonKullanmaTarihi;
		this.uretimTarihi = uretimTarihi;
		this.stokAdedi = stokAdedi;
		this.alisFiyati = alisFiyati;
		this.satisFiyati = satisFiyati;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSonKullanmaTarihi() {
		return sonKullanmaTarihi;
	}

	public void setSonKullanmaTarihi(String sonKullanmaTarihi) {
		this.sonKullanmaTarihi = sonKullanmaTarihi;
	}

	public String getUretimTarihi() {
		return uretimTarihi;
	}

	public void setUretimTarihi(String uretimTarihi) {
		this.uretimTarihi = uretimTarihi;
	}

	public int getStokAdedi() {
		return stokAdedi;
	}

	public void setStokAdedi(int stokAdedi) {
		this.stokAdedi = stokAdedi;
	}

	public double getAlisFiyati() {
		return alisFiyati;
	}

	public void setAlisFiyati(double alisFiyati) {
		this.alisFiyati = alisFiyati;
	}

	public double getSatisFiyati() {
		return satisFiyati;
	}

	public void setSatisFiyati(double satisFiyati) {
		this.satisFiyati = satisFiyati;
	}

	@Override
	public String toString() {
		return "Urun [marka=" + marka + ", name=" + name + ", sonKullanmaTarihi=" + sonKullanmaTarihi
				+ ", uretimTarihi=" + uretimTarihi + ", stokAdedi=" + stokAdedi + ", alisFiyati=" + alisFiyati
				+ ", satisFiyati=" + satisFiyati + "]";

	}

}
