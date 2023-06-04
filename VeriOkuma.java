//veri okuma

package ders_hafta2;

import java.util.Scanner;

public class VeriOkuma {
	public static void main (String[] args) {
		Scanner veriAl = new Scanner(System.in);
		
		System.out.print("Adýnýzý ve soyadýnýzý giriniz: ");
		String adSoyad = veriAl.nextLine();
		
		System.out.print("Yaþýnýzý girin: ");
		int yas = veriAl.nextInt();
		
		System.out.print("Cinsiyetinizi girin: ");
		char cinsiyet = veriAl.next().charAt(0);
		
		System.out.println("Merhaba, " + adSoyad + " " + yas + " yaþýndasýnýz ve cinsiyetiniz: " + cinsiyet);
		
		boolean durum = true;
		System.out.println("Durum: " + durum); // Durum: true
		
		final String ad = "Varol";
		System.out.println(ad);
		
		final double PI = 3.14159; // final --> deðeri sabitler
		System.out.println("PI: " + PI);
		
	}
	

}
