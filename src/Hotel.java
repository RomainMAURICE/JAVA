import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.print.attribute.standard.Chromaticity;

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
	
	public int averagePrice() {
		return rooms.stream()
	}
}
