// string metotlar

package hafta3;

public class StringMethodlar {
	public static void main(String[] args) {
		String metin = "Z�lal Mobil Programlama Dersinin 3. Haftas�nda.";
		
		System.out.println(metin.length());
		
		System.out.println(metin.indexOf("l"));
		
		System.out.println(metin.charAt(1));
		
		System.out.println(metin.toLowerCase());//metnin tam�m�n� k���k harfle yazar
		
		System.out.println(metin.toUpperCase());//metnin tam�m�n� b�y�k harfle yazar
		
		String yeniMetin = " merhaba d�nya ";
		System.out.println(yeniMetin.replace("d�nya", "Gelece�in Mobil Uygulama Geli�tiricileri"));
		
		// **** TRIM �NEML��� SINAVDA �IKARRRRR
		// trim --> stringlerin ba��nda ve sonundaki bo�luklar� siler
		
		System.out.println(yeniMetin);
		System.out.println(yeniMetin.trim());
		
		System.out.println(metin);
		System.out.println(metin.substring(12));
		System.out.println(metin.substring(12, 34)); //****ba�lang��tan indexinden ba�lar biti�i dahil etmez. (SINAVDA �IKAB�L�R)
		
		//Contains --> String i�erisinde arama yapmay� sa�lar. varsa true yoksa false d�ner
		//string i�lemlerinde b�y�k k���k harf duyarl�l��� vard�r
		
		metin = "Ba�ar�s�zl��a g�t�ren en b�y�k neden kendine g�venmemektir.";
		String metin2 = "Ba�ar�s�zl��a g�t�ren en B�y�k neden kendine g�venmemektir.";
		System.out.println(metin.contains("b�y�k"));
		System.out.println(metin2.contains("b�y�k"));
		
		//equals --> iki string ifadeyi kar��la�t�r�r ayn� ise true de�ilse false
		String sifre = "B�TE4";
		System.out.println(sifre.equals("B�TE"));
		System.out.println(sifre.equals("B�TE4"));
		
		//concat --> iki string ifadeyi birle�tirmek i�in
		String part_1 = "Marmara";
		String part_2 = "B�TE4";
		System.out.println(part_1.concat(part_2));
	}
}

/* ekran ��kt�s�
47
2
�
z�lal mobil programlama dersinin 3. haftas�nda.
Z�LAL MOB�L PROGRAMLAMA DERS�N�N 3. HAFTASINDA.
 merhaba Gelece�in Mobil Uygulama Geli�tiricileri 
 merhaba d�nya 
merhaba d�nya
Z�lal Mobil Programlama Dersinin 3. Haftas�nda.
Programlama Dersinin 3. Haftas�nda.
Programlama Dersinin 3
true
false
false
true
MarmaraB�TE4
 */
