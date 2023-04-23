import java.util.Iterator;

public sealed interface Expr permits Value, BinOp {
	
	public abstract int eval();
		    
    public static Expr parse(Iterator<String> iterator) {
    	var op = iterator.next();
    	
    	switch (op) {
			case "+": {
				return new Add(parse(iterator),parse(iterator));
			}
			case "-": {
				return new Sub(parse(iterator),parse(iterator));
			}
			case "*": {
				return new Mul(parse(iterator),parse(iterator));
			}
			default:
				return new Value(Integer.parseInt(op));
		}
    }
    
    
}
