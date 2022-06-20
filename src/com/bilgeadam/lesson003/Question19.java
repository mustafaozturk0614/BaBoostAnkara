package com.bilgeadam.lesson003;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		// Dışarıdan ay ve gün değerini ayrı ayrı bir sayı olarak alacaksınız buna göre
		// burc hesabı yapan program

		// Koç Burcu : 21 Mart - 20 Nisan
		//
		// Boğa Burcu : 21 Nisan - 21 Mayıs
		//
		// İkizler Burcu : 22 Mayıs - 22 Haziran
		//
		// Yengeç Burcu : 23 Haziran - 22 Temmuz
		//
		// Aslan Burcu : 23 Temmuz - 22 Ağustos
		//
		// Başak Burcu : 23 Ağustos - 22 Eylül
		//
		// Terazi Burcu : 23 Eylül - 22 Ekim
		//
		// Akrep Burcu : 23 Ekim - 21 Kasım
		//
		// Yay Burcu : 22 Kasım - 21 Aralık
		//
		// Oğlak Burcu : 22 Aralık - 21 Ocak
		// Kova Burcu : 22 Ocak - 19 Şubat
		//
		// Balık Burcu : 20 Şubat - 20 Mart

		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen doğdunuz günün Ayın kaçıncı günü olduğunu giriniz");

		int day = scanner.nextInt();
		System.out.println("lütfen doğdunuz ayın Yılın kaçıncı ayı olduğunu giriniz");
		int month = scanner.nextInt();

		switch (month) {
		case 1:
			if (day >= 1 && day <= 21) {
				System.out.println("Burcunuz Oğlak");
			} else if (day > 31) {
				System.out.println("Ocak Ayınnın son günü 31 Ocakdır ,\n sizin girdiğiniz değer:" + day);

			} else {
				System.out.println("Burcunuz Kova");
			}

			break;
		case 2:
			if (day >= 1 && day <= 19) {
				System.out.println("Burcunuz Kovad");
			} else if (day > 29) {
				System.out.println("Ocak Ayınnın son günü 29 Şubattır ,\n sizin girdiğiniz değer:" + day);

			} else {
				System.out.println("Burcunuz Balık");
			}

			break;
		case 3:
			if (day >= 1 && day <= 20) {
				System.out.println("Burcunuz Balık");
			} else if (day > 31) {
				System.out.println("Mart Ayının son günü 31 Marttır ,\n sizin girdiğiniz değer:" + day);

			} else {
				System.out.println("Burcunuz Koç");
			}
			break;
		case 4:
			if (day >= 1 && day <= 20) {
				System.out.println("Burcunuz Koç");
			} else if (day > 30) {
				System.out.println("Nisan Ayının son günü 30 Nisandır ,\n sizin girdiğiniz değer:" + day);

			} else {
				System.out.println("Burcunuz Boğa");
			}
			break;
		case 5:
			if (day >= 1 && day <= 21) {
				System.out.println("Burcunuz Boğa");
			} else if (day > 31) {
				System.out.println("Mayıs Ayının son günü 31 Mayıstır ,\n sizin girdiğiniz değer:" + day);

			} else {
				System.out.println("Burcunuz ikizler");
			}
			break;
		case 6:
			if (day >= 1 && day <= 22) {
				System.out.println("Burcunuz İkizler");
			} else if (day > 30) {
				System.out.println("Haziran Ayının son günü 30 Hazirandır ,\n sizin girdiğiniz değer:" + day);

			} else {
				System.out.println("Burcunuz Yengeç");
			}
			break;
		case 7:
			if (day >= 1 && day <= 23) {
				System.out.println("Burcunuz Yengeç");
			} else if (day > 31) {
				System.out.println("Temmuz Ayının son günü 31 Temmuzdur ,\n sizin girdiğiniz değer:" + day);

			} else {
				System.out.println("Burcunuz Aslan");
			}
			break;
		case 8:
			if (day >= 1 && day <= 22) {
				System.out.println("Burcunuz Aslan");
			} else if (day > 31) {
				System.out.println("Ağustos Ayının son günü 31 Ağustostur ,\n sizin girdiğiniz değer:" + day);

			} else {
				System.out.println("Burcunuz Başak");
			}
			break;
		case 9:
			if (day >= 1 && day <= 22) {
				System.out.println("Burcunuz Başak");
			} else if (day > 30) {
				System.out.println("Eylül Ayının son günü 30 Eylüldür ,\n sizin girdiğiniz değer:" + day);

			} else {
				System.out.println("Burcunuz Terazi");
			}
			break;
		case 10:
			if (day >= 1 && day <= 22) {
				System.out.println("Burcunuz Terazi");
			} else if (day > 31) {
				System.out.println("Ekim Ayının son günü 31 Ekimdir ,\n sizin girdiğiniz değer:" + day);

			} else {
				System.out.println("Burcunuz Akrep");
			}
			break;
		case 11:
			if (day >= 1 && day <= 21) {
				System.out.println("Burcunuz Akrep");
			} else if (day > 30) {
				System.out.println("Kasım Ayının son günü 31 Kasımdır ,\n sizin girdiğiniz değer:" + day);

			} else {
				System.out.println("Burcunuz Yay");
			}
			break;
		case 12:
			if (day >= 1 && day <= 21) {
				System.out.println("Burcunuz Yay");
			} else if (day > 31) {
				System.out.println("Aralık Ayının son günü 31 Aralıktır ,\n sizin girdiğiniz değer:" + day);

			} else {
				System.out.println("Burcunuz Qğlak");
			}
			break;

		default:
			System.out.println("Geçersiz Ay değeri girdiniz\ngirdiğiniz değer " + month);
			break;
		}
	}

}
