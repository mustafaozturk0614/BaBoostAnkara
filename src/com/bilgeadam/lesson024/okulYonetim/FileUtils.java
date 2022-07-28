package com.bilgeadam.lesson024.okulYonetim;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 
 * 1-static degerler ve metotolar olusturacağız
 * 
 * 2-bir dosaya okuma ve yazma işlemi için gerekli olan özellikerli tanımlayacağız
 * 
 * 3- dosyaya yazma metodumuz olsun bir isim bir dogum yılı 3 tanede not  
 * bu değerlerimizi   ali,210-10-10,60,70,80 buradaki gibi yazdıralım toplam 3 tane değer yazdıralm
 * 
 * 4- okuma metodumuz olsun her satırı okusun ve bir string  listesine atsın ve bu listeyi dönelim
 * 
 * 5- bulisteden de ogrenci oluşturalım aynı metot içerisinde ogrencilerimizi yazdıralım  
 * 
 * 
 * 
 * 
 */

public class FileUtils {

	public static String path = "ogrenci.txt";
	public static File file = new File(path);

	public static void main(String[] args) {
		okuma();
	}

	public static List<String> okuma() {
		List<String> ogrecList = new ArrayList<String>();
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

			String string;
			while ((string = bufferedReader.readLine()) != null) {

				ogrecList.add(string);

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (String string : ogrecList) {
			System.out.println(string);
		}
		return ogrecList;
	}

	public static void dosyayaYaz() {

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));

			for (int i = 0; i < 3; i++) {
				writer.write(bilgileriAl() + "\n");
				writer.flush();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static String bilgileriAl() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen isiminiz Giriniz");
		String isim = scanner.nextLine();
		System.out.println("Lütfen dogum tarihinizi Giriniz");
		String date = scanner.nextLine();
		System.out.println("Lütfen  notunuz Giriniz");
		String not1 = scanner.nextLine();
		System.out.println("Lütfen  notunuz Giriniz");
		String not2 = scanner.nextLine();
		System.out.println("Lütfen  notunuz Giriniz");
		String not3 = scanner.nextLine();
		String deger = isim + "," + date + "," + not1 + "," + not2 + "," + not3;
		return deger;
	}

}
