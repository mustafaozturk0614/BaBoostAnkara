package com.bilgeadam.lesson011;

public class Recursive {

	public static void main(String[] args) {
		// Aynı fonkisyonu kendi içinden çağırıyoruz;
		int[] sayilar = { 1, 2, 1, 6 };
		System.out.println(topla(5));
		System.out.println(faktoriyel(12));
		System.out.println(usAl(2, 3));
		System.out.println(diziTopla(sayilar, sayilar.length - 1));

	}

	public static int topla(int sayi) {

		if (sayi < 1) {// fonksiyonumuzun çıkış değeri
			return 0;
		}

		else {
			return sayi + topla(sayi - 1);// fonkisyonun tekrar eden değerleri
		}

	}

	public static int faktoriyel(int sayi) {

		if (sayi > 1) {

			return sayi * faktoriyel(sayi - 1);// 5*4*3*2*1
		} else {
			return 1;
		}
	}

	public static int usAl(int taban, int us) {

		if (us == 0) {
			return 1;
		} else {
			return taban * usAl(taban, us - 1);// 2*2*2*1
		}

	}

	public static int diziTopla(int[] dizi, int index) {

		if (index < 0) {
			return 0;
		}

		return dizi[index] + diziTopla(dizi, index - 1);
	}

}
