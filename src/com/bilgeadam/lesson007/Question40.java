package com.bilgeadam.lesson007;

public class Question40 {

	public static void main(String[] args) {
		int[] dizi = { 1, 5, 1, 9, 5, 1, 9, 8, 0, 0 };
		// {false,false,true,false,false,true,false,false}
		boolean[] kontrol = new boolean[dizi.length];

		for (int i = 0; i < dizi.length; i++) {
			if (kontrol[i] == true) {
				continue;
			}
			int count = 1;

			for (int j = i + 1; j < dizi.length; j++) {

				if (dizi[i] == dizi[j]) {
					kontrol[j] = true;
					count++;
				}
			}
			if (count > 1) {
				System.out.println(dizi[i] + "sayısı " + count + " kere tekrar etmiştir");

			}

		}

	}

}
