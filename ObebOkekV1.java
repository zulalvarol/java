// obeb okek hocanýn yöntemi
package hafta3;

import java.util.Scanner;

public class ObebOkekV1 {
	public static void main (String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		int[] asalDizi = new int[1000];
		int[] sayiDizi = new int[3];
		int yedek;
		int ebob = 1;
		int ekok = 1;
		int SiraNo = 1;
		int i, j;
        
        System.out.print("1. Sayýyý giriniz: ");
        sayiDizi[0] = girdi.nextInt();
        System.out.print("2. Sayýyý giriniz: ");
        sayiDizi[1] = girdi.nextInt();
        System.out.print("3. Sayýyý giriniz: ");
        sayiDizi[2] = girdi.nextInt();
        
        for(i = 0; i <= 1 ; i++)
        {
            for (j = i; j<2; j++) {
            	if (sayiDizi[i] > sayiDizi [j]) {
            		yedek = sayiDizi[i];
            		sayiDizi[i] = sayiDizi[j];
            		sayiDizi[j] = yedek;
            	}
            }
        }
        System.out.print("\n");
        System.out.println("***********************");
        System.out.print("\n");
        
        int asalsira = 0;
        for (i = 2 ; i<= sayiDizi[2]; i++) {
        	if(asalmi(i) == true) {
        		asalDizi[asalsira] = i;
        		asalsira++;
        	}
        }
        
        for (int asal : asalDizi) {
        	if(asal != 0) {
        		while(sayiDizi[0] % asal == 0 || sayiDizi[1] % asal == 0 || sayiDizi[2] % asal == 0) {
        			System.out.print(solaHizala(Integer.toString(SiraNo) + ".", 15-basamakbul(SiraNo))
        							+ solaHizala(Integer.toString(sayiDizi[0]), 10-basamakbul(sayiDizi[0]))
        							+ solaHizala(Integer.toString(sayiDizi[1]), 10-basamakbul(sayiDizi[1]))
        							+ solaHizala(Integer.toString(sayiDizi[2]), 10-basamakbul(sayiDizi[2]))
        							+ solaHizala("|", 5)
        							+ solaHizala(Integer.toString(asal), 5));
        			//System.out.println();
        			
        			if (sayiDizi[0] % asal == 0 && sayiDizi[1] % asal == 0 && sayiDizi[2] % asal == 0 ) {
        				System.out.println(solaHizala("*", 5));
        				ebob = ebob * asal;
        			}
        			else {
        				System.out.println("\n");
        			}
        			
        			if(sayiDizi[0] % asal == 0) sayiDizi[0] = sayiDizi[0]/asal;
        			if(sayiDizi[1] % asal == 0) sayiDizi[1] = sayiDizi[1]/asal;
        			if(sayiDizi[2] % asal == 0) sayiDizi[2] = sayiDizi[2]/asal;
        			
        			SiraNo++;
        			ekok = ekok * asal;
        		}
        	}
        }
        
        System.out.println(solaHizala(Integer.toString(SiraNo) + ".", 15-basamakbul(SiraNo))
				+ solaHizala(Integer.toString(sayiDizi[0]), 10-basamakbul(sayiDizi[0]))
				+ solaHizala(Integer.toString(sayiDizi[1]), 10-basamakbul(sayiDizi[1]))
				+ solaHizala(Integer.toString(sayiDizi[2]), 10-basamakbul(sayiDizi[2])));

        
        System.out.println("Ebob: " + ebob);
        System.out.println("Ekok: " + ekok);
	}
	
	public static boolean asalmi(int sayi) {
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
	
	public static String solaHizala(String sayi, int karakterSayisi) {
		return String.format("%-" + karakterSayisi + "s", sayi);
	}
	
	public static int basamakbul(int sayi) {
		int sayac = 0;
		while(sayi>0) {
			sayi = sayi / 10;
			sayac++;
		}
		return sayac;
	}
}
