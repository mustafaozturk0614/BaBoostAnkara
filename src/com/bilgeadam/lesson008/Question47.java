package com.bilgeadam.lesson008;

import java.util.Random;
import java.util.Scanner;

public class Question47 {

	// Bir dizinin boyutlarını giriniz ve random sayılarla 500 e kadar
	// o diziyi oluşturunuz daha sonra ortalamayı veren metotu yazınız

	// dizi uzunluğuna ihitiyaç
	// uzunluktan bir dizi yaratcaz
	// bu dizi dönerken dizinin elemanları oluşturacağız
	// bu elmnalrı random oluşturcağız bunuda ayrı bir metotoda yapacağız
	// toplam dizideki elemaların toplamını bulmak için

	public static void main(String[] args) {

		System.out.println("Ortalama= " + otrHesapla());

	}

	public static double otrHesapla() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen dizinin uzunluğunu giriniz");
		int uzunluk = scanner.nextInt();
		double[] dizi = new double[uzunluk];
		double toplam = 0;

		for (int i = 0; i < dizi.length; i++) {
			double sayi = sayiUret();
			dizi[i] = sayi;
			toplam += sayi;
			System.out.println(sayi);
		}

		return toplam / uzunluk;

	}

	public static double sayiUret() {

		Random random = new Random();

		return random.nextDouble() * 500;// 0.0-1.0

	}

}
