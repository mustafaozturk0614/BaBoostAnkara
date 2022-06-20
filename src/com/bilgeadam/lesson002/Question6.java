package com.bilgeadam.lesson002;

public class Question6 {
//	1den başlayarak sayıları toplayalım sayıların 
//	toplamı 50 den büyük  olana kadar döngümüz çalışsın  

	public static void main(String[] args) {

		int top = 50;
		int sum = 0;
		int i = 1;
		boolean check = true;
		int temp = 1;
		while (temp < 50) {
			temp += i + 1;
			sum += i;
			i++;
			System.out.println(sum);
		}
	}
}
