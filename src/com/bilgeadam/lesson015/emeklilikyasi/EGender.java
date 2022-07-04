package com.bilgeadam.lesson015.emeklilikyasi;

public enum EGender {

	MAN(1, "ERKEK"), WOMAN(2, "KADIN");

	private int no;
	private String name;

	private EGender(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

}
