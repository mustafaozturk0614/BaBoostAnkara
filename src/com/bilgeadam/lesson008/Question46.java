package com.bilgeadam.lesson008;

public class Question46 {

	public static void main(String[] args) {
		// Doğum yılınızı girerek yaşınızı
		// ve hangi yüzyılda yaşadığınızı hesaplayan metotu yazınız

		yasHesapla(1987);

	}

	public static void yasHesapla(int dogumYılı) {

		int yas = 2022 - dogumYılı;

		System.out.println(yuzyılHesapla(2022) + ". yüzyılda yaşıyorsunuz " + yas + " yasşındasınız "
				+ yuzyılHesapla(1987) + " .yüzyılda doğmussunuz");

	}

	public static int yuzyılHesapla(int yıl) {

		return yıl / 100 + 1;

	}

}
