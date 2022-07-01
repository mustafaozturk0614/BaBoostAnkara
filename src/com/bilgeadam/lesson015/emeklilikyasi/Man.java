package com.bilgeadam.lesson015.emeklilikyasi;

public class Man extends Person {

	public Man() {
		setRetirementAge(65);
		setGender("Erkek".toUpperCase());
	}

	public Man(String name, int birthYear) {
		super(name, birthYear);
		setRetirementAge(65);
		setGender("Erkek".toUpperCase());
	}

}
