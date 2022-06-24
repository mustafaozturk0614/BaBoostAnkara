package com.bilgeadam.lesson011;

import java.util.Scanner;

public class Uygulama {

	Kullanıci[] kullanıcilar = new Kullanıci[3];
	int ziyaretciSayısı;
	static Scanner scanner = new Scanner(System.in);
	int index;

	public void menu() {
		int input = 0;

		do {
			System.out.println("=======Uygulama Giriş Ekranı===========");
			System.out.println("Ziyaretci Sayısı: " + ziyaretciSayısı);
			System.out.println("Kullanıcı Sayısı: " + index);
			System.out.println("--------------------------------------");
			System.out.println("1-Kayıt Ol");
			System.out.println("2-Giriş Yap");
			System.out.println("3-Kullanıcıları göster");
			System.out.println("4-Çıkış");
			System.out.println();
			System.out.print("Lütfen Bir İşlem Seçiniz :");
			System.out.println();
			input = scanner.nextInt();
			scanner.nextLine();

			switch (input) {
			case 1:
				kayitOl();
				break;
			case 2:
				girisYap();
				break;

			case 3:
				for (int i = 0; i < index; i++) {

					System.out.println(kullanıcilar[i].isim);

				}
				break;
			case 4:
				System.out.println("/////////////////////");
				System.out.println("Güle güle............");
				System.out.println("/////////////////////");
				System.exit(0);
				;
				break;
			default:
				break;
			}

		} while (input != 0);

	}

	public void girisYap() {
		// kullanıcıdan email şifre bilgilerini alıcağız
		// kullanıcıdan aldığımız değerler ile bizim kayıt ettiğimiz değerler eşitmi
		// diye kontrol edeceğiz;

		System.out.println("=======Giriş Ekranı===========");
		System.out.println();
		boolean kontrol = true;
		boolean kontrol2 = false;
		int hak = 0;
		int id = -1;
		do {
			System.out.println("Lütfen Email adresinizi giriniz");
			String email = scanner.nextLine();
			System.out.println("Lütfen Şifrenizi giriniz");
			String sifre = scanner.nextLine();
			for (int i = 0; i < index; i++) {

				if (kullanıcilar[i].email.equals(email)) {

					id = kullanıcilar[i].id;

					if (kullanıcilar[i].sifre.equals(sifre)) {
						System.out.println("Giriş Yaptınız ");
						System.out.println("---------------");
						ziyaretciSayısı++;
						kontrol2 = true;
						anaSayfa();
						kontrol = false;

					}
				}
			}
			if (id == -1) {
				System.out.println("Sistemimize kaytlı mail adresi bulunamamıştır");
				System.out.println("---------------");

			} else {
				if (kontrol2 == false) {
					System.out.println("Girdiğiniz bilgiler hatalı");
					System.out.println("---------------");
					hak++;
					kontrol = sifreSıfırlama(hak, id);

				}
			}

		} while (kontrol);

	}

	private boolean sifreSıfırlama(int hak, int id) {
		boolean kontrol = true;
		if (hak == 3) {
			sifreDegistir(id);
			kontrol = false;

		} else {
			System.out.println("Şifre Sıfırlamak istiyormusunuz (E/H)");
			String input = scanner.nextLine();
			if (input.equalsIgnoreCase("e")) {
				sifreDegistir(id);
				kontrol = false;
			}
		}
		return kontrol;
	}

	private void sifreDegistir(int id) {

		System.out.println("=======Şifre Değitrime Ekranı===========");
		System.out.println();
		boolean kontrol = false;
		while (true) {

			String input = sifreKontrol("Lütfen yeni şifrenizi giriniz");
			if (kullanıcilar[id].sifre.equals(input)) {
				System.out.println("Şifreniz eski şifrenizle aynı lütfen farklı bir şifre giriniz");
				System.out.println("---------------");
			} else {
				kullanıcilar[id].sifre = input;
				System.out.println("şifriniz değiştirilmiştir");
				System.out.println("---------------");
				break;
			}
		}
	}

	public void kayitOl() {
		System.out.println("=======Kayıt Ekranı===========");
		System.out.println();
		if (kullanıcilar[kullanıcilar.length - 1] != null) {
			System.out.println("Uygulama kapasitesi dolmuştur");
		} else {
			Kullanıci kullanıci = new Kullanıci();
			System.out.print("Lütfen isminizi giriniz: ");
			kullanıci.isim = scanner.nextLine().trim();
			String email = emailKontrol();
			String sifre = sifreKontrol("Lütfen şifrenizi giriniz: ");
			kullanıci.email = email;
			kullanıci.sifre = sifre;
			kullanıci.id = index;
			kullanıcilar[index] = kullanıci;
			index++;
			System.out.println("Kaydınız Başarıyla Tamamlanmıştır.");
			System.out.println("---------------------------");
		}

	}

	public String sifreKontrol(String sorgu) {
		boolean kontrol = true;
		String sifre;
		do {
			System.out.print(sorgu);
			sifre = scanner.nextLine().trim();
			if (sifre.length() > 4) {
				kontrol = false;
			} else {
				System.out.println("Şifreniz en az 5 karakterli olmalıdır");
				System.out.println("---------------");
			}
		} while (kontrol);
		return sifre;
	}

	public String emailKontrol() {
		boolean kontrol = true;
		String email;
		do {
			System.out.print("Lütfen mailnizi giriniz: ");
			email = scanner.nextLine().trim();
			if (email.contains("@") && email.endsWith(".com")) {

				kontrol = false;
			} else {
				System.out.println("Lütfen Geçerli Bir email adresi giriniz");
				System.out.println("---------------");
			}

		} while (kontrol);
		return email;
	}

	public void anaSayfa() {

		int input = 0;
		do {
			System.out.println("=======Anket Ekranı===========");
			System.out.println("1-Anket Oluştur");
			System.out.println("2-Anket Sil");
			System.out.println("3-Çıkış");
			input = scanner.nextInt();
			scanner.nextLine();
			switch (input) {
			case 1:
				System.out.println("Anket oluşturuldu");
				break;
			case 2:
				System.out.println("Anket Silindi");
				break;
			case 3:
				System.out.println("Giriş Ekranına Dönülüyor...");
				System.out.println("==================");
				input = 0;
				break;
			default:
				break;
			}

		} while (input != 0);

	}

}
