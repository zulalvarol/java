
import java.util.ArrayList;

import Araba.Araba;
public class Arraylist {

	public static void main(String[] args) {
	        // Creating an ArrayList of String
			ArrayList<String> animals = new ArrayList<>();
	 
	        // Adding new elements to the ArrayList
	        animals.add("Bird");
	        animals.add("Tiger");
	        animals.add("Cat");
	        animals.add("Dog");
	        System.out.println(animals);
	 
	        // Adding an element at a particular index in an ArrayList
	        animals.add(2, "Snake");
	 
	        System.out.println(animals);
	        
	        animals.remove(1);
	        
	        System.out.println("Remove an element : " + animals);
	        
	        
	       /* ArrayList<String> yeniliste = new ArrayList<String>();
	        yeniliste.add(21);
	        yeniliste.add("zülal");
	        yeniliste.add(23.7);*/
	        
	        ArrayList<Araba> liste = new ArrayList<>();
	        liste.add(new Araba(2015, "Fiat", "Beyaz"));
	        liste.add(new Araba(2009, "Ford", "Siyah"));
	        
	        Araba car = new Araba(2020, "Renault", "Gri");
	        liste.add(car);
	        System.out.println(liste);
	}

}
