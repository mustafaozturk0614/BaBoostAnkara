package com.bilgeadam.lesson014.market;

public class Temizlik extends Urun {

	private boolean tehlikeliMaddeIceriyorMu;

	public Temizlik(String marka, String name, String sonKullanmaTarihi, String uretimTarihi, int stokAdedi,
			double alisFiyati, double satisFiyati, boolean tehlikeliMaddeIceriyorMu) {
		super(marka, name, sonKullanmaTarihi, uretimTarihi, stokAdedi, alisFiyati, satisFiyati);
		this.tehlikeliMaddeIceriyorMu = tehlikeliMaddeIceriyorMu;
	}

	public boolean isTehlikeliMaddeIceriyorMu() {
		return tehlikeliMaddeIceriyorMu;
	}

	public void setTehlikeliMaddeIceriyorMu(boolean tehlikeliMaddeIceriyorMu) {
		this.tehlikeliMaddeIceriyorMu = tehlikeliMaddeIceriyorMu;
	}

	@Override
	public String toString() {
		return "Temizlik [tehlikeliMaddeIceriyorMu=" + tehlikeliMaddeIceriyorMu + ", getMarka()=" + getMarka()
				+ ", getName()=" + getName() + ", getSonKullanmaTarihi()=" + getSonKullanmaTarihi()
				+ ", getUretimTarihi()=" + getUretimTarihi() + ", getStokAdedi()=" + getStokAdedi()
				+ ", getAlisFiyati()=" + getAlisFiyati() + ", getSatisFiyati()=" + getSatisFiyati() + "]";
	}

}
