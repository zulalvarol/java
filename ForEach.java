package hafta3;

import java.util.Scanner;

public class ForEach {
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		String sifre = "";
		sifre = "B�TE4";
		int hak = 3;
		String[] dersler = {"Bilgisayar", "Matematik", "Yapay Zeka", "Arduino", "Robotik"};
		
		do {
			System.out.println("�ifre giriniz: ");
			sifre = girdi.nextLine();
			
			
			if(sifre.equals("B�TE4")) {
				break;
			}
			hak--;
		} 
		while(hak!=0);
		if(hak == 0) {
			System.out.println("kart�n�z bloke oldu");
		}
		else {
			System.out.println("G�R�� BA�ARILI");
			for (String oge : dersler) {
				System.out.println(oge);
			}
		}
		
	}
}
