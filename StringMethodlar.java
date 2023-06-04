// string metotlar

package hafta3;

public class StringMethodlar {
	public static void main(String[] args) {
		String metin = "Zülal Mobil Programlama Dersinin 3. Haftasýnda.";
		
		System.out.println(metin.length());
		
		System.out.println(metin.indexOf("l"));
		
		System.out.println(metin.charAt(1));
		
		System.out.println(metin.toLowerCase());//metnin tamýmýný küçük harfle yazar
		
		System.out.println(metin.toUpperCase());//metnin tamýmýný büyük harfle yazar
		
		String yeniMetin = " merhaba dünya ";
		System.out.println(yeniMetin.replace("dünya", "Geleceðin Mobil Uygulama Geliþtiricileri"));
		
		// **** TRIM ÖNEMLÝÝÝ SINAVDA ÇIKARRRRR
		// trim --> stringlerin baþýnda ve sonundaki boþluklarý siler
		
		System.out.println(yeniMetin);
		System.out.println(yeniMetin.trim());
		
		System.out.println(metin);
		System.out.println(metin.substring(12));
		System.out.println(metin.substring(12, 34)); //****baþlangýçtan indexinden baþlar bitiþi dahil etmez. (SINAVDA ÇIKABÝLÝR)
		
		//Contains --> String içerisinde arama yapmayý saðlar. varsa true yoksa false döner
		//string iþlemlerinde büyük küçük harf duyarlýlýðý vardýr
		
		metin = "Baþarýsýzlýða götüren en büyük neden kendine güvenmemektir.";
		String metin2 = "Baþarýsýzlýða götüren en Büyük neden kendine güvenmemektir.";
		System.out.println(metin.contains("büyük"));
		System.out.println(metin2.contains("büyük"));
		
		//equals --> iki string ifadeyi karþýlaþtýrýr ayný ise true deðilse false
		String sifre = "BÖTE4";
		System.out.println(sifre.equals("BÖTE"));
		System.out.println(sifre.equals("BÖTE4"));
		
		//concat --> iki string ifadeyi birleþtirmek için
		String part_1 = "Marmara";
		String part_2 = "BÖTE4";
		System.out.println(part_1.concat(part_2));
	}
}

/* ekran çýktýsý
47
2
ü
zülal mobil programlama dersinin 3. haftasýnda.
ZÜLAL MOBÝL PROGRAMLAMA DERSÝNÝN 3. HAFTASINDA.
 merhaba Geleceðin Mobil Uygulama Geliþtiricileri 
 merhaba dünya 
merhaba dünya
Zülal Mobil Programlama Dersinin 3. Haftasýnda.
Programlama Dersinin 3. Haftasýnda.
Programlama Dersinin 3
true
false
false
true
MarmaraBÖTE4
 */
