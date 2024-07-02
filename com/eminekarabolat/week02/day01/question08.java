package com.eminekarabolat.week02.day01;

import java.util.Scanner;

public class question08 {
	/*
	1'den başlayarak, kullanıcının girdiği sayıya kadar olan (sayı dahil) sayıların 1 fazlasının toplamını ekrana yazdıran program.
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayi giriniz: ");
		
		int sayi = input.nextInt(); //Dışarıdan sayı alan komut satırı.
		int toplam = 0; // Sayıların toplamına bir değer atandı.
		
		for (int i = 1; i < sayi+1; i++) {
			toplam =toplam + (i+1);
		}
		System.out.println("Toplam: " + toplam);
		input.close();
		
	}
}