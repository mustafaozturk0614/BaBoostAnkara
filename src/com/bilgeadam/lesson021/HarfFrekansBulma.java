package com.bilgeadam.lesson021;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 
 * dışarıdan bir string değeri gireceğiz

 * 
 * bir map içine atacağız  merhaba
 * 
 * m=1
 * e=1
 * r=1
 * h=1
 * a=2
 * b=1
 * 
 */

public class HarfFrekansBulma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<Character, Integer> frekansMap = new HashMap<>();
		String kelime = scanner.nextLine();

		for (int i = 0; i < kelime.length(); i++) {
			char c = kelime.charAt(i);

			if (frekansMap.containsKey(c)) {
				frekansMap.replace(c, frekansMap.get(c) + 1);

			} else {
				frekansMap.put(c, 1);
			}

		}

		frekansMap.entrySet().forEach(System.out::println);

	}
}
