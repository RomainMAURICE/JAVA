TP9
===
Romain MAURICE

Exercice1
========
1) Quelle est l'interface fonctionnelle prise en paramètre de filter ?
-l'interface fonctionnelle prise en paramètre de filter est un predicate
Quels sont les types de paramètre et de retour de la lambda ?
-la lambda prend un objet Person et retourne un int

2) Quelle est l'interface fonctionnelle prise en paramètre de map ?
l'interface fonctionnelle prise en paramètre de map est Function<T, R>
Quels sont les types de paramètre et de retour de la lambda ?
-la lambda prend un objet Person et retourne un string, le l'attribut name de cet objet

3) Écrire une nouvelle version de namesOfTheAdults en utilisant l'API des streams.
```java
  public static List<String> namesOfTheAdults(List<Person> persons) {
	Objects.requireNonNull(persons, "agrmuent non valide");
	      
    return persons.stream()
    		.filter(p -> p.age()>18)
    		.map(p -> p.name)
    		.toList();
  }
```
Exercice 2
==========
1) Écrire le type Hotel en faisant attention à ce que la liste des chambres soit non mutable après création.
```java
public record Hotel(String name, List<Room> rooms) {
	public Hotel {
		Objects.requireNonNull(name);
		Objects.requireNonNull(rooms);
	}
```
2) Écrire une méthode roomInfo qui renvoie une chaîne de caractères contenant les noms des chambres en utilisant un Stream et en assurant que le code suivant fonctionne :
```java
	public String roomInfo() {
		return rooms.stream()
				.map(r -> r.name())
				.collect(Collectors.joining(", "));
	}
```
3) Écrire une méthode roomInfoSortedByFloor qui renvoie une chaîne de caractère contenant les noms de chambres triées par le numéro d'étage.
```java
	public String roomInfoSortedByFloor() {
		return rooms.stream()
				.sorted(Comparator.comparingInt(Room::floor))
				.map(Room::name)
				.collect(Collectors.joining(", "));				
	}
```
4) Écrire une méthode averagePrice qui renvoie la moyenne des prix de toutes les chambres. Dans le cas où l’hôtel n'a pas de chambre, on renverra NaN (Not a Number) :
```java
	public double averagePrice() {		
		return rooms.stream()
				.mapToLong(Room::price)
				.average()
				.orElse(Double.NaN);
	}
```
5) Écrire une méthode roomForPrice1 qui prend en paramètre un prix et renvoie la chambre la plus chère en dessous de ce prix. S'il y a plusieurs chambres au même prix, on prendra la première. Cette méthode renvoie un Optional car il peut n'y avoir aucune chambre qui respecte la contrainte de prix.
```java
```
6) En fait, il existe déjà une méthode max sur les Stream. Écrire une méthode roomForPrice2 qui fonctionne comme roomForPrice1 mais en utilisant la méthode max de Stream.
```java
	public Optional<Room> roomForPrice2(double prix){
		Objects.requireNonNull(prix, "agrmuent non valide");

		return rooms.stream()
				.filter(r -> r.price()<prix)
				.max(Comparator.comparing(Room::price));//renvoie un élément		
	}
```
7) Écrire une méthode expensiveRoomNames qui prend en paramètre une liste d'hôtels et renvoie les nom des deux (au maximum) chambres les plus chères de chaque hôtel.
```java
	public List<String> expensiveRoomNames(List<Hotel> hotels){
		Objects.requireNonNull(hotels, "agrmuent non valide");

        return hotels.stream()
        		.flatMap(h -> h.rooms.stream()
        				.sorted(Comparator.comparingDouble(Room::price).reversed())
        				.limit(2))
        		.map(Room::name)
        		.collect(Collectors.toList());
	}
```
8) On souhaite écrire une méthode roomInfoGroupedByFloor qui renvoie un dictionnaire qui à chaque étage associe une liste des chambres de cet étage :
```java
	public Map<Integer, List<Room>> roomInfoGroupedByFloor(){
		return rooms.stream()
				.collect(Collectors.groupingBy(Room::floor));
	}
```
9) La méthode précédente ne renvoie pas un dictionnaire qui trie les clés, donc les étages ne sont pas forcément dans l'ordre. En Java, il existe une classe java.util.TreeMap qui maintient les clés triées. Écrire une méthode roomInfoGroupedByFloorInOrder qui a la même signature que la méthode précédente mais renvoie un dictionnaire qui stocke les clés de façon triée.
```java
	public Map<Integer, List<Room>> roomInfoGroupedByFloorInOrder(){
		return rooms.stream()
				.collect(Collectors.groupingBy(Room::floor, TreeMap::new, Collectors.toList()));
	}
```




