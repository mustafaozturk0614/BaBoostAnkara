package com.bilgeadam.lesson016.database;

import java.util.Scanner;

/*
 * 2 tane databse sınıfı ,Mysql ,oracle
 * 1 tane İnterface tanımlıyacağız
 * database manager sınıfı yapıcağız bu sınıf içersinde işlemlerimiz gerçekleştirceğiz
 * test sınıfı yaratcağız  database seçimi yapacağız bu seçime metotolarımız çalışasacak
 *  System.out.print("< Gerçekleştirilecek İşlemler >\n-----------------\n[1] - Veri Ekle\n[2] -
 *   Veri Sil\n[3] - Veri Getir\n[4] -
 *    Veri Güncelle\n-----------------\n->
 *     Kararınız:");
 * 
 * 
 * -Test clasımızı 
 * 
 * menü  Karar verecez 1-Mysql 2-Oracle
 * 
 * 1-
 * 
 * mysq veritabınna bağlandı diyecek 
 * sonra menu 
 * 
 * 2-
 * 
 * 
 * 
 */

public class DatabaseManager {

	IDatabase database;// new MysqlDatabase

	public DatabaseManager(IDatabase database) {
		this.database = database;
	}

	public void menu() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("1- veri ekle");
		System.out.println("2- veri sil");
		System.out.println("3- veri getir");
		System.out.println("4- veri güncelle");
		int karar = scanner.nextInt();
		scanner.nextLine();

		switch (karar) {
		case 1:
			System.out.println("---------------------------");
			database.add();
			System.out.println("---------------------------");
			break;
		case 2:
			System.out.println("---------------------------");
			database.delete();
			System.out.println("---------------------------");
			break;
		case 3:
			System.out.println("---------------------------");
			database.get();
			System.out.println("---------------------------");
			break;
		case 4:
			System.out.println("---------------------------");
			database.update();
			System.out.println("---------------------------");
			break;

		default:
			break;
		}

	}

}
