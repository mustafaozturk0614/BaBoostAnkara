package com.bilgeadam.lesson019.futbolMaci;

public class Kaleci extends Oyuncu {

	private int kurtaris;

	public Kaleci(String adSoyad, int formaNo) {
		super(adSoyad, formaNo);
		this.kurtaris = 65 + getRandom().nextInt(41);
	}

	public int getKurtaris() {
		return kurtaris;
	}

	public void setKurtaris(int kurtaris) {
		this.kurtaris = kurtaris;
	}

	@Override
	public String toString() {
		return "Kaleci [kurtaris=" + kurtaris + ", getAdSoyad()=" + getAdSoyad() + ", getFormaNo()=" + getFormaNo()
				+ ", getDayaniklilik()=" + getDayaniklilik() + ", getHiz()=" + getHiz() + ", getPas()=" + getPas()
				+ ", getSut()=" + getSut() + ", getYetenek()=" + getYetenek() + ", getKararlilik()=" + getKararlilik()
				+ ", getDogalForm()=" + getDogalForm() + ", getSans()=" + getSans() + "]";
	}

	@Override
	public int pasSkor() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int kurtarısSkor() {
		int bonus = (int) (getRandom().nextInt(1, 5) * getDogalForm() * 0.025);
		int skor = (int) (kurtaris * 0.2 + getKararlilik() * 0.1) + bonus;
		return skor;
	}

	@Override
	public int golSkor(int kurtaris) {
		// TODO Auto-generated method stub
		return 0;
	}

}
