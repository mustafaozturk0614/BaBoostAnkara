package com.bilgeadam.lesson015.calısan;

public class Muhendis extends Calısan {

	public Muhendis(String isim, String soyIsim, double maas) {
		super(isim, soyIsim, maas);
		setUnvan(maas);

	}

	public Muhendis(String isim, String soyIsim) {
		super(isim, soyIsim);
		setMaas(10000);
		setUnvan("Mühendis");
	}

	@Override
	public void setUnvan(double maas) {

		if (maas >= 17000) {
			setUnvan("Uzman Mühendis");
		} else if (maas >= 12000) {
			setUnvan("Kıdemli  Mühendis");
		} else if (maas >= 10000) {
			setUnvan("Muhendis");
		} else {
			setUnvan("Stajyer");
		}

	}

	@Override
	public double zamYap(double zamYuzdesi) {
		setMaas(super.zamYap(zamYuzdesi) + 250);
		setUnvan(getMaas());
		return getMaas();
	}

}
