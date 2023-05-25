import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
	      /*var hotel = new Hotel(5, 0.75);
	      System.out.println(hotel);  // Hotel 5 rooms 0.75
	      
	      var apartment = new Apartment(30, List.of("Bony", "Clyde"));
	      System.out.println(apartment); // Apartment 30 m2 with Bony, Clyde 1.0
	       
	      var list = new ArrayList<String>();
	      list.add("Bob");
	      var apartment2 = new Apartment(50, list);
	      list.remove("Bob");//ne doit pas marcher -> liste immuable
	      System.out.println(apartment2);  // Apartment 50 m2 with Bob 0.5
	      */
	      var hotel3 = new Hotel(5 , 0.75);
	      var apartment3 = new Apartment(30, List.of("Bony", "Clyde"));
	      var manager = new AssetManager();
	      manager.add(hotel3);
	      manager.add(apartment3);
	      System.out.println(manager.profitPerNight());  // 415
	      System.out.println(manager); // affiche
	      // Hotel 5 rooms 0.75
	      // Apartment 30 m2 with Bony, Clyde 1.0
	      
	      System.out.println(manager.lowestEfficiency(0.8));  // [Hotel 5 rooms 0.75]	}
	      
	      manager.remove(0.8);
	      System.out.println(manager);  // affiche
	      // Apartment 30 m2 with Bony, Clyde 1.0
	}
}
