package com.bilgeadam.lesson018.kuyruk;

import java.util.Random;
import java.util.Stack;

/*
 * 
 * rastgele 1 yada 2 gelecek sekilde bir seçim uretecek
 * secime göre eğer 1 ise  temizle metodu çalışssın 
 * eger 2 ise kullan metodu çalışsın 
 * 
 * 
 */
public class Test {

	Stack<Tabak> kirli;
	Stack<Tabak> temiz;
	Stack<Tabak> tumTabaklar;

	public Test() {
		kirli = new Stack<Tabak>();
		temiz = new Stack<Tabak>();
		tumTabaklar = new Stack<Tabak>();
	}

	public static void main(String[] args) {
		Random random = new Random();
		Test test = new Test();
		test.randomTabakUret();

		for (int i = 0; i < 50; i++) {

			int secim = random.nextInt(2) + 1;
			test.rastgeleSecim(secim);
		}

	}

	public void rastgeleSecim(int secim) {

		switch (secim) {
		case 1:
			temizle();
			break;
		case 2:
			kullan();
			break;

		default:
			break;
		}

	}

	public void temizle() {

		if (!kirli.isEmpty()) {

			Tabak tabak = kirli.pop();
			tabak.setKirliMi(false);
			temiz.push(tabak);
			System.out.println(tabak.id + " id li tabak temizlenmiştir");

		} else {
			System.out.println("Kirli Tabak Kalmamıştır");
			kullan();
		}

	}

	public void kullan() {

		if (!temiz.isEmpty()) {

			Tabak tabak = temiz.pop();
			tabak.setKirliMi(true);
			kirli.push(tabak);
			System.out.println(tabak.id + " id li tabak kullanılmıştır");

		} else {
			System.out.println("Temiz Tabak Kalmamıştır");
			temizle();
		}

	}

	public void randomTabakUret() {

		for (int i = 0; i < 10; i++) {

			Tabak tabak = new Tabak();
			tabak.setId(i + 1);
			tumTabaklar.push(tabak);
			if (tabak.isKirliMi()) {

				kirli.push(tabak);

			} else {
				temiz.push(tabak);
			}

		}

	}

}
