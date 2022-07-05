package com.bilgeadam.lesson017.menu;

public enum EIcecek {

	AYRAN(false), KOLA(false), FANTA(false), GAZOZ(false), MEYVESUYU(false), MEYVELİSODA(false), LİMONATA(false);

	boolean atandımı;

	EIcecek(boolean atandımı) {
		this.atandımı = atandımı;
	}

	public boolean isAtandımı() {
		return atandımı;
	}

	public void setAtandımı(boolean atandımı) {
		this.atandımı = atandımı;
	}

}
