package com.bilgeadam.lesson016;

public class Test {

	public static void main(String[] args) {
		Hayvan hayvan = new Kedi();
		Hayvan hayvan2 = new Kopek();

		sesCikar(hayvan);
		sesCikar(hayvan2);
	}

	public static void sesCikar(Hayvan hayvan) {
		hayvan.sesCıkar();

//		if (hayvan instanceof Kedi) {
//			hayvan.sesCıkar();
//		}
//		if (hayvan instanceof Kopek) {
//			hayvan.sesCıkar();
//		}
	}
}
