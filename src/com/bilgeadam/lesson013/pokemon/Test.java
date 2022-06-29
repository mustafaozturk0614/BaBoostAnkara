package com.bilgeadam.lesson013.pokemon;

public class Test {

	public static void main(String[] args) {
		Pokemon pokemon = new Pokemon("charmander", 100);

		pokemon.attack();

		ElectricPokemon electricPokemon = new ElectricPokemon();
		electricPokemon.name = "pikhachu";
		electricPokemon.health = 90;
		electricPokemon.voltage = 120;
		WaterPokemon waterPokemon = new WaterPokemon();
		waterPokemon.name = "squirtle";
		waterPokemon.health = 85;
		waterPokemon.waterPressureForce = 20;

		waterPokemon.attack();
		waterPokemon.dodge();

		System.out.println(electricPokemon.name);
		System.out.println(electricPokemon.health);
		System.out.println(electricPokemon.voltage);

		System.out.println(waterPokemon.name);
		System.out.println(waterPokemon.health);
		System.out.println(waterPokemon.waterPressureForce);

	}

}
