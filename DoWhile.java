package hafta3;
import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
	Scanner girdi = new Scanner(System.in);
	String sifre = "";
	sifre = "BÖTE4";
	int hak = 3;
	
	do {
		System.out.println("Þifre giriniz: ");
		sifre = girdi.nextLine();
		
		
		if(sifre.equals("BÖTE4")) {
			break;
		}
		hak--;
	} 
	while(hak!=0);
	if(hak == 0) {
		System.out.println("kartýnýz bloke oldu");
	}
	else {
		System.out.println("baþarýlý giriþ");
	}
	
}
}
