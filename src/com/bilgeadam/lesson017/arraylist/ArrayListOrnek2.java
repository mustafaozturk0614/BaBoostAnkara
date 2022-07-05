package com.bilgeadam.lesson017.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * 
 * 1 tane çift sayılar Integer arraylisti yaratalım 
 * 1 tane tek sayılar için ayrı ayrı 2 tane;
 * 
 * 
 * 35 tane sayı ekleyelim 
 * random sayıları kontrol edelim eğer çift ise çifletr listesine 
 * tek ise tekler listesine;
 * 
 * arayleri yazdıralım 
 */
public class ArrayListOrnek2 {

	public static void main(String[] args) {

		List<Integer> tekler = new ArrayList<Integer>();
		List<Integer> ciftler = new ArrayList<Integer>();

		Random random = new Random();
		int sayi;

		for (int i = 0; i < 35; i++) {
			sayi = random.nextInt(100);
			if (sayi % 2 == 0) {
				ciftler.add(sayi);
			} else {
				tekler.add(sayi);
			}
		}

		System.out.println("tekler");
		for (Integer i : tekler) {
			System.out.print(i + ",");
		}
		System.out.println();
		System.out.println("çiftler");
		for (Integer i : ciftler) {
			System.out.print(i + ",");
		}
	}

}
