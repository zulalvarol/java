//diziler
package ders_hafta2;

public class Diziler {
	public static void main (String[] args) {
		String[] iller = new String [6];
		iller[0] = "K�rklareli";
		iller[1] = "Trabzon";
		iller[2] = "Edirne";
		iller[3] = "�anakkale";
		iller[4] = "�stanbul";
		
		
		System.out.println("Dizinin birinci eleman�: "+iller[0]);
		System.out.println("Dizinin ikinci eleman�: "+iller[1]);
		System.out.println("Dizinin ���nc� eleman�: "+iller[2]);
		System.out.println("Dizinin d�rd�nc� eleman�: "+iller[3]);
		System.out.println("Dizinin be�inci eleman�: "+iller[4]);
		
		iller[4] = "Osmaniye";
		System.out.println("Dizinin birinci eleman�: "+iller[0]);
		
		String[] ilceler = {"Babaeski", "Kof�az", "Derek�y", "Vize", "L�leburgaz"};
	}

}
