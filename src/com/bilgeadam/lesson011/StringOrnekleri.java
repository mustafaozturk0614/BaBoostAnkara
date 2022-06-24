package com.bilgeadam.lesson011;

public class StringOrnekleri {

	public static void main(String[] args) {
		String a = "mustafa";
		String b = "mustafa";
		String c = "mustafa";
		String d = new String("mustafa");
		String e = new String("mustafa");
		System.out.println(a == b);// true
		System.out.println(a == c);// true
		System.out.println(a.equals(d));// true
		System.out.println(a == d);// false
		System.out.println(d == e);// false
		a += a + " Öztürk";

	}

}
