package com.bilgeadam.lesson027.singelton.lazy;

/*
 * 
 * Bir evde sadece bir tane robot var diyelim
 * 
 * ve hane halkı robotu cagırdıgı zaman aynı robot işlem yapsın başka bir robot uretmesin bizim 
 * singelton yapısıyla olustrup test edelim testleri ev clasının içerisinde yapcağız 
 * 
 * 
 * 
 */
public class Robot {

	private static Robot robot;

	private Robot() {

	}

	public static Robot getRobot() {

		if (robot == null) {

			robot = new Robot();

		}

		return robot;

	}

	public void calıs() {
		System.out.println(hashCode() + "---> robot çalışıyor");

	}

}
