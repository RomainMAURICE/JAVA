import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
	    Expr expression = new Add(new Value(2), new Value(3));
	    Expr expression2 = new Sub(new Mul(new Value(2), new Value(3)), new Value(4));      
	    System.out.println(expression.eval());
	    System.out.println(expression2.eval());

	    		
	    Scanner scanner = new Scanner("- + 2 3 4");
	    Scanner scanner2 = new Scanner("- + 2 3 4");
	    List<String> list = new ArrayList<>();
	    list.add("-");
	    list.add("+");
	    list.add("2");
	    list.add("3");
	    list.add("4");
	    
	    var test = Expr.parse(scanner);
	    var test2 = Expr.parse(scanner2).eval();
	    var test3 = Expr.parse(list.iterator()).eval();
	    
	    System.out.println(test);
	    System.out.println(test2);
	    System.out.println(test3);

	}
}
