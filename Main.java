// emlak main
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		
		// Klasik dizi tanımlama ve veri girişi.
		String[] dizi = new String[6];
		dizi[0]="sıfır";
		dizi[1]="bir";
		dizi[2]="iki";
		dizi[3]="üç";
		dizi[4]="dört";
		dizi[5]="beş";
		
		//1.tip list �rne�i
		
		System.out.println("---------Array List------------");
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("İstanbul");
		arrayList.add("Ankara");
		arrayList.add("İzmir");
		/// ... bu �ekilde istedi�imiz kadr ekleyebilirz...
		
		for(String eleman : arrayList) {
			System.out.println(eleman);
		}
		System.out.println("--------------------------------------------");
		// Arraylist içerisindeki tüm elemanları silmek istersek....
		arrayList.clear();
		
		System.out.println("Arraylist silindi...");
		
		for(String eleman : arrayList) {
			System.out.println(eleman);
		}
		
		// yukarıdaki for ecah �al��maz ��nk� i�inde item yani eleman yok....
		
		arrayList.add("İstanbul");
		arrayList.add("Ankara");
		arrayList.add("İzmir");
		arrayList.add("Bursa");
		arrayList.add("Adana");
		
		System.out.println("Arraylist dizisinin eleman sayısı: " + arrayList.size());
		
		System.out.println(arrayList.get(3));
		
		// Not: ArayList yapısında sadece String veya int türünde veri tipi tanımlamak zorunda değiliz....
		
		ArrayList<Emlak> arrayListEmlak = new ArrayList<>();
		arrayListEmlak.add(new Emlak("Daire", "3+1", "Merkezi", "5", "Kiralık", 5000));
		arrayListEmlak.add(new Emlak("Müstakil", "2+1", "Soba", "1", "Satılık", 500000));
		arrayListEmlak.add(new Emlak("Yalı", "5+1", "Kalorifer", "1", "Kiralık", 30000));
		
		for(Emlak emlak : arrayListEmlak) {
			System.out.println("--------------------------");
			emlak.bilgileriGoster();
		}
		
		// Not: ArrayList içerisinde her türlü veriyi saklamak mümkün
		
		System.out.println("---------HashSet Array List------------");
		HashSet<String> hashSet = new HashSet<>(); // Mükerrer kayıt girişini engeller...
		hashSet.add("İstanbul");
		hashSet.add("Ankara");
		hashSet.add("İzmir");
		hashSet.add("Bursa");
		hashSet.add("Adana");
		hashSet.add("Adanaa");
		hashSet.add("");hashSet.add("");hashSet.add("1");
		System.out.println("HashSet Dizi Listesinin Eleman Sayısı: " + hashSet.size());
		for(String eleman : hashSet) {
			System.out.println(eleman);
		}
		
		hashSet.clear();
		
		System.out.println("---------HashMap Array List------------");
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("01", "Adana");
		hashMap.put("02", "Adıyaman");
		hashMap.put("03", "Afyonkarahisar");
		hashMap.put("45", "Ağrı");
		hashMap.put("05", "Amasya");
		hashMap.put("06", "Ankara");
		hashMap.put("07", "Antalya");
		hashMap.put("08", "Artvin");
		hashMap.put("09", "Aydın");
		hashMap.put("10", "Balıkesir");
		hashMap.put("1","Balıkesiree");
		hashMap.put("","hh");
		hashMap.put("","gg");
		hashMap.put("","");
		hashMap.put("","gfe");
		
		for(String value : hashMap.values()) {
			System.out.println(value);
		}
		
		for(String key : hashMap.keySet()) {
			System.out.println(key);
		}
		
		System.out.println(hashMap.get("01"));

	}
}
/*
---------Array List------------
İstanbul
Ankara
İzmir
--------------------------------------------
Arraylist silindi...
Arraylist dizisinin eleman sayısı: 5
Bursa
--------------------------
Emlak Türü: Daire
Oda Yapısı: 3+1
Isınma Türü: Merkezi
Kat: 5
Emlak Durumu: Kiralık
Fiyat: 5000
--------------------------
Emlak Türü: Müstakil
Oda Yapısı: 2+1
Isınma Türü: Soba
Kat: 1
Emlak Durumu: Satılık
Fiyat: 500000
--------------------------
Emlak Türü: Yalı
Oda Yapısı: 5+1
Isınma Türü: Kalorifer
Kat: 1
Emlak Durumu: Kiralık
Fiyat: 30000
---------HashSet Array List------------
HashSet Dizi Listesinin Eleman Sayısı: 5
Adana
İstanbul
Bursa
Ankara
İzmir
---------HashMap Array List------------
Adana
Adıyaman
Afyonkarahisar
Ağrı
Amasya
Ankara
Antalya
Artvin
Aydın
Balıkesir
01
02
03
04
05
06
07
08
09
10
Adana
*/
