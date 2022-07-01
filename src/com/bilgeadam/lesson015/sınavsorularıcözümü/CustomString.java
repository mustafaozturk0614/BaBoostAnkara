package com.bilgeadam.lesson015.sınavsorularıcözümü;

public class CustomString {

	String string;

	public int uzunluk() {

		return string.length();
	}

	public boolean iceriyormu(String kontrol) {

		return string.contains(kontrol);

	}

	public char ındeksdekiDeger(int index) {

		return string.charAt(index);

	}

	public boolean ilemiBaslıyor(String baslangıc) {

		return string.startsWith(baslangıc);

	}

	public boolean ilemiBitiyor(String bitis) {

		return string.startsWith(bitis);

	}

	public int degerinIndeksiniBul(String deger) {

		return string.indexOf(deger);

	}

	public void bastakiSondakiBosluklarıAl() {

		string.trim();
	}

	public String degerDegiştirme(String eskideger, String yeniDeger) {
		string = string.replace(eskideger, yeniDeger);
		return string;
	}

	public void degeriBolme(int index) {

		string.substring(index);

	}

	public void degeriBolme(int baslangıc, int bitis) {

		string.substring(baslangıc, bitis);

	}

	public boolean esitMi(String deger) {
		return string.equals(deger);
	}

	public String[] degereGöreBolme(String deger) {
		return string.split(deger);
	}

}
