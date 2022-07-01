package com.bilgeadam.lesson015.calısan;

/*
 * Employee clasımız ana class olsun 
 * isim 
 * soyisim
 * iş unvanı
 * maaşı 
 * 
 * 
 * iki tane ayrı const (isim soy isim)
 * iki tane ayrı const (isim soy isim,maaş)
 * 
 * 
 * maaş zammı metodu istiyorum dışarıdan bir oran alacak 
 * 
 * 
 * Engineer classı
 * maaş girilmezse defautl maas en az 10000tl  10000 12000 Muhendis= default değer muhendis
 * eğer  maası 1200 17000 tl ye kadar ise  kıdemli muhendis
 * 17000
 yüksek ise uzman muhendis 
 eğer 10000 stayjer
  dışarıdan girilen zam oranı + 250 tlde bonus alıcak
 * OfficeWorker classı 
 * 
 * iş unvanı
 * 
 * endüşük maaş 8000 
 * 
 * 8000 12000 arası ise çalşan
 * 1200  yuksek ise kidemli çalısan 
 * 8000 az ise stajyer 
 *  
 * */

public class Calısan {

	private String isim;
	private String soyIsim;
	private String unvan;
	private double maas;

	public Calısan(String isim, String soyIsim) {
		super();
		this.isim = isim;
		this.soyIsim = soyIsim;
	}

	public Calısan(String isim, String soyIsim, double maas) {
		super();
		this.isim = isim;
		this.soyIsim = soyIsim;
		this.maas = maas;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyIsim() {
		return soyIsim;
	}

	public void setSoyIsim(String soyIsim) {
		this.soyIsim = soyIsim;
	}

	public String getUnvan() {
		return unvan;
	}

	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}

	public void setUnvan(double maas) {
		this.unvan = unvan;
	}

	public double getMaas() {
		return maas;
	}

	public void setMaas(double maas) {
		this.maas = maas;
	}

	@Override
	public String toString() {
		return "Calısan [isim=" + isim + ", soyIsim=" + soyIsim + ", unvan=" + unvan + ", maas=" + maas + "]";
	}

	public double zamYap(double zamYuzdesi) {

		double para = maas * zamYuzdesi / 100;
		this.maas += para;
		return this.maas;
	}

}
