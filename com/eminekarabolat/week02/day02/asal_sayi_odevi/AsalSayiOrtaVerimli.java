package com.eminekarabolat.week02.day02.asal_sayi_odevi;


import java.util.Scanner;

public class AsalSayiOrtaVerimli {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		long baslangicZamani = System.currentTimeMillis();
		
		System.out.print("Lutfen bir sayı giriniz: ");
		int sayi = input.nextInt();
		boolean asalMi = true;
		
		// Girilecek olan sayi 1'den buyuk olmalidir, cunku 1 asal sayi degildir.
		if (sayi > 0) {
			for (int i = 1; i < sayi; i++) {
				if (sayi % i == 0) {
					asalMi = false;
				}
			}
			System.out.println("Girilen sayinizin i sayisine bolumunden kalan 0 olmadıgı icin sayiniz asal " +
					                   "degildir.");
		}
		
		if (asalMi) {
			System.out.println(sayi + " bir asal sayıdır.");
		}
		long bitisZamani = System.currentTimeMillis();
		long sure = bitisZamani - baslangicZamani;
		
		System.out.println("Programın çalışma süresi: " + sure + " milisaniye");
		
		input.close();
	}
}