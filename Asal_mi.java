package hafta2_alistirma;

import java.util.Scanner;

public class Asal_mi {
	public static void main (String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.print("bir sayi giriniz: ");
		boolean asal = true;
		int sayi = girdi.nextInt();
		
		if (sayi<=1) {
			System.out.print("1den buyuk pozitif tam sayilar icin asal kontrolu yapilir.");
		}
		else {
			for (int i=2; i<sayi; i++) {
				int kalan = sayi % i;
				if (kalan == 0) {
					asal = false;
					break;
				}
			}
		}
		System.out.println(asal==true);
		/*if (asal) {
			System.out.println("sayi asaldir");
		}
		else {
			System.out.println("sayi asal degildir");
		}*/
		
	}
}
