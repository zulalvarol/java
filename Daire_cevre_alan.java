// dairenin �evre ve alan�

package hafta2_alistirma;
import java.util.Scanner;


public class Daire_cevre_alan {
	public static void main (String[] args) {
		Scanner verioku = new Scanner (System.in);
		final double pi = 3.14159;
		
		System.out.println("Dairenin yar��ap�n� giriniz: ");
		int yaricap = verioku.nextInt();
		
		System.out.println("Dairenin �evresi: " + (2*pi*yaricap));
		System.out.println("Dairenin alan�: " + (pi*yaricap*yaricap));
		/*
		int a=10;
		a=10;
		System.out.println("a n�n de�erini 1 art�r ve a n�n de�eri: " + (a--));
		System.out.println("a n�n de�erini 1 art�r ve a n�n de�eri: " + (a));
		a=10;
		System.out.println("a n�n de�erini 1 art�r ve a n�n de�eri: " + (--a));
		System.out.println("a n�n de�erini 1 art�r ve a n�n de�eri: " + (a)); 
		*/
	}
}
