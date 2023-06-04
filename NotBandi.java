//not bandý
package hafta2_alistirma;

import java.util.Scanner;

public class NotBandi {
	public static void main (String[] args) {
		double notort;
		//3 yazýlý notu girdir not bandýný hesapla
		Scanner notlar = new Scanner(System.in);
		System.out.print("1.notunuzu giriniz: ");
		double not1 = notlar.nextDouble();
		
		System.out.print("\n 2.notunuzu giriniz: ");
		double not2 = notlar.nextDouble();
		
		System.out.print("\n 3.notunuzu giriniz: ");
		double not3 = notlar.nextDouble();
		
		notort = (not1 + not2 + not3)/3;
		
		System.out.println("not ortalamanýz: " + notort);
	}
}
