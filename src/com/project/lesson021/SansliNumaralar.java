package com.project.lesson021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
 * 
 * 1 den 100 e kadr rastgele
 * 10 000 tane sayı ureteceğiz 
 * 1- sayıolustur metodu ile rastgele olusturduğumuz sayıları map a atacağız 
 * sayının kaç kere olduğunu tutacağız key değeri sayı 
 * value değeri ise kaç kere üretildiği.
 * 2-map de gezinirken  listeye ekleyeceğiz her elaman
 *  ne kadar tekrar ediyorsa o kadar
 * kez listeye ekleyeceğiz
 * 
 *3- en son listeden rastgele 10 adet değer alacğız ve bunu bir set e ekleyeceğiz 
 * 
 * 
 */

public class SansliNumaralar {

	public static final int maxSayi = 100;
	public static final int sayiAdeti = 10000;

	Map<Integer, Integer> sayilarMap;
	List<Integer> sayiListesi;
	Set<Integer> sansliNumaralar;

	public SansliNumaralar() {
		super();
		this.sayilarMap = new HashMap<Integer, Integer>();
		this.sayiListesi = new ArrayList<Integer>();
		this.sansliNumaralar = new TreeSet<Integer>();
	}

	public void sanslıOnSayiyiBul() {
		Collections.shuffle(sayiListesi);
		while (sansliNumaralar.size() < 10) {
			int index = rastgeleSAyiUret(sayiAdeti);
			sansliNumaralar.add(sayiListesi.get(index));
		}

		sansliNumaralar.forEach(System.out::println);

	}

	public void listeyeEkle() {

		for (Entry<Integer, Integer> sayilar : sayilarMap.entrySet()) {

			for (int i = 0; i < sayilar.getValue(); i++) {
				sayiListesi.add(sayilar.getKey());
			}

		}

	}

	public void mapOlustur() {

		for (int i = 0; i < sayiAdeti; i++) {

			int sayi = rastgeleSAyiUret(maxSayi) + 1;
			if (sayilarMap.containsKey(sayi)) {
				sayilarMap.replace(sayi, sayilarMap.get(sayi) + 1);
			} else {
				sayilarMap.put(sayi, 1);
			}

		}

	}

	public int rastgeleSAyiUret(int sayi) {
		Random random = new Random();

		return random.nextInt(sayi);

	}

	public static void main(String[] args) {

		SansliNumaralar sansliNumaralar = new SansliNumaralar();
		sansliNumaralar.mapOlustur();
		sansliNumaralar.listeyeEkle();
		sansliNumaralar.sanslıOnSayiyiBul();
		System.out.println("50 den büyük sayılar");
		sansliNumaralar.sansliNumaralar.stream().filter(x -> x > 50).forEach(System.out::println);
		System.out.println("Sayıların toplamı");
		System.out.println(sansliNumaralar.sansliNumaralar.stream().reduce((s1, s2) -> s1 + s2).get());
		System.out.println("50den büyük sayıların toplamı");
		Optional<Integer> toplam = sansliNumaralar.sansliNumaralar.stream().filter(s -> s > 50)
				.reduce((sayi1, sayi2) -> sayi1 + sayi2);
		System.out.println(toplam.get());

	}

}
