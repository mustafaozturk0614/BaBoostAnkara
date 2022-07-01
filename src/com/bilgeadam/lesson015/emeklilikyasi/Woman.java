package com.bilgeadam.lesson015.emeklilikyasi;

public class Woman extends Person {

	public Woman() {
		setRetirementAge(60);
		setGender("Kadın".toUpperCase());
	}

	public Woman(String name, int birthYear) {
		super(name, birthYear);
		setRetirementAge(60);
		setGender("Kadın".toUpperCase());
	}

}
