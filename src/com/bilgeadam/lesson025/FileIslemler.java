package com.bilgeadam.lesson025;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

/*
 * 
 * 	System.out.println("0- Çıkış");
		System.out.println("1- Dosya Yarat");
		System.out.println("2- Ekle");
		System.out.println("3- Okuma");
		System.out.println("4- Harf Değiştir");
		System.out.println("5- Dosya silme");
	System.out.println("lütfen işlem seçiniz");
 * 
 * 
 * 
 * 
 */

public class FileIslemler {

	public static void main(String[] args) {
		FileIslemler fileIslemler = new FileIslemler();
		fileIslemler.menu();

	}

	public void menu() {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		do {
			System.out.println("0- Çıkış");
			System.out.println("1- Dosya Yarat");
			System.out.println("2- Ekle");
			System.out.println("3- Okuma");
			System.out.println("4- Harf Değiştir");
			System.out.println("5- Dosya silme");
			System.out.println("lütfen işlem seçiniz");
			input = Integer.parseInt(scanner.nextLine());

			switch (input) {
			case 1:

				try {
					dosyaYarat(FileSabitler.file);
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}

				break;

			case 2:

				metinEkle(FileSabitler.file, metinGir());
				break;
			case 3:

				metinOku(FileSabitler.file);
				break;
			case 4:

				harfDegistir(metinOku(FileSabitler.file));
				break;
			case 5:

				try {
					dosyaSil(FileSabitler.file);
				} catch (Exception e) {

					System.err.println(e.getMessage());
				}
				break;
			default:
				break;
			}

		} while (input != 0);

	}

	private void dosyaSil(File file) throws Exception {

		if (Files.deleteIfExists(FileSabitler.path)) {

			System.out.println("Dosyanız başarıyla silindi");

		} else {

			System.out.println("Dosya bulunamadı");
		}
//		if (file.exists()) {
//			System.out.println("Dosyanız siliniyor");
//			Thread.sleep(1000);
//			file.delete();
//			System.out.println(file.getName() + "dosyanız silindi");
//		} else {
//			throw new Exception("Böyle bir dosya bulunmamaktadır");
//		}

	}

	public void harfDegistir(String metin) {
		System.out.println(metin);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen değiştirmek istediğiniz harfi giriniz");
		char eskiHarf = scanner.nextLine().charAt(0);
		System.out.println("Lütfen yeni harfi giriniz");
		char yeniHarf = scanner.nextLine().charAt(0);
		metin = metin.replace(eskiHarf, yeniHarf);
		metinEkle(FileSabitler.file, metin);

	}

	private String metinOku(File file) {
		String tümMetin = "";
		try {
			BufferedReader bfr = new BufferedReader(new FileReader(file));
			String metin = "";
			while ((metin = bfr.readLine()) != null) {
				tümMetin += metin + "\n";
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(tümMetin);
		return tümMetin;
	}

	public String metinGir() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen yazdırmak istediğiniz bilgileri giriniz");
		String metin = scanner.nextLine();
		return metin;

	}

	private void metinEkle(File file, String metin) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Metin dosyaya eklenerek mi yazdırılsın (E/H)");
		String karar = scanner.nextLine();
		boolean kontrol = false;
		if (karar.equalsIgnoreCase("e")) {
			kontrol = true;
		}

		BufferedWriter bfw = null;
		try {
			bfw = new BufferedWriter(new FileWriter(file, kontrol));
			bfw.write(metin + "\n");
			bfw.flush();

		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				bfw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private void dosyaYarat(File file) throws Exception {

		if (file.exists()) {

			throw new Exception("Bu dosya onceden oluşturulmuş");

		} else {
			System.out.println("dosya oluşturuluyor...");
			file.createNewFile();
			Thread.sleep(1000);
			System.out.println("Dosyanız oluşturulmuştur");

		}

	}

}
