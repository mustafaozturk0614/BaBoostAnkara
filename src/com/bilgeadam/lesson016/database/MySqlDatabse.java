package com.bilgeadam.lesson016.database;

public class MySqlDatabse implements IDatabase {

	@Override
	public void add() {
		System.out.println("-> Mysql Veritabına ekleme yapıldı ");

	}

	@Override
	public void delete() {
		System.out.println("-> Mysql Veritabından silme işlemi yapıldı ");

	}

	@Override
	public void get() {
		System.out.println("-> Mysql Veritabından istenilen veri çekildi ");

	}

	@Override
	public void update() {
		System.out.println("-> Mysql Veritabından istenilen veri güncellendi ");

	}

	@Override
	public void login() {
		System.out.println("-> Mysql Veritabınına bağlanıldı ");

	}

}
