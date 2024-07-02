package com.eminekarabolat.week02.day01;

public class question01 {
    /*
    1- Bir ürünün fiyatında %18 KDV ve %25 KAR olduğunu biliyoruz. bir ürün fiyatım olsun.
    Bu ürün fiyatından ham fiyatını bulalım.
     */
 
	public static void main(String[] args) {
		float hamFiyat = 0;
		float fiyat=100;
		float kdvOrani=0.18f;
		float karOrani=0.15f;
		float kdvsizFiyat= fiyat- (fiyat*kdvOrani);
		System.out.println("Ürünün KDV'siz fiyatı: " + kdvsizFiyat);
		hamFiyat = kdvsizFiyat - (kdvsizFiyat*karOrani);
		System.out.println("Bu ürünün ham fiyatı : " + hamFiyat);
		
		
	}
}