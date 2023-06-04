import java.util.Scanner;

public class Dikdortgen_alan_cevre {
	public static void main (String[] main) {
		Scanner veriAl = new Scanner(System.in);
		
		int kisaKenar, uzunKenar;
		System.out.print("kisa kenari giriniz: ");
		kisaKenar = veriAl.nextInt();
		System.out.print("uzun kenari giriniz: ");
		uzunKenar = veriAl.nextInt();
		
		alanHesapla(kisaKenar, uzunKenar);
		
		System.out.println("çevre: " + cevreHesapla(kisaKenar, uzunKenar));
	}
	
	public static void alanHesapla(int a, int b) {
		System.out.println("alan: " + a*b);
	}
	
	public static int cevreHesapla (int a, int b) {
		return 2*(a+b);
	}

}
