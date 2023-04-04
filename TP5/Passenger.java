package fr.uge.manifest;

public record Passenger(String destination) implements OnCargo{
	public Passenger{}
	
	@Override
	public int price() {
		return 10;
	}
	
	@Override
	public int weight() {
		return 0;
	}
	
	@Override
	public boolean isContainer() {
		return false;
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(destination);
		stringBuilder.append(" (passenger)");
		return stringBuilder.toString();
	}
}
