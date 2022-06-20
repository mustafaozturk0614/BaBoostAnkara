package com.bilgeadam.lesson005;

public class Question30 {

	// bir dizide ard arda gelen 2 indexdeki sayı değeri 2 ise true yazdırıp döngü
	// sonlansın yoksa false yazdıralım ;

	public static void main(String[] args) {

		int[] sayilar = { 2, -256, 16, 1258, 5, 2};

		int sayac = 0;
		boolean check = false;

		for (int i = 1; i < sayilar.length; i++) {

			if (sayilar[i] == 2 && sayilar[i - 1] == 2) {
				check = true;

				break;
			}

		}

		System.out.println(check);

	}

}
