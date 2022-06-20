package com.bilgeadam.lesson005;

public class Question28 {

	/*
	 * 
	 * int [] sayilar={1,4,5,6,1,1,4,8};
	 * 
	 * dizi içerisinde 1 ve 4 kaç kere geçtiğini ve 1 sayısı 4 sayısından büyükse
	 * true değilse false
	 * 
	 */
	public static void main(String[] args) {
		int[] sayilar = { 1, 4, 5, 6, 1, 1, 4, 8 };

		int sayac1 = 0;
		int sayac2 = 0;

		boolean kontrol = false;

		for (int i = 0; i < sayilar.length; i++) {

			if (sayilar[i] == 1) {
				sayac1++;

			} else if (sayilar[i] == 4) {
				sayac2++;
			}

		}

		if (sayac2 < sayac1) {
			kontrol = true;

		}
		System.out.println(kontrol);
	}

}
