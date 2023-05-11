import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public class Lambdas {

	public Lambdas() {
		
	}
	
	
	public static void upperCaseAll(ArrayList<String> list){
		Objects.requireNonNull(list);
		list.replaceAll(e->e.toUpperCase(Locale.ROOT));
	}
	

	public static HashMap<String,Integer> occurences(List<String> list){
		Objects.requireNonNull(list);
		HashMap<String,Integer> hashMap = new HashMap<>();
		
		list.forEach(str -> hashMap.merge(str, 1, Integer::sum));
		return hashMap;
	}
	

	public static HashMap<String,List<Actor>> actorGroupByFirstName(ArrayList<Actor> list) {
		HashMap<String, List<Actor>> map = new HashMap<>();
		for(var i : list) {
			map.computeIfAbsent(i.firstName(), k -> new ArrayList<>()).add(i);
		}
		return map;
	}
	
	
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		upperCaseAll(list);
		System.out.println(list);
        
        List<String> strings = Arrays.asList("foo", "bar", "foo", "foo", "bob");
        Map<String, Integer> o = occurences(strings);
        System.out.println(o);
        
        Actor actor1 = new Actor("bob", "bil");
        Actor actor2 = new Actor("will", "bil");
        Actor actor3 = new Actor("bob", "dylan");

        
		ArrayList<Actor> list2 = new ArrayList<>();
		list2.add(actor1);
		list2.add(actor2);
		list2.add(actor3);

		HashMap<String,List<Actor>> actorMap = new HashMap<>();
		actorMap = actorGroupByFirstName(list2);
		System.out.println(actorMap);
	}
}
