package hafta2_alistirma;
import java.util.Scanner;

public class Iki_aralikta_asallar {
	public static void main (String[] args) {
		Scanner girdi = new Scanner(System.in);
		System.out.println("baslangic degerini giriniz: ");
		int bas = girdi.nextInt();
		
		System.out.println("bitis degerini giriniz: ");
		int bit = girdi.nextInt();
		
		int i, bolen, asal;
		
		for(i=bas+1; i<bit; i++) {
			asal = 1;
			for(bolen=2; bolen<i/2; bolen++) {
				if(i % bolen == 0) {
					asal = 0;
					break;
				}
			}
			
			if (asal == 1 && i>=2) {
				System.out.println(i);
			}
		}
	}
}
