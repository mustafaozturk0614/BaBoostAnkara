package com.bilgeadam.lesson018.kuyruk;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

public class Hastane {

	public static void main(String[] args) {

		Queue<Hasta> acilServis = new PriorityQueue<Hasta>();

		acilServis.offer(new Hasta("Mustafa", "Apandisit"));
		acilServis.offer(new Hasta("Oguz", "Apandisit"));
		acilServis.offer(new Hasta("Kemal", "Bas Agrısı"));
		acilServis.offer(new Hasta("Ayşe", "Yanık"));
		acilServis.offer(new Hasta("Zeliha", "Yanık"));
		acilServis.offer(new Hasta("Okan", "Apandisit"));
		acilServis.offer(new Hasta("Orhan", "Yanık"));
		acilServis.offer(new Hasta("Merve", "Yanık"));
		acilServis.offer(new Hasta("Gizem", "Bas Agrısı"));

//		acilServis.forEach(s -> System.out.println(s));

//		while (!acilServis.isEmpty()) {
//			System.out.println("************************");
//			System.out.println(acilServis.poll());
//			System.out.println("************************");
//
//		}

		List<String> şikayetlerList = acilServis.stream().map(s -> {
			if (s.getSikayet().equals("Bas Agrısı")) {
				s.setSikayet("Agrı");
			}
			return s.getSikayet();
		}).collect(Collectors.toList());

		for (String string : şikayetlerList) {
			System.out.println(string);
		}

	}

}
