package com.bilgeadam.lesson027.singelton.enumSingelton;

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
public enum Robot3 {

	ROBOT;

	public void calıs() {
		System.out.println(hashCode() + "---> robot çalışıyor");
	}

}
