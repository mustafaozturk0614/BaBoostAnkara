package com.bilgeadam.lesson016.database;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		DatabaseManager databaseManager;

		Scanner scanner = new Scanner(System.in);

		System.out.println("1-Mysql");
		System.out.println("2-Oracle");
		int karar = scanner.nextInt();

		switch (karar) {
		case 1:
			databaseManager = new DatabaseManager(new MySqlDatabse());
			databaseManager.database.login();
			databaseManager.menu();
			break;
		case 2:
			databaseManager = new DatabaseManager(new OracleDatabse());
			databaseManager.database.login();
			databaseManager.menu();
			break;

		default:
			break;
		}
	}
}
