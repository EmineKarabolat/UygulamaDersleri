package com.eminekarabolat.week02.day01;

import java.util.Scanner;

public class question04 {
	
	   /*
    4- Kullanıcıdan önce yaşını, sonrasında da
    kullanıcının ismini girdi olarak isteyelim. İsmini ve yaşını ekrana yazdıralım.
     */
	   public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Lutfen yasinizi giriniz: ");
		   int age = sc.nextInt();
		   sc.nextLine(); // -> bu bos nextLine() bir ust satirdaki "\n" i yutacak.
		   
		   System.out.println("Lutfen isminizi giriniz: ");
		   String name = sc.nextLine(); // -> bu nextLine kullanicinin girecegi stringi okur hale gelecek.
		   sc.close();
		   System.out.println("Kullanicicnin girdigi isim ve yas: " + name + " " +age);
	   }
}