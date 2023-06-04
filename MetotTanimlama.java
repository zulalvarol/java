
package hafta3;

public class MetotTanimlama {
	public static void main (String[] args) {
		int a, b;
		
		System.out.print("Toplam sonuç: ");
		topla(5,10);
		
		System.out.println("sonuç: " + (toplamiDondur(100,150)));
	}
	static void topla(int s1, int s2) {
		System.out.println(s1 + s2);
	}
	static int toplamiDondur(int s1, int s2) {
		return (s1 + s2);
	}
}
