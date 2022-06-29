package com.bilgeadam.lesson013.pokemon;

public class Pokemon {

	String name;
	int health;

	public Pokemon(String isim, int can) {
		name = isim;
		health = can;
	}

	public Pokemon() {

	}

	public void dodge() {

		System.out.println(name + " adlı pokemon Ataktan kaçınıyor");

	}

	public void attack() {
		System.out.println(name + " adlı pokemon saldırıyor");
	}

}
