package com.bilgeadam.lesson017.menu;

import java.util.Random;

public class MenuManager {

	public Enum menuBelirle(Enum[] dizi) {
		int uzunluk = dizi.length;
		int index = randomIndex(uzunluk);
		return dizi[index];
	}

	public Enum menuBelirle(EIcecek[] dizi) {
		int uzunluk = dizi.length;
		int index = randomIndex(uzunluk);
		while (true) {

			if (dizi[index].isAtandımı()) {
				index = randomIndex(uzunluk);

			} else {

				dizi[index].setAtandımı(true);
				return dizi[index];
			}

		}

	}

	public int randomIndex(int uzunluk) {

		Random random = new Random();

		return random.nextInt(uzunluk);
	}

	public static void main(String[] args) {

		MenuManager menuManager = new MenuManager();

		for (EGun gun : EGun.values()) {
			System.out.println(gun.ordinal() + 1 + "-" + gun);
			Menu menu = new Menu();
			menu.setCorba((ECorba) menuManager.menuBelirle(ECorba.values()));
			menu.setIcecek((EIcecek) menuManager.menuBelirle(EIcecek.values()));
			menu.setYemek((EYemek) menuManager.menuBelirle(EYemek.values()));
			menu.setTatli((ETatli) menuManager.menuBelirle(ETatli.values()));
			System.out.println(menu);

		}

	}

}
