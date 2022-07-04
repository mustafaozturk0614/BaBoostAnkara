package com.bilgeadam.lesson016.database;

public class OracleDatabse extends Databse implements IDatabase {

	@Override
	public void add() {
		System.out.println("-> Oracle Veritabına ekleme yapıldı ");

	}

	@Override
	public void delete() {
		System.out.println("-> Oracle Veritabından silme işlemi yapıldı ");

	}

	@Override
	public void get() {
		System.out.println("-> Oracle Veritabından istenilen veri çekildi ");

	}

	@Override
	public void update() {
		System.out.println("-> Oracle Veritabından istenilen veri güncellendi ");

	}

	@Override
	public void login() {
		System.out.println("-> Oracle Veritabınına bağlanıldı ");
	}

}
