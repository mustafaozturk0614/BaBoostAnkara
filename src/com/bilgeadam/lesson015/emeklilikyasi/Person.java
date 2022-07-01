package com.bilgeadam.lesson015.emeklilikyasi;

import java.time.LocalDateTime;

/*
 * Person clasımız var
 * name
 * dogum yılı sadece yıl
 * String cınsıyet  
 * int emeklilik yası kadın =60, erkek=65;
 * 
 * man woman;
 * 
 * manager;
 * bir personel listesi tutalım 
 * 
 * kayıt metodu => 
 * kişi bilgilerini alıp personel listesmize eklieyeceğiz
 * personel listesine eklerken asağıdaki metotlardan yardım alacağız
 * 
 * 
 * 
 * cinsiyet sec metodumuz olsun  1- erkek 2-kadın 
 * 1 man clası ureticez sonra bilgilerini alcaz
 * 2-woman clası bilgillerini al;
 * 
 * 
 * bilgileri göster metodu=> personel listemizi doldurduktan sonra bize sırayla bilgilerini yazdıracak
 * 
 * 
 * 
 */
public class Person implements IRetirement {

	private String name;
	private int birthYear;
	private String gender;
	private int retirementAge;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int birthYear) {
		super();
		this.name = name;
		this.birthYear = birthYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getRetirementAge() {
		return retirementAge;
	}

	public void setRetirementAge(int retirementAge) {
		this.retirementAge = retirementAge;
	}

	@Override
	public int calculateAge() {
//		int year = 2022;

		LocalDateTime dateTime = LocalDateTime.now();
		int year = dateTime.getYear();

		return year - birthYear;
	}

	@Override
	public int howManyYears() {

		return retirementAge - calculateAge();
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "/nbirthYear=" + birthYear + "/ngender=" + gender + "/nretirementAge="
				+ retirementAge + "/ncalculateAge()=" + calculateAge() + "/nhowManyYears()=" + howManyYears() + "]";
	}

}
