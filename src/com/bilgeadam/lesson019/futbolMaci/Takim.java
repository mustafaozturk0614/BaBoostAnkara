package com.bilgeadam.lesson019.futbolMaci;

import java.util.ArrayList;
import java.util.List;

public class Takim {

	private String isim;
	private Kaleci kaleci;
	private List<Oyuncu> oyunculistesi;

	public Takim(String isim) {
		this.oyunculistesi = new ArrayList<Oyuncu>();
		this.isim = isim;
		defansOlustur();
		ortaSahaOlustur();
		forvetOlustur();

	}

	public void defansOlustur() {
		for (int i = 0; i < 4; i++) {
			DefansOyuncusu defansOyuncusu = new DefansOyuncusu("Defans " + (i + 1), i + 2);
			defansOyuncusu.setTakim(this);
			oyunculistesi.add(defansOyuncusu);
		}

	}

	public void ortaSahaOlustur() {
		for (int i = 0; i < 4; i++) {
			OrtaSahaOyuncusu ortaSahaOyuncusu = new OrtaSahaOyuncusu("OrtaSaha " + (i + 1), i + 6);
			ortaSahaOyuncusu.setTakim(this);
			oyunculistesi.add(ortaSahaOyuncusu);
		}
	}

	public void forvetOlustur() {
		for (int i = 0; i < 2; i++) {
			ForvetOyuncusu forvetOyuncusu = new ForvetOyuncusu("Forvet " + (i + 1), i + 10);
			forvetOyuncusu.setTakim(this);
			oyunculistesi.add(forvetOyuncusu);
		}
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public Kaleci getKaleci() {
		Kaleci kaleci = new Kaleci("Kaleci", 1);
		kaleci.setTakim(this);
		return kaleci;
	}

	public Kaleci kaleciOlustur() {
		Kaleci kaleci = new Kaleci("Kaleci", 1);
		kaleci.setTakim(this);
		return kaleci;
	}

	public void setKaleci(Kaleci kaleci) {
		this.kaleci = kaleci;
	}

	public List<Oyuncu> getOyunculistesi() {
		return oyunculistesi;
	}

	public void setOyunculistesi(List<Oyuncu> oyunculistesi) {
		this.oyunculistesi = oyunculistesi;
	}

	@Override
	public String toString() {
		return "Takim [isim=" + isim + ", kaleci=" + kaleci + ", oyunculistesi=" + oyunculistesi + "]";
	}

}
