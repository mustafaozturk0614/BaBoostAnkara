package com.bilgeadam.lesson017.sepet;

public enum EUrun {
	Cips(20), Kola(15), Şeker(60), Yağ(200), Un(50), Ekmek(5), Çay(60), Yumurta(14), Yoğurt(22), Süt(12);

	double fiyat;

	EUrun(double fiyat) {
		this.fiyat = fiyat;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

}
