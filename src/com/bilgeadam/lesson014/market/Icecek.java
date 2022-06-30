package com.bilgeadam.lesson014.market;

public class Icecek extends Urun {

	boolean gazlıMı;
	boolean alkolluMu;

	public Icecek(String marka, String name, String sonKullanmaTarihi, String uretimTarihi, int stokAdedi,
			double alisFiyati, double satisFiyati, boolean gazlıMı, boolean alkolluMu) {
		super(marka, name, sonKullanmaTarihi, uretimTarihi, stokAdedi, alisFiyati, satisFiyati);
		this.gazlıMı = gazlıMı;
		this.alkolluMu = alkolluMu;
	}

	public boolean isGazlıMı() {
		return gazlıMı;
	}

	public void setGazlıMı(boolean gazlıMı) {
		this.gazlıMı = gazlıMı;
	}

	public boolean isAlkolluMu() {
		return alkolluMu;
	}

	public void setAlkolluMu(boolean alkolluMu) {
		this.alkolluMu = alkolluMu;
	}

	@Override
	public String toString() {
		return "Icecek [gazlıMı=" + gazlıMı + ", alkolluMu=" + alkolluMu + ", getMarka()=" + getMarka() + ", getName()="
				+ getName() + ", getSonKullanmaTarihi()=" + getSonKullanmaTarihi() + ", getUretimTarihi()="
				+ getUretimTarihi() + ", getStokAdedi()=" + getStokAdedi() + ", getAlisFiyati()=" + getAlisFiyati()
				+ ", getSatisFiyati()=" + getSatisFiyati() + "]";
	}

}
