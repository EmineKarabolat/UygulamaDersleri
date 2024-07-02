package com.eminekarabolat.week02.day01;

import java.util.Scanner;

public class question05 {
	/*
	Dairenin alanını ve çevresini bulalım. (Çap ya da yarıçap input olarak gelsin).
	 */
	public static void main(String[] args) {
		final double PI = Math.PI;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen hesaplama yapilacak dairenin yaricapini giriniz: ");
		double radius = scanner.nextDouble();
		double area = PI * radius * radius;
		double perimeter = 2 * PI * radius;
		System.out.println("Dairenin alani:" + area + "\n Dairenin cevresi: " + perimeter);
		scanner.close();
	}
	
}