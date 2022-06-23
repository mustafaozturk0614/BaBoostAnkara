package com.bilgeadam.lesson010;

public class Tekrar {

	public static void main(String[] args) {

//		StringBuilder stringBuilder = new StringBuilder();
//		stringBuilder.append("a");
//		System.out.println(stringBuilder);
//		stringBuilder.append("b");
//		System.out.println(stringBuilder);
//		String string3 = "a";
//		string3 += "b";
//		System.out.println(string3);
//		String string = "Merhaba Dünya";
//		System.out.println(string.charAt(12));
//		System.out.println(string.indexOf("a"));
//		System.out.println(string.startsWith("Merhaba Dünya"));
//		System.out.println(string.endsWith("dünya"));
//		System.out.println(string.substring(4, 10));
//		System.out.println(string.toLowerCase());
//		System.out.println(string.toUpperCase());
//		System.out.println(string.equals("merhaba dünya"));
//		System.out.println(string.equalsIgnoreCase("merhaba dünya"));
//		System.out.println(string.replace("z", "x"));
//		System.out.println(string.contains("bh"));
//		String[] dizi = string.split(",");
//		for (String string2 : dizi) {
//			System.out.println(string2);
//		}
//		System.out.println(string.length());

		// Girilen 2 basamaklı ifadeyi 97-doksan yedi olarak çıktı alsın

		String[] birler = { "", "Bir", "İki", "Üç", "Dört", "Beş", "Altı", "Yedi", "Sekiz", "Dokuz" };
		String[] onlar = { "", "On", "Yirmi", "Otuz", "Kırk", "Elli", "Altmış", "Yetmiş", "Seksen", "Doksan" };

//		stringeCevirme(20, birler, onlar);

		// bir dizide 10 katı olan bir sayı bulunduğunda daha sonra gelen değerler
		// 10 un katı olacak şekilde değişecek

		// kontrol edeceğiz 10
		// konrol=true;
		// int onun kati=

		int[] nums = { 5, 4, 10, 20, 8, 20, 5, 10, 8, 9 };

		onunKati(nums, 5);

	}

	public static void onunKati(int[] nums, int sayi) {

		boolean kontrol = false;
		int onunKati = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 10 == 0) {
				kontrol = true;
				onunKati = nums[i];

			} else if (kontrol && nums[i] % 10 != 0) {
				nums[i] = onunKati;

			}
//			else if (nums[i] % 10 == 0 && kontrol) {
//				onunKati = nums[i];
//
//			}

		}

		for (int i : nums) {
			System.out.println(i);
		}

	}

	private static void stringeCevirme(int sayi, String[] dizi1, String[] dizi2) {
		int birler = sayi % 10;// 7 = index
		int onlar = sayi / 10;//

		System.out.println(dizi2[onlar] + " " + dizi1[birler]);

	}

}
