package com.eminekarabolat.week02.day01;

import java.util.Scanner;

public class question07 {
	/*
	Dışarıdan girilen bir sayının faktoriyelini alalım.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Lutfen faktoriyelini alacagınız sayiyiyi giriniz: ");
		int sayi = input.nextInt();
		int factorial= 1;
		// 1. Cozum
		for (int i = 2; i <= sayi; i++) {
			factorial *= i;
			
		}
		System.out.println(factorial);
	}
}