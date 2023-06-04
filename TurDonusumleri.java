// tür dönüþümleri
package hafta2_alistirma;
class TurDonusumleri {
	// int --> String Dönüþümü
	public static void main (String[] args) {
		System.out.println("int --> String dönüþümü");
		System.out.println("-----------------------");
		
		int sayi = 25;
		String i1 = String.valueOf(sayi);
		String i2 = "" + sayi;
		String i3 = Integer.toString(sayi);
		
		System.out.println("s1 degeri: " + i1 + " "
							+ "\ns2 degeri: " + i2 + " "
							+ "\ns3 degeri: " + i3);
		System.out.println("\n");
		
	// String --> int Dönüþümüz
		System.out.println("String --> int dönüþümü");
		System.out.println("-----------------------");
		
		float fsayi = 4.04f;
		double dsayi = 5.20;
		
		String s1 = String.valueOf(fsayi);
		String s2 = "" + fsayi;
		String s3 = Float.toString(fsayi);
		String s4 = Double.toString(dsayi);
		
		System.out.println("s1: " + s1 +
							"\ns2: " + s2 + 
							"\ns3: " + s3 +
							"\ns4: " + s4);
		System.out.println("\n");
		
		System.out.println("String --> double/float dönüþümü");
		System.out.println("--------------------------------");
		
		String ys1 = "5.2645";
		float fs1 = Float.valueOf(ys1);
		float fs2 = Float.parseFloat(ys1);
		
		double ds1 = Double.valueOf(ys1);
		double ds2 = Double.parseDouble(ys1);
		
		System.out.println("fs1: " + fs1 + " " +
							"\nfs2: " + fs2 + " " + 
							"\nds1: " + ds1 + " " +
							"\nds2: " + ds2 );
		String intDeger = "15";
		int sonuc = Integer.parseInt(intDeger);
		System.out.print(sonuc);
	}

}
