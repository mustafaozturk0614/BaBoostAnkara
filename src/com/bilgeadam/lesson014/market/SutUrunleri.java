package com.bilgeadam.lesson014.market;

public class SutUrunleri extends Urun {

	private String tip;

	private boolean gunlukMu;

	public SutUrunleri(String marka, String name, String sonKullanmaTarihi, String uretimTarihi, int stokAdedi,
			double alisFiyati, double satisFiyati, String tip, boolean gunlukMu) {
		super(marka, name, sonKullanmaTarihi, uretimTarihi, stokAdedi, alisFiyati, satisFiyati);
		this.tip = tip;
		this.gunlukMu = gunlukMu;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public boolean isGunlukMu() {
		return gunlukMu;
	}

	public void setGunlukMu(boolean gunlukMu) {
		this.gunlukMu = gunlukMu;
	}

	@Override
	public String toString() {
		return "SutUrunleri [tip=" + tip + ", gunlukMu=" + gunlukMu + ", getMarka()=" + getMarka() + ", getName()="
				+ getName() + ", getSonKullanmaTarihi()=" + getSonKullanmaTarihi() + ", getUretimTarihi()="
				+ getUretimTarihi() + ", getStokAdedi()=" + getStokAdedi() + ", getAlisFiyati()=" + getAlisFiyati()
				+ ", getSatisFiyati()=" + getSatisFiyati() + "]";
	}

}
