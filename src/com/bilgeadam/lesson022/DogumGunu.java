package com.bilgeadam.lesson022;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 
 * 
 * Doğum günü ne göre Kaç gun kaç yıl yaşamısınız onu hesaplama
 *
 *
 */
public class DogumGunu {

	public static void main(String[] args) {

		LocalDate dogumGunu = LocalDate.parse("1987-06-18");
		long years = dogumGunu.until(LocalDate.now(), ChronoUnit.YEARS);
		long gun = dogumGunu.until(LocalDate.now(), ChronoUnit.DAYS);
		long ay = dogumGunu.until(LocalDate.now(), ChronoUnit.MONTHS);
		long hafta = dogumGunu.until(LocalDate.now(), ChronoUnit.WEEKS);
		System.out.println(years + "yıl " + ay + " ay" + hafta + " hafta " + gun + "gun yaşamıssnız");
		LocalDate sonrakıDogumGunu = dogumGunu.plusYears(years + 1);
		System.out.println(sonrakıDogumGunu);

	}

}
