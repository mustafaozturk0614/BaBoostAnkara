package com.bilgeadam.lesson022;

import java.time.LocalDate;
import java.util.Scanner;

public class DateOrnek {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LocalDate laDate = LocalDate.now();
		System.out.println(laDate);
		LocalDate date = LocalDate.of(2020, 10, 10);
		System.out.println(date);
//		System.out.println("yıl");
//		int yıl = scanner.nextInt();
//		System.out.println("ay");
//		int ay = scanner.nextInt();
//		System.out.println("gün");
//		int gun = scanner.nextInt();
//		LocalDate date2 = LocalDate.of(yıl, gun, ay);
//		System.out.println(date2);
		System.out.println(date.getYear());
		System.out.println(date.getMonthValue());
		System.out.println(date.getDayOfYear());
		System.out.println(date.isBefore(laDate));
		LocalDate date3 = LocalDate.parse("2020-12-25");
		System.out.println(date3);

	}
}
