package com.bilgeadam.lesson017.sepet;

public enum Urun {
	Cips(20), Kola(15), Şeker(60), Yağ(200), Un(50), Ekmek(5), Çay(60), Yumurta(14), Yoğurt(22), Süt(12);

	int fiyat;

	Urun(int fiyat) {
		this.fiyat = fiyat;
	}

	public int getFiyat() {
		return fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}

}
