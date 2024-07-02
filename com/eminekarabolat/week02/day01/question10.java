package com.eminekarabolat.week02.day01;

import java.util.Scanner;

public class question10 {
	/*
	girilen sayının basamakları toplamını ekrana yazdıralım.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Bir sayi giriniz:");
		int number = input.nextInt();
		int total = 0;
		
		while (number > 0) {
			int digitValue = number % 10;
			total += digitValue;
			number /= 10;
			
		}
		System.out.println("Girilen sayinin basamakları toplamı:  " + total);
	}
}