package fr.uge.cmdline1;

import java.util.ArrayList;
import java.util.List;

public class CmdLine1 {
	
	/*public static List<Argument> parseCmdLine(String... args) {
		ArrayList<Argument> list = new ArrayList<>();
		for(var i : args) {
			Argument a = new Argument(i);
			list.add(a);
		}
		return list;
	}*/
	
	public static List<Argument> parseCmdLine(String... args) {
		ArrayList<Argument> list = new ArrayList<>();
		for(var i : args) {
			Argument a = new Argument(i);
			list.add(a);
		}
		return list;
	}
	
    public static void main(String[] args) {
        var argument1 = new Argument("foo.txt");
        var argument2 = new Argument("bar.png");
        System.out.println(argument1);  // Argument{ text:'foo.txt' }
        System.out.println(argument2);  // Argument{ text:'bar.png' }
        
        List<Argument> arguments1 = parseCmdLine("foo.txt", "bar.png");
        System.out.println(arguments1);  // [Argument{ text:'foo.txt' }, Argument{ text:'bar.png' }]
        
        var option1 = new Option("--verbose", OptionInfo.VERBOSE);
        var option2 = new Option("-v", OptionInfo.VERBOSE);
        System.out.println(option1);  // Option{ text: '--verbose', info: VERBOSE }
        System.out.println(option2);  // Option{ text: '-v', info: VERBOSE }
      }
	
}
