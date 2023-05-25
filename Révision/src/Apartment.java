import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public record Apartment(int area, List<String> personnes) implements Housing{
	
	public Apartment {
		Objects.requireNonNull(List.copyOf(personnes));
		if(area<0)
			throw new IllegalArgumentException();
	}
	
	@Override
	public String toString() {		
		
		return personnes.stream().collect(Collectors.joining(", ","Apartment "+area+" m2 with "," "+efficiency()));
	
	}
	
	@Override
	public double price() {
		return 20*personnes.stream().count();
	}
	
	@Override
	public double efficiency() {
		if(personnes.stream().count()>=2)
			return 1.0;
		else 
			return 0.5;
	}
	
}
