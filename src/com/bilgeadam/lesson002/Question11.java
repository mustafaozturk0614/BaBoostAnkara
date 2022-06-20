package com.bilgeadam.lesson002;

public class Question11 {

	public static void main(String[] args) {
		// 0 dan 100 e kadar olan sayılarda Çift Sayıların toplamının,
		// tek sayıların toplamına oranı,

		double sumTek = 0;
		double sumCift = 0;

		for (double i = 1; i < 100; i += 2) {

			sumTek += i;
			sumCift += i - 1;

		}

		System.out.println(sumCift / sumTek);

		for (double i = 1; i < 100; i++) {

			if (i % 2 == 0) {
				sumCift += i;

			} else {
				sumTek += i;
			}

		}
		System.out.println("oran= " + (sumCift / sumTek));
	}

}
