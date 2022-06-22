package com.bilgeadam.lesson009;

public class Question50 {
//dizi öğelerini tersine çevirme ve yazdırma
	public static void main(String[] args) {
		int arr[] = { 1, 5, 6, 7, 9, 10 };

		tersCevir(arr);

	}

	public static void tersCevir(int[] arr) {
		int j = arr.length - 1;
		for (int i = 0; i < j; i++) {
			int temp = arr[i];// 1,5,6
			arr[i] = arr[j];// 10{10,9,7,6,5,1}
			arr[j] = temp;// 1
			j--;
		}

		for (int i : arr) {
			System.out.println(i);
		}

	}

}
