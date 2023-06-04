package hafta3;
import java.util.Scanner;

public class ObebOkek {
	public static void main (String[] args) {
		Scanner okunan = new Scanner(System.in);
		
		int[] asallar = new int[1000];
		int[] sayilar = new int[3];
		int depo;
		int obeb = 1;
		int okek = 1;
		int i, j;
        
        System.out.print("1. Sayýyý giriniz: ");
        sayilar[0] = okunan.nextInt();
        System.out.print("2. Sayýyý giriniz: ");
        sayilar[1] = okunan.nextInt();
        System.out.print("3. Sayýyý giriniz: ");
        sayilar[2] = okunan.nextInt();
        
        for(i = 0; i <= 1 ; i++){
            for (j = i; j<2; j++){
            	if (sayilar[i] > sayilar [j]){
            		depo = sayilar[i];
            		sayilar[i] = sayilar[j];
            		sayilar[j] = depo;
            	}
            }
        }
        System.out.println();
        int asalsira = 0;
        for (i = 2 ; i<= sayilar[2]; i++) {
        	if(asalkontrol(i) == true) {
        		asallar[asalsira] = i;
        		asalsira++;
        	}
        }
        
        for (int asal : asallar) {
        	if(asal != 0) {
        		while(sayilar[0] % asal == 0 || sayilar[1] % asal == 0 || sayilar[2] % asal == 0) {
        			System.out.print((sayilar[0] + "\t")
        							+ (sayilar[1] + "\t")
        							+ (sayilar[2] + "\t")
        							+ ("|")
        							+ (asal));
        			System.out.println();
        			
        			if (sayilar[0] % asal == 0 && sayilar[1] % asal == 0 && sayilar[2] % asal == 0 ) {
        				obeb = obeb * asal;
        			}
        			if(sayilar[0] % asal == 0) sayilar[0] = sayilar[0]/asal;
        			if(sayilar[1] % asal == 0) sayilar[1] = sayilar[1]/asal;
        			if(sayilar[2] % asal == 0) sayilar[2] = sayilar[2]/asal;
        			okek = okek * asal;
        		}
        	}
        }
        
        System.out.print((sayilar[0] + "\t")
				+ (sayilar[1] + "\t")
				+ (sayilar[2] + "\t"));
        
        System.out.println("\n");
        System.out.println("Obeb: " + obeb);
        System.out.println("Okek: " + okek);
	}
	
	public static boolean asalkontrol(int sayi) {
		boolean kontrol = true;
		if (sayi == 2)
			return true;
		else {
			for (int i = 2; i<sayi; i++) {
				if(sayi%i == 0) {
					return false;
				}
			}
			return true;
		}
	}
	
}