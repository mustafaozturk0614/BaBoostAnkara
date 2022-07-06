package com.bilgeadam.lesson018.kuyruk;

import java.util.LinkedList;
import java.util.Queue;

public class Kuyruk {

	public static void main(String[] args) {

		Queue<String> kuyruk = new LinkedList<String>();
		kuyruk.offer("Merve");
//		kuyruk.offer("Damla");
//		kuyruk.offer("Can");
//		kuyruk.add("Sinem");

//		kuyruk.forEach(s -> System.out.println(s));

//		System.out.println(kuyruk.remove());
//		System.out.println(kuyruk.remove());
		System.out.println(kuyruk.poll());
		System.out.println(kuyruk.poll());
//	System.out.println(kuyruk.remove());

//		while (!kuyruk.isEmpty()) {
//			System.out.println(kuyruk.poll());
//		}
//
//		System.out.println(kuyruk);

	}

}
