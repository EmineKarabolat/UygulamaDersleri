package com.eminekarabolat.week02.day01;

public class question03 {
	    /*
    3- İki tane string değişken, (isim ve soyisim), bu değişkenleri yazdıralım.

    3.1- bu değişkenleri tek bir çıktıda alt alta yazdıralım.

    3.2- a ve b karakterlerinin değerini ve karakterler değer toplamını yazdıralım.
    * */
	
	public static void main(String[] args) {
		String name = "Emine";
		String surname = "Karabolat";
		
		System.out.println(name + " " + surname);
		System.out.println(name + "\n"+surname); // \n alt satir kirilimi yapar.
		System.out.println("Isim\t\tSoyisim"); // \t Araya birçok boşluk koymaktadır.
		System.out.println(name+"\t\t"+surname);
		
		char a = 'a';
		char b = 'b';
		System.out.println((int) a);
		System.out.println((int) b);
		
	}
}