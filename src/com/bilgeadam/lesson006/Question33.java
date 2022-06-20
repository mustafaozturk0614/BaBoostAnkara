package com.bilgeadam.lesson006;

public class Question33 {

	public static void main(String[] args) {
		// bir dizide 13 var ise 13 ve bir sonra ki
		// eleman toplama eklenmeden toplam souncu bulan kod
		int nums[] = { 1, 13, 13, 13, 5, 1 };
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 13) {
				if (nums.length > i + 1 && nums[i + 1] != 13) {
					i++;
				}

			} else {
				sum += nums[i];
			}

		}
		System.out.println(sum);

	}

}
