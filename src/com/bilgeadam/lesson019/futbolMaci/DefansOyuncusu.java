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

}
