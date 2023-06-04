// dikdortgen çevre alan

package hafta2_alistirma;

import java.util.Scanner;

public class Dikdortgen {
	public static void main (String[] args) {
		Scanner girdi = new Scanner (System.in);
		
		System.out.println("Dikdortgenin kisa kenarini giriniz: ");
		int kisak = girdi.nextInt();
		
		System.out.println("Dikdortgenin uzun kenarini giriniz: ");
		int uzunk = girdi.nextInt();
		
		System.out.println("Dikdortgenin çevresi: " + (2*(uzunk + kisak)));
		System.out.println("Dikdortgenin alaný: " + (kisak * uzunk));

	}
}
