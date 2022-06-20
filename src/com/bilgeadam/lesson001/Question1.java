package com.bilgeadam.lesson001;

public class Question1 {

	public static void main(String[] args) {
		// Bir �r�n�n sat�� fiyat�n�n i�inde %18 KDV ve %15 k�r oldu�unu biliyoruz
//		�r�n�n ham fiyat� hesaplay�n
//
//		Satır fiyat�i   	endPrice	 =100
//
//		KDV�siz fiyat:	priceWithoutVAT	=
//
//		Ham fiyat:	rawPrice	 =

		float endPrice = 100f;
		float priceWithoutVAT = endPrice / 1.18f;
		float rawPrice = priceWithoutVAT / 1.15f;
		System.out.println("kdvsiz fiyat= " + priceWithoutVAT);
		System.out.println("Ham fiyat= " + rawPrice);
//		control+shift+c  yorum satırı kısa yolu 

	}

}
