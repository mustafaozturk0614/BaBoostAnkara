package com.bilgeadam.lesson019.futbolMaci;

public class OrtaSahaOyuncusu extends Oyuncu {

	private int uzunTop;
	private int ilkDokunus;
	private int topSurme;
	private int uretkenlik;
	private int ozelYetenek;

	public OrtaSahaOyuncusu(String adSoyad, int formaNo) {
		super(adSoyad, formaNo);
		this.uzunTop = 60 + getRandom().nextInt(41);
		this.ilkDokunus = 60 + getRandom().nextInt(41);
		this.topSurme = 60 + getRandom().nextInt(41);
		this.ozelYetenek = 60 + getRandom().nextInt(41);
	}

	public int getUzunTop() {
		return uzunTop;
	}

	public void setUzunTop(int uzunTop) {
		this.uzunTop = uzunTop;
	}

	public int getIlkDokunus() {
		return ilkDokunus;
	}

	public void setIlkDokunus(int ilkDokunus) {
		this.ilkDokunus = ilkDokunus;
	}

	public int getTopSurme() {
		return topSurme;
	}

	public void setTopSurme(int topSurme) {
		this.topSurme = topSurme;
	}

	public int getUretkenlik() {
		return uretkenlik;
	}

	public void setUretkenlik(int uretkenlik) {
		this.uretkenlik = uretkenlik;
	}

	public int getOzelYetenek() {
		return ozelYetenek;
	}

	public void setOzelYetenek(int ozelYetenek) {
		this.ozelYetenek = ozelYetenek;
	}

	@Override
	public String toString() {
		return "OrtaSahaOyuncusu [uzunTop=" + uzunTop + ", ilkDokunus=" + ilkDokunus + ", topSurme=" + topSurme
				+ ", uretkenlik=" + uretkenlik + ", ozelYetenek=" + ozelYetenek + ", getAdSoyad()=" + getAdSoyad()
				+ ", getFormaNo()=" + getFormaNo() + ", getDayaniklilik()=" + getDayaniklilik() + ", getHiz()="
				+ getHiz() + ", getPas()=" + getPas() + ", getSut()=" + getSut() + ", getYetenek()=" + getYetenek()
				+ ", getKararlilik()=" + getKararlilik() + ", getDogalForm()=" + getDogalForm() + ", getSans()="
				+ getSans() + "]";
	}

	@Override
	public int pasSkor() {
		int bonus = getRandom().nextInt(1, 8);
		int skor = (int) (getPas() * 0.2 + getYetenek() * 0.2 + getOzelYetenek() * 0.2 + getDayaniklilik() * 0.1
				+ getDogalForm() * 0.1 + getSans() * 0.1 + bonus);
		return skor;
	}

	@Override
	public int golSkor(int kurtaris) {
		int bonus = (int) ((getRandom().nextInt(1, 6)) * (getDogalForm() * 0.075));
		int golSkor = (int) (getYetenek() * 0.2 + ozelYetenek * 0.2 + getSut() * 0.2 + ilkDokunus * 0.1
				+ getKararlilik() * 0.1 + getSans() * 0.1 + getDogalForm() * 0.1) + bonus;
		return golSkor - kurtaris;
	}

}
