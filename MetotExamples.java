package hafta3;

import java.util.Scanner;

public class MetotExamples {
	public static void main (String[] args) {
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("dikdortgenin kisa kenarini giriniz: ");
		int kisakenar = girdi.nextInt();
		
		System.out.println("dikdortgenin uzun kenarini giriniz: ");
		int uzunkenar = girdi.nextInt();
		
		cevreHesapla(kisakenar,uzunkenar);
		alanHesapla(kisakenar,uzunkenar);
	}
	static void cevreHesapla(int kisakenar, int uzunkenar) {
		System.out.println("dikdortgenin �evresi: " + (2*(kisakenar+uzunkenar)));
	}
	
	static void alanHesapla(int kisakenar, int uzunkenar) {
		System.out.println("dikdortgenin alan�: " + (kisakenar*uzunkenar));
	}
}
