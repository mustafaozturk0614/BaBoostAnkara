package com.bilgeadam.lesson021;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Deneme2 {

	static List<Student> students = new ArrayList<>();

	public static void main(String[] args) {
		Deneme2 deneme2 = new Deneme2();
//		ortalamaHesapla();

//		bolumeGoreMaple();
//		durumuGuncelle();

//		notEkle();

//		notEkle2();

		Map<Integer, String> map1 = students.stream().collect(Collectors.toMap(s -> s.id, t -> t.name));
		Map<Integer, String> map2 = students.stream().collect(Collectors.toMap(Student::getId, Student::getName));

		map1.entrySet().forEach(System.out::println);
		System.out.println("///////////////////////");
		map2.entrySet().forEach(System.out::println);
	}

	private static void notEkle2() {
		students.stream().forEach(s -> {
			s.notlar = s.notlar.stream().map(k -> k + 15).collect(Collectors.toList());
		});
		students.stream().forEach(s -> s.setNotlar(s.getNotlar().stream().map(a -> a + 15.0).toList()));

		students.forEach(System.out::println);
	}

	private static void notEkle() {
		// foreach
//		students.stream().forEach(s -> s.notlar.add(75.0));
		// map
		List<List<Double>> liste = students.stream().map(s -> {

			s.notlar.add(75.0);
			return s.notlar;

		}).collect(Collectors.toList());
		liste.forEach(System.out::println);
	}

	private static void durumuGuncelle() {
		students.stream().filter(s -> s.ortHesapla() > 50).forEach(x -> x.setDurum("Geçti"));
		students.stream().filter(s -> s.ortHesapla() <= 50).forEach(x -> x.setDurum("KAldı"));

		students.forEach(System.out::println);
		System.out.println("////////////////////////////////");
		students.forEach(s -> {
			if (s.durum == null) {
				s.setDurum("Kaldı");
			}
			System.out.println(s);

		});
	}

	private static void bolumeGoreMaple() {
		Map<String, List<Student>> map = students.stream().collect(Collectors.groupingBy(s -> s.bolum));
		Map<String, List<Student>> map2 = students.stream().collect(Collectors.groupingBy(Student::getBolum));

		map.entrySet().forEach(System.out::println);
		map2.entrySet().forEach(System.out::println);
	}

	private static void ortalamaHesapla() {
		List<Double> notlar2 = new ArrayList<Double>();
		double ort = students.stream().collect(Collectors.averagingDouble(s -> s.ortHesapla()));

		System.out.println(ort);
		double otr2 = students.stream().collect(
				Collectors.averagingDouble(x -> x.notlar.stream().collect(Collectors.averagingDouble(t -> t))));
		System.out.println(otr2);
// map li çözüm
		List<Double> notlar = students.stream().map(y -> {

			return y.notlar.stream().collect(Collectors.averagingDouble(z -> z));

		}).collect(Collectors.toList());
		System.out.println("---------------------------");
		notlar.forEach(System.out::println);

		// foreachi çözüm
		students.stream().forEach(y -> {

			notlar2.add(y.notlar.stream().collect(Collectors.averagingDouble(z -> z)));

		});
		System.out.println("-----------------------------");
		notlar2.forEach(System.out::println);
	}

	public Deneme2() {
		Student student = new Student();
		student.name = "Ali";
		student.notlar.add(50.0);
		student.notlar.add(50.0);
		student.notlar.add(50.0);
		student.bolum = "tm";
		student.id = 1;
		Student student2 = new Student();
		student2.name = "Ayşe";
		student2.notlar.add(80.0);
		student2.notlar.add(55.5);
		student2.notlar.add(79.4);
		student2.bolum = "mat";
		student2.id = 2;
		Student student3 = new Student();
		student3.name = "Hakan";
		student3.notlar.add(86.0);
		student3.notlar.add(97.5);
		student3.notlar.add(50.4);
		student3.bolum = "mat";
		student3.id = 3;
		Student student4 = new Student();
		student4.name = "Mert";
		student4.notlar.add(10.0);
		student4.notlar.add(35.5);
		student4.notlar.add(58.4);
		student4.bolum = "tm";
		student4.id = 4;
		Student student5 = new Student();
		student5.name = "Gamze";
		student5.notlar.add(68.0);
		student5.notlar.add(23.5);
		student5.notlar.add(90.4);
		student5.bolum = "mat";
		student5.id = 5;
		Student student6 = new Student();
		student6.name = "Merve";
		student6.notlar.add(36.0);
		student6.notlar.add(23.5);
		student6.notlar.add(58.4);
		student6.bolum = "tm";
		student6.id = 6;
		students.add(student);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);
	}

}
