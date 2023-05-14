import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public record Hotel(String name, List<Room> rooms) {
	public Hotel {
		Objects.requireNonNull(name);
		Objects.requireNonNull(rooms);
	}
	
	public String roomInfo() {
		return rooms.stream()
				.map(r -> r.name())
				.collect(Collectors.joining(", "));
	}
	//fonction moyenne. return result.orElse()double.NAN;
	
	public String roomInfoSortedByFloor() {
		return rooms.stream()
				.sorted(Comparator.comparingInt(Room::floor))
				.map(Room::name)
				.collect(Collectors.joining(", "));				
	}
	
	public double averagePrice() {		
		return rooms.stream()
				.mapToLong(Room::price)
				.average()
				.orElse(Double.NaN);
	}
	
	public Optional<Room> roomForPrice1(double prix){
		Objects.requireNonNull(prix, "agrmuent non valide");

		return rooms.stream()
				.filter(r -> r.price()<prix)
				//.sorted(Comparator.comparingLong(Room::price))//trie le flux
				.max(Comparator.comparing(Room::price));//renvoie un élément		
	}
	
	public Optional<Room> roomForPrice2(double prix){
		Objects.requireNonNull(prix, "agrmuent non valide");

		return rooms.stream()
				.filter(r -> r.price()<prix)
				.max(Comparator.comparing(Room::price));//renvoie un élément		
	}
	
	public List<String> expensiveRoomNames(List<Hotel> hotels){
		Objects.requireNonNull(hotels, "agrmuent non valide");

        return hotels.stream()
        		.flatMap(h -> h.rooms.stream()
        				.sorted(Comparator.comparingDouble(Room::price).reversed())
        				.limit(2))
        		.map(Room::name)
        		.collect(Collectors.toList());
	}
	
	public Map<Integer, List<Room>> roomInfoGroupedByFloor(){
		return rooms.stream()
				.collect(Collectors.groupingBy(Room::floor));
	}
	
	public Map<Integer, List<Room>> roomInfoGroupedByFloorInOrder(){
		return rooms.stream()
				.collect(Collectors.groupingBy(Room::floor, TreeMap::new, Collectors.toList()));
	}

}
