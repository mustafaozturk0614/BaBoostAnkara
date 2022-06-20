package com.bilgeadam.lesson002;

import java.util.Scanner;

public class Faktoriyel {

	public static void main(String[] args) {
		// dışardan girilen bir sayının faktöriyelini hesaplayan kod parçacığını yazınız

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int faktoriyel = 1;
		for (int i = n; i > 0; i--) {
			faktoriyel *= i;
		}
		System.out.println("faktoriyel= " + faktoriyel);
	}

}
