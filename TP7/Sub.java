import java.util.Objects;

public record Sub(Expr left,Expr right) implements BinOp{
	public Sub{
		Objects.requireNonNull(left);
		Objects.requireNonNull(right);
	}
}
