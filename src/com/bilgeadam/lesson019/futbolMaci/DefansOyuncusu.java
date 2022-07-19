package com.bilgeadam.lesson019.futbolMaci;

public class DefansOyuncusu extends Oyuncu {

	private int pozisyonAlma;
	private int kafa;
	private int sicrama;

	public DefansOyuncusu(String adSoyad, int formaNo) {
		super(adSoyad, formaNo);
		this.pozisyonAlma = 60 + getRandom().nextInt(31);
		this.kafa = 60 + getRandom().nextInt(31);
		this.sicrama = 60 + getRandom().nextInt(31);

	}

	public int getPozisyonAlma() {
		return pozisyonAlma;
	}

	public void setPozisyonAlma(int pozisyonAlma) {
		this.pozisyonAlma = pozisyonAlma;
	}

	public int getKafa() {
		return kafa;
	}

	public void setKafa(int kafa) {
		this.kafa = kafa;
	}

	public int getSicrama() {
		return sicrama;
	}

	public void setSicrama(int sicrama) {
		this.sicrama = sicrama;
	}

	@Override
	public String toString() {
		return "DefansOyuncusu [pozisyonAlma=" + pozisyonAlma + ", kafa=" + kafa + ", sicrama=" + sicrama
				+ ", getAdSoyad()=" + getAdSoyad() + ", getFormaNo()=" + getFormaNo() + ", getDayaniklilik()="
				+ getDayaniklilik() + ", getHiz()=" + getHiz() + ", getPas()=" + getPas() + ", getSut()=" + getSut()
				+ ", getYetenek()=" + getYetenek() + ", getKararlilik()=" + getKararlilik() + ", getDogalForm()="
				+ getDogalForm() + ", getSans()=" + getSans() + "]";
	}

	@Override
	public int pasSkor() {
		int bonus = getRandom().nextInt(0, 4);
		int skor = (int) (getPas() * 0.2 + getYetenek() * 0.2 + getDayaniklilik() * 0.1 + getDogalForm() * 0.1
				+ getPozisyonAlma() * 0.1 + getSans() * 0.2 + bonus);
		return skor;
	}

	@Override
	public int golSkor(int kurtaris) {
		int bonus = (int) ((getRandom().nextInt(2, 5)) * (getDogalForm() * 0.075));
		int golSkor = (int) (getYetenek() * 0.3 + getSut() * 0.2 + getKararlilik() * 0.1 + getSans() * 0.1 + kafa * 0.1
				+ sicrama * 0.1 + getDogalForm() * 0.1) + bonus;
		return golSkor - kurtaris;
	}

}
