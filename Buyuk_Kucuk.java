//büyük küçük
package hafta2_alistirma;
import java.util.Scanner;

public class Buyuk_Kucuk {
	public static void main (String[] args) {
		Scanner sayi = new Scanner (System.in);
		System.out.println("ilk sayiyi giriniz: ");
		double s1 = sayi.nextDouble();
		
		System.out.println("ikinci sayiyi giriniz: ");
		double s2 = sayi.nextDouble();
		
		if (s1>s2) {
			System.out.println("büyük olan sayi: " + s1);
		}
		if (s2>s1) {
			System.out.println("büyük olan sayi: " + s2);
		}
	}
}
