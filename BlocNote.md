```java
public record Voiture(String modele, int imatriculation){
  public Voiture{
    Objects.requireNonNull(modele, "modele is null");
    Objects.requireNonNull(imatriculation, "imatriculation is null");
  }
}
```
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
  
  }
}
```
```java
public record Voiture(String modele, int imatriculation){
  public Voiture{
    Objects.requireNonNull(modele, "modele is null");
    Objects.requireNonNull(imatriculation, "imatriculation is null");
  }
}
```
