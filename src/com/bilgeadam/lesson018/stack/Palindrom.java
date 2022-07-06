package com.bilgeadam.lesson018.stack;

import java.util.Scanner;
import java.util.Stack;

/*
 * 
 * Scanner ile bir metin alacağız
 * bu metini bir stack e atacağız
 * 
 * 
 */
public class Palindrom {
	Stack<Character> stack = new Stack<Character>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir metin giriniz: ");
		String metin = scanner.nextLine();
		Palindrom palindrom = new Palindrom();
		palindrom.palindrom(metin);

		if (palindrom.isPalindrom(metin)) { // metotdan dönen değere göre palindrom olup olmadığını yazdırıyorum
			System.out.println("Palindromdur");
		} else {
			System.out.println("Palindrom değildir");
		}

	}

	public void palindrom(String metin) {

		for (int i = 0; i < metin.length(); i++) {

			stack.push(metin.charAt(i));
		}
		stack.forEach(s -> System.out.println(s));

	}

	public boolean isPalindrom(String metin) {

		for (int i = 0; i < metin.length() / 2; i++) {// metinin içinde gezdim her değeri kontrol ettim
			if (metin.charAt(i) != stack.pop()) { // metinin ilk elemanı ile stack in son elamını kontrol ediyorum
				return false;
			}

		}
		return true;

	}

}
