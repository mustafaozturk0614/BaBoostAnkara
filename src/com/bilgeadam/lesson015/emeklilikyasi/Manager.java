package com.bilgeadam.lesson015.emeklilikyasi;

import java.util.Scanner;

/*
 * 
 * cinsiyet sec metodu istiyorum  1 e basınca erkek secilecek ve erkek nesnesş olusturulacak
 * 2. ye basınca ise kadın seceilecek ve kadın nesnesi olusturlacak 
 * 
 * bilgileri gir metodu istiyorum bu metot dışarıdan man veya woman clasından oluşan bir nesne alacak 
 * bu nesneyi metoto içinde aldığımız parametler ile dolduracağız ve doneceğiz.
 * 
 * 3.metotda kayıt yapacağız bir arraye 
 * 
 */

public class Manager {

	Person[] persons;

	public Manager() {
		persons = new Person[2];
	}

	public void register() {

		for (int i = 0; i < persons.length; i++) {

			persons[i] = selectGender();
		}
	}

	public void printInformation() {

		for (Person person : persons) {
			System.out.println("====Kişi Bilgileri====");
			System.out.println("------------------");
			System.out.println(person);
			System.out.println("------------------");
		}

	}

	public Person enterInformation(Person person) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Adınızı giriniz");
		person.setName(scanner.nextLine());
		System.out.println("Dogum Yılınızı Giriniz");
		person.setBirthYear(scanner.nextInt());
		return person;

	}

	public Person selectGender() {
		Person person;

		Scanner scanner = new Scanner(System.in);

		for (EGender gender : EGender.values()) {
			System.out.println(gender.getNo() + "-" + gender.getName());
		}

		System.out.println("Lütfen seçim yapınız");
		int input = scanner.nextInt();
		scanner.nextLine();

		switch (input) {
		case 1:
			person = new Man();
			return enterInformation(person);

		case 2:
			person = new Woman();
			return enterInformation(person);

		default:
			break;
		}
		return null;
	}

}
