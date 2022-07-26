package com.bilgeadam.lesson024.okulYonetim;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class TestSerilestirme {

	public static void main(String[] args) {

		Ogrenci ogrenci = new Ogrenci("Ali,", LocalDate.of(2000, 10, 10));

		try {
			FileOutputStream file = new FileOutputStream("test.txt");
			ObjectOutputStream yaz = new ObjectOutputStream(file);
			yaz.writeObject(ogrenci);
			System.out.println("Serileştirme başarılı");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		}

		try {
			FileInputStream file2 = new FileInputStream("test.txt");
			ObjectInputStream oku = new ObjectInputStream(file2);
			Ogrenci ogrenci2 = (Ogrenci) oku.readObject();
			System.out.println(ogrenci2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
