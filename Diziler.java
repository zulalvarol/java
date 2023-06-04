//diziler
package ders_hafta2;

public class Diziler {
	public static void main (String[] args) {
		String[] iller = new String [6];
		iller[0] = "Kýrklareli";
		iller[1] = "Trabzon";
		iller[2] = "Edirne";
		iller[3] = "Çanakkale";
		iller[4] = "Ýstanbul";
		
		
		System.out.println("Dizinin birinci elemaný: "+iller[0]);
		System.out.println("Dizinin ikinci elemaný: "+iller[1]);
		System.out.println("Dizinin üçüncü elemaný: "+iller[2]);
		System.out.println("Dizinin dördüncü elemaný: "+iller[3]);
		System.out.println("Dizinin beþinci elemaný: "+iller[4]);
		
		iller[4] = "Osmaniye";
		System.out.println("Dizinin birinci elemaný: "+iller[0]);
		
		String[] ilceler = {"Babaeski", "Kofçaz", "Dereköy", "Vize", "Lüleburgaz"};
	}

}
