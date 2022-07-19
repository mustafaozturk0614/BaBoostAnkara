package com.bilgeadam.lesson020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapOrnek {

	public static void main(String[] args) {

		String[] ogrenci = { "Ayşe", "Ece", "Mahmut" };

		int[] notlar = { 60, 80, 70 };
		int[][] notlar2 = { { 50, 50, 60 }, { 80, 90, 70 }, { 25, 75, 80 } };

		Map<String, Integer> map = new HashMap<String, Integer>();

		Map<String, int[]> map2 = new HashMap<String, int[]>();

		Map<String, List<Integer>> map3 = new LinkedHashMap<String, List<Integer>>();
		// 1.Yöntem
		for (int i = 0; i < ogrenci.length; i++) {

			map2.put(ogrenci[i], notlar2[i]);

		}

		//// İkinci Yöntem
		for (int i = 0; i < notlar2.length; i++) {
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < notlar2[i].length; j++) {
				list.add(notlar2[i][j]);
			}
			map3.put(ogrenci[i], list);

		}

		System.out.println("//////////////////////////");

		for (Entry<String, int[]> entry : map2.entrySet()) {
			System.out.println(entry.getKey());
			for (int i = 0; i < entry.getValue().length; i++) {
				System.out.println(entry.getValue()[i]);
			}

		}
//		System.out.println("//////////////////////////");
//
		map3.entrySet().forEach(s -> System.out.println(s.getValue() + "-" + s.getKey()));
//
//		System.out.println("//////////////////////////");
//
//		for (String i : map.keySet()) {
//
//			System.out.println(i + "-" + map.get(i));
//
//		}

	}

}
