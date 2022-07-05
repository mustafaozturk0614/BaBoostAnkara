package com.bilgeadam.lesson017.arraylist;

import java.util.ArrayList;
import java.util.List;

/*
 * Bir tane String arraylisti oluşturalım 
 * 
 * Ankara
 * Bursa
 * antalya
 * Artvin 
 * Erzurum 
 * 
 * 
 * 
 */

public class ArraylistOrnek1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("ankara");
		list.add("Bursa");
		list.add("antalya");
		list.add("Artvin");
		list.add("Erzurum");
		list.add("Bursa");
		list.add("Karaman");

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).startsWith("an")) {

//				list.remove(i);
//				list.add(i, "xxx");
				list.set(i, "xxx");

			}

		}

		for (String string : list) {
			System.out.println(string);
		}

	}

}
