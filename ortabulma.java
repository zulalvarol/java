import java.util.Scanner;
public class ortabulma {
	public static void main(String[] args) {
		
		Scanner giris = new Scanner(System.in);	
		float adet, sayi1, sayi2, orta;
		System.out.print("Baþlangýç sayýsýný giriniz: ");
		int bas = giris.nextInt();
		System.out.print("Bitiþ sayýsýný giriniz: ");
		int son = giris.nextInt();
		adet = (son-bas)-1;
		//System.out.print(adet);
		if (adet%2==0) {
			sayi1 = bas+(adet/2);
			sayi2 = sayi1+1;
			orta = (sayi1+sayi2)/2;
			System.out.println("Ortadaki Sayý = "+orta);
		}else {
			orta = bas+(adet/2);
			System.out.println("Ortadaki Sayý = "+orta);	
		}
	}
}
