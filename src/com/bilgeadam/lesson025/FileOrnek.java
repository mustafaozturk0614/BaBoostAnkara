package com.bilgeadam.lesson025;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOrnek {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("deneme.txt");
			FileInputStream fis = new FileInputStream("deneme.txt");

			fos.write(65);
			byte[] array = { 101, 80, 88 };
			fos.write(array);
			String string = "Merhaba dünya";
			fos.write(string.getBytes());
			///// okuma işlemi

//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
//			System.out.println((char) fis.read());
			int deger;
			while ((deger = fis.read()) != -1) {
				System.out.println((char) deger);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//////////////////////////////////////
		// Buffered////

		try {

			String path = "deneme4.txt";
			File file = new File(path);
			file.createNewFile();

			BufferedWriter writer = new BufferedWriter(new FileWriter("deneme2.txt"));
			BufferedReader reader = new BufferedReader(new FileReader("deneme2.txt"));
			writer.write("satır1 " + "\n");

			writer.write("satır2");

			writer.flush();

			String deger2;
//			deger2 = reader.readLine();
//			System.out.println(deger2);
//			deger2 = reader.readLine();
//			System.out.println(deger2);
//
			while ((deger2 = reader.readLine()) != null) {
				System.out.println(deger2);
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
