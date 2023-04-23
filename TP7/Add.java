import java.util.Objects;

public record Add(Expr left,Expr right) implements BinOp{
	public Add{
		Objects.requireNonNull(left);
		Objects.requireNonNull(right);
	}

}
