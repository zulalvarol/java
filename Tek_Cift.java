package hafta2_alistirma;

import java.util.Scanner;

public class Tek_Cift {
	public static void main (String[] args) {
		Scanner girdi = new Scanner (System.in);
		System.out.println("lutfen sayinizi giriniz: ");
		int sayi = girdi.nextInt();
		
		if (sayi%2==0) {
			System.out.println(sayi + " sayisi cifttir.");
		}
		if (sayi%2!=0) {
			System.out.println(sayi + " sayisi tektir.");
		}
	}
}
