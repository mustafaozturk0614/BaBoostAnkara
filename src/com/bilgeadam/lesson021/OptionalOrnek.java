package com.bilgeadam.lesson021;

import java.util.Optional;

public class OptionalOrnek {

	public static void main(String[] args) {

		Urun urun = null;

		Optional<Urun> urun2 = Optional.of(urun);
//		Optional<Urun> urun3 = Optional.ofNullable(urun);
		System.out.println(urun2.isPresent());

	}

}
