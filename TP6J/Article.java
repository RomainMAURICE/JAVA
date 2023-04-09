package blockbuster;

import java.time.Duration;

public interface Article {
	public abstract String name();
	public abstract Duration duration();
	
	public static final String LASERDISC_STRING = "LaserDisc";
	public static final String VIDEOTAPE_STRING = "VideoTape";
	
	public default String toText() {		
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.getClass().getSimpleName())
		.append(":")
		.append(this.name());
		
		if (this.duration() != null) {
			sb.append(":")
			.append(this.duration().toMinutes());
		}
		return sb.toString();
	}		
		
	public static Article fromText(String text){
		var parse = text.split(":");
		if(parse[0].equals(VIDEOTAPE_STRING)){
			VideoTape videoTape = new VideoTape(parse[1], Duration.ofMinutes(Long.parseLong(parse[2])));
			return videoTape;
		}
		if(parse[0].equals(LASERDISC_STRING)) {
			LaserDisc laserDisc = new LaserDisc(parse[1]);
			return laserDisc;
		}
		throw new IllegalStateException("le paramètre n'est pas accepté");
	}
	

	
}
	
	