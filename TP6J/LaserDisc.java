package blockbuster;
import java.time.Duration;
import java.util.Objects;

public record LaserDisc(String name) implements Article{
	public LaserDisc{
		Objects.requireNonNull(name, "name is null");
	}
	@Override
	public Duration duration() {
		return null;
	}
}
