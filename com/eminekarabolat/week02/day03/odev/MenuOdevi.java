package com.eminekarabolat.week02.day03.odev;

import java.util.Scanner;

public class MenuOdevi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hosgeldiniz! / Welcome!");
		System.out.println("Lutfen goruntulemek istediginiz dili seciniz: ");
		System.out.println("1 = Türkçe (TR)");
		System.out.println("2 = English (EN)");
		
		int dilSecimi = scanner.nextInt();
		
		switch (dilSecimi) {
			case 1:
				System.out.println("Türkçe menüyü seçtiniz. ");
				break;
			case 2:
				System.out.println("English (EN) ");
				break;
			default:
				System.out.println("Geçersiz dil seçimi yaptınız. Program sonlandırılıyor.");
		}
		int secim = -1;
		
		while (secim != 0) {
			System.out.println("\nMenü:");
			System.out.println("0 -- Çıkış Yap");
			System.out.println("1 -- Merhaba Dünya yazdır");
			System.out.println("2 -- Faktoriyel Hesapla");
			System.out.println("3 -- Asal sayı kontrolü yap");
			System.out.print("Seçiminizi yapınız: ");
			secim = scanner.nextInt();
			
			switch (secim) {
				case 0:
					System.out.println("Program sonlandırılmıştır! Görüşmek üzere!");
					break;
				case 1:
					System.out.println("Merhaba Dünya!");
					break;
				case 2:
					System.out.print("Faktoriyel hesaplamak istediğiniz sayıyı giriniz: ");
					int sayi;
					int faktoriel= 1;
					System.out.print("Bir sayi giriniz : ");
					sayi = scanner.nextInt();
					for (int i = 2; i <= sayi; i++) {
						faktoriel *= i;
						break;
						
						/*case 3: //Bu satırda hata alıyorum ne yaptıysam düzelmedi
							System.out.print("Bir sayı giriniz: ");
							int sayi = scanner.nextInt();
							
							if (sayi <= 1) {
								System.out.println(sayi + " bir asal sayı değildir.");
							} else {
								boolean asalMi = true;
								for (int i = 2; i <= Math.sqrt(sayi); i++) {
									if (sayi % i == 0) {
										asalMi = false;
										break;
									}
								}
								if (asalMi) {
									System.out.println(sayi + " bir asal sayıdır.");
								} else {
									System.out.println(sayi + " bir asal sayı değildir.");
								}
							}
							break;
								default:
									System.out.println("Geçersiz seçim yaptınız.");
									break;
							}*/
						
						
					}
				
			}
		}
		while (true) {
			System.out.println("\n*** English Menu ***");
			System.out.println("0 -- Exit");
			System.out.println("1 -- Print Hello World");
			System.out.println("2 -- Calculate Factorial");
			System.out.println("3 -- Check Prime Number");
			
			int choice = scanner.nextInt();
			
			switch (choice) {
				case 0:
					System.out.println("Program terminated! Goodbye!");
					return;
				case 1:
					System.out.println("Hello World!");
					break;
				case 2:
					System.out.print("Enter a number to calculate its factorial: ");
					int number = scanner.nextInt();
					System.out.println("The factorial of " + number + " is: " + faktoriel(number));
					break;
				case 3:
					System.out.print("Enter a number to check if it's prime: ");
					number = scanner.nextInt();
					if (isPrime(number)) {
						System.out.println(number + " is a prime number.");
					} else {
						System.out.println(number + " is not a prime number.");
					}
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
					break;
			}
		}
	}
	
	public static int faktoriyel(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		int faktoriyel = 1;
		for (int i = 2; i <= n; i++) {
			faktoriyel *= i;
		}
		return faktoriyel;
	}
	
	public static boolean asalMi(int sayi) {
		if (sayi < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(sayi); i++) {
			if (sayi % i == 0) {
				return false;
			}
		}
		return true;
	}
}