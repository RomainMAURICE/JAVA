```java
public record Voiture(String modele, int imatriculation){
  public Voiture{
    Objects.requireNonNull(modele, "modele is null");
    Objects.requireNonNull(imatriculation, "imatriculation is null");
  }
}
```
