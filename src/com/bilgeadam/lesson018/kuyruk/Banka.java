package com.bilgeadam.lesson018.kuyruk;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

/*
 * Musteri kuyrugu olusturalaım öncelikli 
 * 
 * 
 */
public class Banka {

	public static void main(String[] args) {

		Queue<Musteri> musteriKuyrugu = new PriorityQueue<Musteri>();

		musteriKuyrugu.offer(new Musteri("Mustafa", 34));
		musteriKuyrugu.offer(new Musteri("Kemal", 66));
		musteriKuyrugu.offer(new Musteri("Okan", 70));
		musteriKuyrugu.offer(new Musteri("Gizem", 24));

		int i = 1;

//		while (!musteriKuyrugu.isEmpty()) {
//			System.out.println("-----------------");
//			System.out.println(i + "sırada " + musteriKuyrugu.poll());
//
//		}

		List<Musteri> musteris = musteriKuyrugu.stream().filter(s -> s.yas > 60).collect(Collectors.toList());
		musteriKuyrugu.stream().map(s -> s.yas > 60).collect(Collectors.toList());
		musteris.forEach(System.out::println);

	}
}
