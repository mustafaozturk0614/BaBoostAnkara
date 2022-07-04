package com.bilgeadam.lesson015.emeklilikyasi;

public class Woman extends Person {

	public Woman() {
		setRetirementAge(60);
		setGender(EGender.WOMAN);
	}

	public Woman(String name, int birthYear) {
		super(name, birthYear);
		setRetirementAge(60);
		setGender(EGender.WOMAN);
	}

	@Override
	public void yazdır() {
		super.yazdır();
		System.out.println("Woman clasından yazdırılıyor");
	}
}
