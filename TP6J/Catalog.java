package blockbuster;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Catalog {
	private final Map<String, Article> articles;
	public Catalog() {
		articles = new HashMap<>();
	}
	
	public void add(Article article) {
		if(lookup(article.name())==null)
			articles.put(article.name(), article);
		else throw new IllegalStateException("ce film est déjà dans la liste");

	}
	
	public Article lookup(String name) {
		return articles.get(name);
	}
	
	
	public void save(Path path) throws IOException {
	    save(path, Charset.defaultCharset());
	}

	public void save(Path path, Charset charset) throws IOException {
	    if (!Files.exists(path)) {
	        Files.createFile(path);
	    }
	    try (var writer = Files.newBufferedWriter(path, charset)) {
	        for (var line : this.articles.values()) {
	            writer.write(line.toText());
	            writer.newLine();
	        }
	        writer.close();
	    }
	}
	
	
	public void load(Path path) throws IOException {
	    load(path, Charset.defaultCharset());
	}
	
	public void load(Path path, Charset charset) throws IOException {
		try(var reader = Files.newBufferedReader(path, charset)) {			
			String line;
			while ((line = reader.readLine()) != null) {
				String[] parse = line.split(":");
								
				System.out.println(parse[0]);
				if(parse[0].equals("LaserDisc")) {
					LaserDisc laserDisc = new LaserDisc(parse[1]);
					articles.put(laserDisc.name(),laserDisc);
				}
				
				if(parse[0].equals("VideoTape")) {
					VideoTape videoTape = new VideoTape(parse[1],Duration.ofMinutes(Long.parseLong(parse[2])));
					articles.put(videoTape.name(),videoTape);
				}
				
			}
			reader.close();
		}
	}
	


		
}
