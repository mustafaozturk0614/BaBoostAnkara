package com.bilgeadam.lesson002;

import java.util.Scanner;

public class Question13 {
//	Girilen sayının istenilen sayıya göre mod işlemini yaptıran

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a, b, bolum;

		a = scanner.nextInt();
		b = scanner.nextInt();

		bolum = a / b;
		System.out.println("kalan= " + (a - bolum * b));

		while (b <= a) {
			a = a - b;
		}
		System.out.println("kalan= " + a);

	}

}
