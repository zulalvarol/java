//operators
package ders_hafta2;
import java.net.SocketTimeoutException;

public class Operators {
	public static void main(String[] args) {
		int a=10;
		int b=5;
		System.out.println("a: " + a + " " + "b: " + b); // a: 10 b: 5
		System.out.println("Toplama Operat�r�: " + (a+b)); // Toplama Operat�r�: 15
		System.out.println("��karma Operat�r�: " + (a-b)); // ��karma Operat�r�: 5
		System.out.println("�arpma Operat�r�: " + (a*b)); // �arpma Operat�r�: 50
		System.out.println("B�lme Operat�r�: " + (a/b)); // B�lme Operat�r�: 2
		
		System.out.println("a de�i�kenini a++ ile art�r�yoruz: "); // a de�i�kenini a++ ile art�r�yoruz: 
		a++; 
		System.out.println(a); //11
		
		System.out.println("a de�i�kenini ++a ile art�r�yoruz: "); // a de�i�kenini a++ ile art�r�yoruz: 
		++a;
		System.out.println(a); // 12
		
		System.out.println("a de�i�keninin 1 fazlas�: " + a); // a de�i�keninin 1 fazlas�: 12
		
		System.out.println("a de�i�kenini a-- ile 1 azalt�n. "); // a de�i�kenini a-- ile 1 azalt�n.
		a--;
		System.out.println(a); // 11
		}
}
