package com.bilgeadam.lesson015.emeklilikyasi;

public class Man extends Person {

	public Man() {
		setRetirementAge(65);
		setGender(EGender.MAN);
	}

	public Man(String name, int birthYear) {
		super(name, birthYear);
		setRetirementAge(65);
		setGender(EGender.MAN);

	}

	@Override
	public void yazdır() {
		super.yazdır();
	}

}
