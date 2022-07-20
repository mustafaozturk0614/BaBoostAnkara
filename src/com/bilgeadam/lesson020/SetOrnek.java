package com.bilgeadam.lesson020;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Dışardan bir string değeri alıp her bir harfi bir sete atmanız ve bu setin çıktısını almanız
// Setlerden biri tekrar eden değerleri tutsun diğeri tekrar etmeyen değerleri tutsun sonra bunları yazdıralım 

public class SetOrnek {

	public static void main(String[] args) {
		System.out.println("Bir kelime giriniz");
		Scanner scanner = new Scanner(System.in);

		String kelime = scanner.nextLine();
		Set<Character> tekrarEden = new HashSet<Character>();
		Set<Character> tekrarEtmeyen = new HashSet<Character>();

		for (int i = 0; i < kelime.length(); i++) {
			if (!tekrarEden.contains(kelime.charAt(i)) && !tekrarEtmeyen.add(kelime.charAt(i))) {
				tekrarEden.add(kelime.charAt(i));
				tekrarEtmeyen.remove(kelime.charAt(i));
			}
		}
		System.out.println("Tekrar edenler");
		for (Character character : tekrarEden) {
			System.out.print(character + " ,");
		}
		System.out.println();
		System.out.println("Tekrar etmeyenler");
		for (Character character : tekrarEtmeyen) {
			System.out.print(character + " ,");
		}
	}

}
