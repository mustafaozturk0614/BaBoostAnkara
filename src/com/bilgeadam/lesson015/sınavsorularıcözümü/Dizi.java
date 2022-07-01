package com.bilgeadam.lesson015.sınavsorularıcözümü;

public class Dizi {

	int[] dizi = new int[0];
	int[] temp;

	public void ekle(int sayi) {

		temp = new int[dizi.length + 1];

		for (int i = 0; i < dizi.length; i++) {

			temp[i] = dizi[i];
		}
		temp[dizi.length] = sayi;
		dizi = temp;

	}

	public void sil(int index) {

		temp = new int[dizi.length - 1];
		for (int i = 0; i < temp.length; i++) {

			if (i >= index) {
				temp[i] = dizi[i + 1];
			} else {
				temp[i] = dizi[i];
			}
		}

		dizi = temp;

	}

	public void listele() {

		for (int i : dizi) {
			System.out.println(i);
		}

	}

	public void arayaEkle(int sayi, int index) {
		temp = new int[dizi.length + 1];

		for (int i = 0; i < index; i++) {

			temp[i] = dizi[i];
		}
		temp[index] = sayi;

		for (int i = index; i < dizi.length; i++) {
			temp[i + 1] = dizi[i];
		}
		dizi = temp;

	}

	public static void main(String[] args) {
		Dizi dizi = new Dizi();
		dizi.ekle(5);
		dizi.ekle(7);
		dizi.ekle(8);
		dizi.ekle(3);
//		dizi.sil(1);
		dizi.arayaEkle(1, 1);
		dizi.listele();

	}

}
