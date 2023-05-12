import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Streams {
	
  public record Person(String name, int age) {}

  public static List<String> namesOfTheAdults(List<Person> persons) {
	Objects.requireNonNull(persons, "agrmuent non valide");
	      
    return persons.stream()
    		.filter(p -> p.age()>18)
    		.map(p -> p.name)
    		.toList();
  }

  public static void main(String[] args) {
    var persons = List.of(
        new Person("Ana", 21),
        new Person("John", 17),
        new Person("Liv", 29));
    var names = namesOfTheAdults(persons);
    System.out.println(names);
    
    
    
    var hotel = new Hotel("paradisio", List.of(
            new Room("blue", 100, 100),
            new Room("yellow", 110, 200),
            new Room("fuchsia", 120, 300),
            new Room("red", 100, 200),
            new Room("green", 100, 200)
            ));
    System.out.println(hotel);
    System.out.println(hotel.roomInfo());  // blue, yellow, fuchsia, red, green
    System.out.println(hotel.roomInfoSortedByFloor());  // blue, red, green, yellow, fuchsia
  }
  
  
}
