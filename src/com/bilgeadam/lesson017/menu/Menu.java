package com.bilgeadam.lesson017.menu;

public class Menu {

	EYemek yemek;
	ECorba corba;
	EIcecek icecek;
	ETatli tatli;

	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public Menu(EYemek yemek, ECorba corba, EIcecek icecek, ETatli tatli) {
		super();
		this.yemek = yemek;
		this.corba = corba;
		this.icecek = icecek;
		this.tatli = tatli;
	}

	public EYemek getYemek() {
		return yemek;
	}

	public void setYemek(EYemek yemek) {
		this.yemek = yemek;
	}

	public ECorba getCorba() {
		return corba;
	}

	public void setCorba(ECorba corba) {
		this.corba = corba;
	}

	public EIcecek getIcecek() {
		return icecek;
	}

	public void setIcecek(EIcecek icecek) {
		this.icecek = icecek;
	}

	public ETatli getTatli() {
		return tatli;
	}

	public void setTatli(ETatli tatli) {
		this.tatli = tatli;
	}

	@Override
	public String toString() {
		return "Menu [yemek=" + yemek + ", corba=" + corba + ", icecek=" + icecek + ", tatli=" + tatli + "]";
	}

}
