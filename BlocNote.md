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
      sb.
    }
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
