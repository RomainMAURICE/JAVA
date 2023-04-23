
public sealed interface BinOp extends Expr permits Add, Sub, Mul {
	
    Expr left();
    Expr right();
    
    default int eval() {
    	
        int left = left().eval();
        int right = right().eval();
        
        switch(this.getClass().getSimpleName()) {
	        case "Add":
	            return left+right;
	        case "Mul":
	            return left*right;
	        case "Sub":
	            return left-right;
	        default:
	            throw new IllegalArgumentException();
        }

    }
}

