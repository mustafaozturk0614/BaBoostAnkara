package com.bilgeadam.lesson015.calısan;

//endüşük maaş 8000 
//* 
//* 8000 12000 arası ise çalşan
//* 1200  yuksek ise kidemli çalısan 
//* 8000 az ise stajyer 
public class OfisCalisani extends Calısan {

	public OfisCalisani(String isim, String soyIsim, double maas) {
		super(isim, soyIsim, maas);
		setUnvan(maas);
	}

	public OfisCalisani(String isim, String soyIsim) {
		super(isim, soyIsim);
		setMaas(8000);
		setUnvan("Çalışan");
	}

	@Override
	public void setUnvan(double maas) {

		if (maas >= 12000) {
			setUnvan("Kıdemli Çalışan");
		} else if (maas >= 8000) {
			setUnvan("Çalışan");
		} else {
			setUnvan("Stajyer");
		}

	}

	@Override
	public double zamYap(double zamYuzdesi) {
		super.zamYap(zamYuzdesi);
		setUnvan(getMaas());
		return getMaas();

	}

}
