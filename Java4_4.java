package hafta2_alistirma;

import java.util.Scanner;

public class Java4_4 {
	public static void main (String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.print("bir sayi giriniz: ");
		boolean bolunme = true;
		int sayi = girdi.nextInt();
		
		if (sayi % 5 == 0 && sayi % 10 == 0) {
			bolunme = true;
		}
		else {
			bolunme = false;
		}
		
		System.out.println(bolunme==true);	
	}
}
