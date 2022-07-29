package com.bilgeadam.lesson027.singelton.eager;

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
public class Robot2 {

	private static Robot2 robot = new Robot2();

	private Robot2() {

	}

	public static Robot2 getRobot() {

		return robot;

	}

	public void calıs() {
		System.out.println(hashCode() + "---> robot çalışıyor");
	}

}
