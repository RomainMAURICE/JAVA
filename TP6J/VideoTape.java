package blockbuster;
import java.time.Duration;
import java.util.Objects;

public record VideoTape(String name, Duration duration) implements Article {
	public VideoTape{
		Objects.requireNonNull(name, "name is null");
		Objects.requireNonNull(duration, "duration is null");
	}
}
