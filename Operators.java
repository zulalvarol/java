//operators
package ders_hafta2;
import java.net.SocketTimeoutException;

public class Operators {
	public static void main(String[] args) {
		int a=10;
		int b=5;
		System.out.println("a: " + a + " " + "b: " + b); // a: 10 b: 5
		System.out.println("Toplama Operatörü: " + (a+b)); // Toplama Operatörü: 15
		System.out.println("Çýkarma Operatörü: " + (a-b)); // Çýkarma Operatörü: 5
		System.out.println("Çarpma Operatörü: " + (a*b)); // Çarpma Operatörü: 50
		System.out.println("Bölme Operatörü: " + (a/b)); // Bölme Operatörü: 2
		
		System.out.println("a deðiþkenini a++ ile artýrýyoruz: "); // a deðiþkenini a++ ile artýrýyoruz: 
		a++; 
		System.out.println(a); //11
		
		System.out.println("a deðiþkenini ++a ile artýrýyoruz: "); // a deðiþkenini a++ ile artýrýyoruz: 
		++a;
		System.out.println(a); // 12
		
		System.out.println("a deðiþkeninin 1 fazlasý: " + a); // a deðiþkeninin 1 fazlasý: 12
		
		System.out.println("a deðiþkenini a-- ile 1 azaltýn. "); // a deðiþkenini a-- ile 1 azaltýn.
		a--;
		System.out.println(a); // 11
		}
}
