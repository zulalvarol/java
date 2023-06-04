package hafta3;

import java.util.Scanner;

public class MetotBuyukKucuk {
	public static void main (String[] args) {
		Scanner sayi = new Scanner(System.in);
		System.out.println("ilk sayiyi giriniz: ");
		int s1 = sayi.nextInt();
		
		System.out.println("ikinci sayiyi giriniz: ");
		int s2 = sayi.nextInt();
		
		if(buyukBul(s1,s2)== 0) {
			System.out.println("sayılar eşit");
		}
		else {
			System.out.println("büyük sayı: " + buyukBul(s1,s2));
		}
		
		//System.out.println("sonuç: " + (buyukBul(s1,s2)));
	}
	static int buyukBul(int s1, int s2) {
		if (s1>s2) {
			return s1;
		}
		else if (s2>s1) {
			return s2;
		}
		else {
			return 0;
		}
	}
}
