
public record Value(int value) implements Expr{
	
	@Override
	public int eval() {
		return value;
	}
}
