package com.eminekarabolat.week02.day01;

import java.util.Scanner;

public class question06 {
	/*
	Dışarıdan 2 adet tam sayı değeri alalım. iki sayının toplamı çift ise true, değil ise false yazdıralım. Bu
	değerlerin bir de ortalamasını alalım ve yazdıralım.
	 */
	public static void main(String[] args) {
		int sayi1, sayi2, toplam;
		double ortalama;
		boolean isEven;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Birinci sayiyi giriniz: ");
		sayi1 = input.nextInt();
		System.out.println("İkinci sayiyi giriniz: ");
		sayi2 = input.nextInt();
		ortalama = (double) (sayi1 + sayi2) / 2.0;
		isEven = ((sayi1 + sayi2) % 2 == 0);
		System.out.println(ortalama + " " + isEven);
		
	}
}