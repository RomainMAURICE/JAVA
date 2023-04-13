```java
public record Voiture(String modele, int imatriculation) implements Vehicule{
  public Voiture{
    Objects.requireNonNull(modele, "modele is null");
    Objects.requireNonNull(imatriculation, "imatriculation is null");
  }
}
```
.
```java
public class Garage{
  private String nom;
  private ArraysList<Vehicule> vehicules;
  
  public Garage(){
    Objects.requireNonNull(nom, "nom is null");
    this.nom=nom;
    vehicules = new ArrayList<>();
  }
  
  public void add(Vehicule vehicule){
    vehicules.add(vehicule);
  }
  
  @Override
  public String toString(){
    StringBuilder sb = new StringBuilder()
    for(var i : vehicules){
      sb.append(i).append("\n");
    }
    return sb.toString()
  }
}
```
.
```java
public interface Vehicule(){
  public abstract String nom():
}
```
.


```java
  throw new IllegalArgumentException("oui n'existe pas");
```



```java
throw new illegarargumentexecption();

	public void removeAllContainerFrom(String destination) {
		Iterator<OnCargo> iterator = onCargo.iterator();
			while(iterator.hasNext()) {
				OnCargo onCargo = iterator.next();
				if(onCargo.destination().equals(destination) && onCargo.isContainer()) {
					iterator.remove();
				}
			}
	}
	
		public void save(Path path) throws IOException {
			if(!Files.exists(path))
				Files.createFile(path);
			try(var writer = Files.newBufferedWriter(path)) {
				for(var line: this.articles.values()) {
					writer.write(line.toText());
					writer.newLine();
				}
				writer.close();
			}
		}
		
		files.newBufferedReader/Writer(Path)		throws IOException
		
		public void load(Path path) throws IOException {
		try(var reader = Files.newBufferedReader(path)) {			
			String line;
			while ((line = reader.readLine()) != null) {
				String[] parse = line.split(":");
								
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
	}throw new illegarargumentexecption();

	public void removeAllContainerFrom(String destination) {
		Iterator<OnCargo> iterator = onCargo.iterator();
			while(iterator.hasNext()) {
				OnCargo onCargo = iterator.next();
				if(onCargo.destination().equals(destination) && onCargo.isContainer()) {
					iterator.remove();
				}
			}
	}
	
		public void save(Path path) throws IOException {
			if(!Files.exists(path))
				Files.createFile(path);
			try(var writer = Files.newBufferedWriter(path)) {
				for(var line: this.articles.values()) {
					writer.write(line.toText());
					writer.newLine();
				}
				writer.close();
			}
		}
		
		//files.newBufferedReader/Writer(Path)		throws IOException
		
		public void load(Path path) throws IOException {
		try(var reader = Files.newBufferedReader(path)) {			
			String line;
			while ((line = reader.readLine()) != null) {
				String[] parse = line.split(":");
								
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
	}```
