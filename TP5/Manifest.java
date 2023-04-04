package fr.uge.manifest;

import java.util.ArrayList;
import java.util.Iterator;

public class Manifest {
	private ArrayList<OnCargo> onCargo;
	
	public Manifest() {
		onCargo = new ArrayList<>();
	}
	
		
	public void add(Container container) {
		onCargo.add(container);
	}
	
	public void add(Passenger passenger) {
		onCargo.add(passenger);
	}

	public int weight() {
		int total=0;
		for(var i : onCargo) {
			total=total+i.weight();
		}
		
		return total;
	}
	
	
	public void removeAllContainerFrom(String destination) {
		Iterator<OnCargo> iterator = onCargo.iterator();
			while(iterator.hasNext()) {
				OnCargo onCargo = iterator.next();
				if(onCargo.destination().equals(destination) && onCargo.isContainer()) {
					iterator.remove();
				}
			}
	}
	
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		int i=1;
		for(var onCargo : onCargo) {
			stringBuilder.append(i)
			  .append(". ")
			  .append(onCargo)
			  .append("\n");
			  i++;
		}
		return stringBuilder.toString();
	}
}
