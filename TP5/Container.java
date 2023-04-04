package fr.uge.manifest;
import java.util.Objects;

public record Container(String destination, int weight) implements OnCargo{

	public Container{
		Objects.requireNonNull(destination, "destinaion is null");
		if(weight<0) {
			throw new IllegalArgumentException("le poid doit être positif");
		}
	}
	
	@Override
	public int price() {
		return this.weight*2;
	}
	
	@Override
	public boolean isContainer() {
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(destination)
			.append(" ")
			.append(weight)
		    .append("kg");
		return stringBuilder.toString();
	}

}
