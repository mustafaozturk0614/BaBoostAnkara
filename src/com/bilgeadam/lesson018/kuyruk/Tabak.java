package com.bilgeadam.lesson018.kuyruk;

import java.util.Random;

/*
 * 
 *  int id 
 *  
 *  kirli olup olmadığını tutacak bir değişken
 * 
 * 
 * 
 *test sınıfı olusturup 
 *
 *rastgele 10 tane tabak nesnesi olusturacağız 
 *kirli olup olmadıkları değerleri rastgele belli olacak 
 *
 *eğer kirli ise kirli tabaklar stack ine ekle
 *
 *
 *
 *eğer temiz ise temiz tabaklar stack ine ekle
 *
 *
 * 
 * 
 * 
 * 
 */

public class Tabak {

	int id;
	boolean kirliMi;

	public Tabak() {
		Random random = new Random();
		this.kirliMi = random.nextBoolean();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isKirliMi() {
		return kirliMi;
	}

	public void setKirliMi(boolean kirliMi) {
		this.kirliMi = kirliMi;
	}

	@Override
	public String toString() {
		return "Tabak [id=" + id + ", kirliMi=" + kirliMi + "]";
	}

}
