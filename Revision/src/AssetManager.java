import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AssetManager {
	
	private ArrayList<Housing> list;
	
	public AssetManager() {
		this.list = new ArrayList<>();
	}
		
	public void add(Housing housing) {
		Objects.requireNonNull(housing);
		list.add(housing);
	}
	
	public double profitPerNight() {
		return list.stream()
				.mapToDouble(i->i.price())
				.sum();
	}
	
	public List<Housing> lowestEfficiency(double value){
		return list.stream().filter(i->i)
	}
	
	/*@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(var i : list) {
			sb.append(i.toString());
			sb.append("\n");
		}
		return sb.toString();
	}*/
	
	@Override
	public String toString() {
		return list.stream().map(i->i.toString()).collect(Collectors.joining("\n"));
	}
	
}
