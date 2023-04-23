import java.util.Objects;

public record Mul(Expr left,Expr right) implements BinOp{
	public Mul{
		Objects.requireNonNull(left);
		Objects.requireNonNull(right);
	}
	

}
