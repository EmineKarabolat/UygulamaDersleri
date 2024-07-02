package com.eminekarabolat.week02.day02.asal_sayi_odevi;

import java.util.Scanner;

public class AsalSayiEnVerimli {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bir sayı giriniz: ");
		int sayi = scanner.nextInt();
		
		long baslangicZamani = System.currentTimeMillis();
		
		boolean asalMi = true;
		
		if (sayi <= 1) {
			asalMi = false;
		} else {
			// 2'den başlayarak sayının kareköküne kadar olan sayılarla kontrol edelim
			for (int i = 2; i <= Math.sqrt(sayi); i++) {
				if (sayi % i == 0) {
					asalMi = false;
					break; // Asal olmadığını anladığımızda döngüyü sonlandır
				}
			}
		}
		
		if (asalMi) {
			System.out.println(sayi + " bir asal sayıdır.");
		} else {
			System.out.println(sayi + " bir asal sayı değildir.");
		}
		
		long bitisZamani = System.currentTimeMillis();
		long sure = bitisZamani - baslangicZamani;
		
		System.out.println("Programın çalışma süresi: " + sure + " milisaniye");
		
		scanner.close();
	}
	}