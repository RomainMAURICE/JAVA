package fr.uge.cmdline1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class CmdLine1 {
	
	/*public static List<Argument> parseCmdLine(String... args) {
		ArrayList<Argument> list = new ArrayList<>();
		for(var i : args) {
			Argument a = new Argument(i);
			list.add(a);
		}
		return list;
	}*/
	
	public static OptionInfo asOptionInfo(String arg) {
		Objects.requireNonNull(arg);
		switch (arg) {
		case "-v":
			return OptionInfo.VERBOSE;
		case "--verbose":
			return OptionInfo.VERBOSE;
		case "-a":
			return OptionInfo.ALL;
		case "--all":
			return OptionInfo.ALL;
		default:
			return null;
		}
	}
	
	public static List<Argument> parseCmdLine(String... args) {
		Objects.requireNonNull(args);
		ArrayList<Argument> list = new ArrayList<>();
		for(var i : args) {
			if(asOptionInfo(i)!=null) {
				Option option = new Option(i, asOptionInfo(i));
				list.add(option);
			}
			else {
				Argument a = new Argument(i);
				list.add(a);
			}
		}
		return list;
	}
	
	/*public static boolean checkCmdLine(List<Argument> args) {
		//throw new IllegalArgumentException();
		Set<Argument> set = new HashSet<>();
		for(var i : args) {
			set.add(i);
		}
		return true;
	}*/
	
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
        
        var arguments2 = parseCmdLine("-v", "bar.png");
        System.out.println(arguments2);  // [Option{ text: '-v', info: VERBOSE }, Argument{ text:'bar.png' }]
        
        //var arguments3 = parseCmdLine("-v", "bar.png", "--verbose");
        //checkCmdLine(arguments3);  // java.lang.IllegalArgumentException: duplicate argument Option{ text: '--verbose', info: VERBOSE }
      }
	
}
