// dairenin çevre ve alaný

package hafta2_alistirma;
import java.util.Scanner;


public class Daire_cevre_alan {
	public static void main (String[] args) {
		Scanner verioku = new Scanner (System.in);
		final double pi = 3.14159;
		
		System.out.println("Dairenin yarýçapýný giriniz: ");
		int yaricap = verioku.nextInt();
		
		System.out.println("Dairenin çevresi: " + (2*pi*yaricap));
		System.out.println("Dairenin alaný: " + (pi*yaricap*yaricap));
		/*
		int a=10;
		a=10;
		System.out.println("a nýn deðerini 1 artýr ve a nýn deðeri: " + (a--));
		System.out.println("a nýn deðerini 1 artýr ve a nýn deðeri: " + (a));
		a=10;
		System.out.println("a nýn deðerini 1 artýr ve a nýn deðeri: " + (--a));
		System.out.println("a nýn deðerini 1 artýr ve a nýn deðeri: " + (a)); 
		*/
	}
}
