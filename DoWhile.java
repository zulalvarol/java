package hafta3;
import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
	Scanner girdi = new Scanner(System.in);
	String sifre = "";
	sifre = "B�TE4";
	int hak = 3;
	
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
		System.out.println("ba�ar�l� giri�");
	}
	
}
}
