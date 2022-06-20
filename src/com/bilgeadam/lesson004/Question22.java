package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {

		/*
		 * Menu 1-Dışarıdan bir kelime girilsin eğer kelimemizin için de 'a' harfi varsa
		 * kaç tane olduğunu ve index numaralarını yazdırın.
		 * 
		 * 
		 * 2-Dışarıdan bir kelime giriniz daha sonra değiştirmek istediğiniz harfi
		 * giriniz daha sonra hangi harfle değiştireceğinizi giriniz Eğer kelimemiz
		 * içerisinde o harf varsa değiştirsin
		 * 
		 *
		 * 3-Dışarıdan Girilen bir kelimeyi ters çevirip yazdıralım.Polindrom olup
		 * olmadığını bulunuz(kek,iki,kabak)
		 * 
		 * 
		 * 4- Dışarıdan 5 adet kelime girelim her kelimede a, b veya c ile başlayıp
		 * başlamadığımızı kontrol etsin (a, b,c ile başlayanlar için ayrı ayrı sayfa
		 * açıldığını düşünün elimizde) her a bir sayfaya her b bir sayfaya her c bir
		 * sayfaya yazılacak gibi düşünelim diğer harfle başlayanlar için ise ayrı bir
		 * sayfa düşünelim girilen 5 adet kelimeyi kontrol ettikten sonra elimizde kaç
		 * sayfa oluğunu ekrana yazdıralım.
		 * 
		 * 5- 4.sorunun 2.yöntemi
		 * 
		 * 
		 * 
		 * 0-Çıkış
		 */

		Scanner scanner = new Scanner(System.in);
		boolean menuTekrar = true;
		String menuMetni = "";

		StringBuilder stringBuilder = new StringBuilder();

		while (menuTekrar) {
			System.out.println("========String İşlemleri======");
			System.out.println("1-Harf Saydırma");
			System.out.println("2-Harlerin Yerlerini Değiştirme");
			System.out.println("3-Kelimeyi ters çevirerek yazdırma");
			System.out.println("4-Harflere Göre Sayfa sayısı belirleme Yöntem-1-");
			System.out.println("4-Harflere Göre Sayfa sayısı belirleme Yöntem-2-");
			System.out.println("0-çıkış");
			System.out.println("==============");
			System.out.println(menuMetni);
			int input = scanner.nextInt();
			scanner.nextLine();

			switch (input) {

			case 1 -> {
				String indexNo = "";
				int sayac = 0;
				System.out.println("Bir metin giriniz");
				String kelime = scanner.nextLine();
				if (!kelime.contains("a")) {
					System.out.println("Aradığınız harf yok");
					break;
				}
				for (int i = 0; i < kelime.length(); i++) {// Bütün string değerini sırayla gezip kontrol ediyoruz

					if (kelime.charAt(i) == 'a') {
						sayac++;// içerisinde a harfi varsa sayacı 1 arttıryoruz
						indexNo += i + ",";// ve index numarasınız string bir değere kaydediyoruz

					}
				}
				System.out.println("Girilen kelimede 'a' harfi " + sayac + " tane vardır");
				System.out.println(" 'a' harfi indexleri" + indexNo);

			}
			case 2 -> {

				while (true) {

					System.out.println("lütfen bir kelime giriniz ");
					String kelime = scanner.nextLine();
					System.out.println("Hangi harfi değişltirmek istersiniz");
					String oldLetter = scanner.nextLine();
					if (kelime.contains(oldLetter)) {
						System.out.println("Yeni harf ne olsun");
						String newLetter = scanner.nextLine();
						kelime = kelime.replace(oldLetter, newLetter);
						System.out.println("Kelimenizin son hali " + kelime);
						break;
					} else {
						System.out.println("Girdiğiniz Harf Kelimenizde yoktur");

					}
				}

			}
			case 3 -> {
				System.out.println("Lütfen bir kelime giriniz");
				String kelime = scanner.nextLine();
				String tersKelime = "";
				System.out.println("Kelimenin tersi:");
//				for (int i = 0; i < kelime.length(); i++) {                            /// BİRİNCİ ÇÖZÜM
//					stringBuilder.append(kelime.charAt((kelime.length() - 1) - i)); 
//					
//				}

				for (int i = kelime.length() - 1; i >= 0; i--) {/// İKİNCİ ÇÖZÜM

					tersKelime += kelime.charAt(i);

				}
				System.out.println(tersKelime);
				if (kelime.equalsIgnoreCase(tersKelime)) {

					System.out.println("Kelimeniniz Polindromdur");
				} else {
					System.out.println("Kelimeniniz Polindrom değildir");
				}

			}
			case 4 -> {
				String sayfaString = "";// sayfaların sayısını tutmak için kullandığımız string değer
										// eğer a harfi ile başlayan bir değer ilk kez girilmiş ise bu stringe ekliyoruz
										// daha önce eklenmişse eklemiyoruz
				int kelimeSayısı = 5; // Gireceğimiz kelime sayısı
				String value;// Dışarıdan Gireceğimiz kelimenin değişkeni

				do {
					System.out.println("Kelime Giriniz");
					value = scanner.nextLine();

					if (value.startsWith("a")) { // Dışarıdan girilen kelime a ile mi başlıyor onu kontrol ediyoruz
													// doğru ise alt satıra geçiyor
						if (!sayfaString.contains("a")) {// sayfamızın başlıklarını tutuğumuz sayfa sayısı için
															// tuutğumuz değeri kontrol ediyoruz içerisinde
															// 'a' harfi varmı yoksa sayfaya ekliyoruz varsa eklemeden
															// devam ediyoruz bu sayede dışarıdan ne kadar
															// 'a' ile başlayan değer girersek girelim sadece bir kez
															// eklemiş olduk hepsini bir sayfada tutmuş olduk
							sayfaString += "a";
						}

					} else if (value.startsWith("b")) {// Aynı mantık b ve c için de geçerli
						if (!sayfaString.contains("b")) {
							sayfaString += "b";

						}
					} else if (value.startsWith("c")) {
						if (!sayfaString.contains("c")) {
							sayfaString += "c";

						}

					} else {
						if (!sayfaString.contains("x")) {// eğer "a,b,c"dışında başka bir harfle başlıyorsa kelimemiz
															// bir tane referans değeri belirliyoruz kendimize
															// "x" diye bu 3 harf dışında bir harf ile başlayan bir
															// kelime girilmiş ise sayfa sayacımızı kjontrol ediyoruz
															// daha önce girilmemişse sayfa sayacımızda 'x değeri
															// olamyacak burada ki kontrol ile ilk defa girildiğinde bir
															// x ekliyoruz daha sonra girilen her"a,b,c" dışın aki değer
															// için yeni bir şey eklememiş oluyoruz
							sayfaString += "x";

						}

					}
					kelimeSayısı--;

				}

				while (kelimeSayısı > 0);
				System.out.println("Sayfa sayısı" + sayfaString.length());// en sonunda 5 tane kelime değeri girdikten
																			// sonra
																			// sayacımızın uzunluğunu buraya
																			// yazdırıyoruz buda bize kaç sayfa
																			// açtığımızı gösteriyor

			}

			case 5 -> {
				String defter = "";
				for (int i = 0; i < 5; i++) {
					switch (scanner.nextLine().charAt(0)) {
					case 'a', 'A' -> {
						if (!defter.contains("a"))
							defter += "a";
					}
					case 'b', 'B' -> {
						if (!defter.contains("b"))
							defter += "b";
					}
					case 'c', 'C' -> {
						if (!defter.contains("c"))
							defter += "c";
					}
					default -> {
						if (!defter.contains("x"))
							defter += "x";
					}
					}
				}
				System.out.println("Açılan sayfa sayısı : " + defter.length());
			}
			case 0 -> {
				menuTekrar = false;
			}

			default -> {
			}

			}

		}

	}

}
