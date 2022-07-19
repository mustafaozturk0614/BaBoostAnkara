package com.bilgeadam.lesson019.futbolMaci;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mac {

	List<Takim> takimlarListesiList;

	public Mac() {
		takimlarListesiList = new ArrayList<Takim>();
		takimlarListesiList.add(new Takim("Ev Sahibi"));
		takimlarListesiList.add(new Takim("Deplasman"));

	}

	public Takim takımDegistir(Takim takim) {
		int teamİndex = takimlarListesiList.indexOf(takim);
		if (teamİndex == 1) {
			teamİndex = 0;
		} else {
			teamİndex = 1;
		}
		return takimlarListesiList.get(teamİndex);
	}

	public void oyna(Takim takim) {

		boolean kontrol = true;
		int index = passKontrol(12);

		for (int i = 0; i < 3; i++) {
			List<Oyuncu> oyuncuListesi = takim.getOyunculistesi();
			if (oyuncuListesi.get(index).pasVer()) {
				int pasAlacak = passKontrol(index);
				System.out.println(takim.getIsim() + "adlı takımdan " + oyuncuListesi.get(index).getFormaNo()
						+ " nolu oyuncu " + oyuncuListesi.get(pasAlacak).getFormaNo() + " oyuncuya pas atıyor");

				index = pasAlacak;

			} else {
				System.out.println(takim.getIsim() + "adlı takımdan " + oyuncuListesi.get(index).getFormaNo()
						+ " nolu oyuncunun pası başarısız !!!! ");
				kontrol = false;
				takim = takımDegistir(takim);
				i = -1;

			}

		}
		golVurusu(takim.getOyunculistesi().get(index));
		takim = takımDegistir(takim);

	}

	public int passKontrol(int index) {

		Random random = new Random();
		int oyuncuIndex = random.nextInt(10);

		while (index == oyuncuIndex) {
			oyuncuIndex = random.nextInt(10);
		}

		return oyuncuIndex;

	}

	public void golVurusu(Oyuncu oyuncu) {

		Kaleci kaleci = takımDegistir(oyuncu.getTakim()).getKaleci();

		System.out.println("KAleci topa uzanıyorrr");
		if (oyuncu.golVurusu(kaleci.kurtarısSkor())) {

			System.out.println("Golll golll golll");
			System.out.println(oyuncu.getFormaNo() + " nolu oyuncu golu atıyor");
		} else {
			System.out.println(oyuncu.getFormaNo() + " nolu oyuncu golu kaçırıyor");
		}

	}

}
