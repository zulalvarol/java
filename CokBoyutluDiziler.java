package hafta3;

public class CokBoyutluDiziler {
	public static void main(String[] args) {
		String[][] iller = new String [11][3];
		
		iller[0][0] = "Ýl Adý\t";
		iller[0][1] = "Ýl Kodu\t";
		iller[0][2] = "Telefon Kodu";
		
		iller[1][0] = "Adana\t";
		iller[1][1] = "01\t";
		iller[1][2] = "101";
		
		iller[2][0] = "Adýyaman\t";
		iller[2][1] = "02\t";
		iller[2][2] = "102\t";
		
		iller[3][0] = "Ýstanbul-Av\t";
		iller[3][1] = "34\t";
		iller[3][2] = "212\t";
		
		iller[4][0] = "Ýstanbul-An\t";
		iller[4][1] = "34\t";
		iller[4][2] = "216";
		
		iller[5][0] = "Ýzmir\t";
		iller[5][1] = "35\t";
		iller[5][2] = "218";
		
		System.out.println(iller[0][0] + iller[0][1] + iller[0][2]);
		System.out.println(iller[1][0] + iller[1][1] + iller[1][2]);
		System.out.println(iller[2][0] + iller[2][1] + iller[2][2]);
		System.out.println(iller[3][0] + iller[3][1] + iller[3][2]);
		System.out.println(iller[4][0] + iller[4][1] + iller[4][2]);
		System.out.println(iller[5][0] + iller[5][1] + iller[5][2]);
	}
}
