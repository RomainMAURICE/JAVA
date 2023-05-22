

public final class Hotel implements Housing{
	private final int rooms;
	private final double efficiency;
	
	public Hotel(int rooms, double efficiency) {
		if(rooms < 0)
			new IllegalArgumentException();
		if(efficiency < 0 || efficiency > 1)
			throw new IllegalArgumentException();
		
		this.rooms = rooms;
		this.efficiency = efficiency;
	}
	
	@Override
	public String toString() {
		return	"hotel "+rooms+" rooms "+efficiency; 
	}
	
	@Override
	public double price() {
		return 100*rooms*efficiency;
	}
	
	@Override
	public double efficiency() {
		return efficiency;
	}
}
