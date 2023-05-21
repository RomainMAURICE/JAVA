TP10
===
Romain MAURICE

Exercice1
========
1) Créer un record Link dans le paquetage fr.uge.data correspondant à un maillon de la liste chaînée stockant des entiers.
En aucun cas, l'utilisateur de la classe ne devra lui-même manipuler des maillons.
Quelle doit être la visibilité du record fr.uge.data.Link ?
Écrire un main de test dans cette classe créant deux maillons contenant les valeurs 13 et 144.
```java
package fr.uge.data;

record Link(Object value, Link link) {
	public static void main(String[] args) {
		Link link1 = new Link(13, null);
		Link link2 = new Link(144, null);
	}
}

```
2) Quelle est la commande pour exécuter le main du record fr.uge.data.Link à partir d'un terminal (pas dans Eclipse) ?
3) Créer une classe fr.uge.data.LinkedLink qui permettra de manipuler une liste chainée par son premier maillon, avec :
1)une méthode add(int value) qui ajoute un élément en tête de la liste.
```java
public class LinkedLink {
	private Link head;
	
	public void add(int value) {
		head = new Link(value, head);
		length++;
	}

```
2)une méthode get(index) qui renvoie l'élément à l'index (en commençant à 0).
Comment faire en sorte que le code qui vérifie que l'index est valide soit en O(1) ?
Faites les changements qui s'imposent.
```java
public class LinkedLink {
	private Link head;
	private int length;
	
	public int get(int index) {
		if(index > length || index < 0) throw new IndexOutOfBoundsException();	
		var a = head;
		for(int i=0; i<index; i++) {
			a = a.link();
		}
		return a.value();
	}

```
3)une méthode forEach(lambda) qui appel la lambda avec la valeur de chaque maillon de la liste.
```java
	public void forEach(IntConsumer consumer) {
		var a = head;
		while(a!=null) {
			consumer.accept(a.value());
			//System.out.println(a.value());
			a=a.link();
		}
	}

```
4)une méthode toString qui représente la liste chainée avec des "-->" entre les valeurs.
```java
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		var a = head;
		while(a!=null) {
			sb.append(a.value());
			if(a.link()!=null) {
				sb.append("-->");				
			}
			a=a.link();
		}
		return sb.toString();
	}

```

Exercice2
========
1) Dans le but de pouvoir ré-utiliser la liste dans différents codes, changer les classes fr.uge.data.LinkedLink et fr.uge.data.Link pour une implantation plus générique à base d'Object.
```java
package fr.uge.data;

record Link(Object value, Link link) {

}
```
```java
package fr.uge.data;

import java.util.function.Consumer;

public class LinkedLink {
	private Link head;
	private int length;
	
	public void add(Object value) {
		head = new Link(value, head);
		length++;
	}
	
	public Object get(int index) {
		if(index > length || index < 0) throw new IndexOutOfBoundsException();	
		
		var a = head;
		for(int i=0; i<index; i++) {
			a = a.link();
		}
		return a.value();
	}
	
	public void forEach(Consumer consumer) {
		 
		var a = head;
		while(a!=null) {
			consumer.accept(a.value());
			//System.out.println(a.value());
			a=a.link();
			
		}
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		var a = head;
		while(a!=null) {
			
			sb.append(a.value());
			if(a.link()!=null) {
				sb.append("-->");				
			}
			a=a.link();
			
		}
		return sb.toString();
	}
	

}
```
2) Dans la classe Main, expliquer pourquoi le code suivant ne fonctionne pas ?
       var l = new LinkedLink();
       l.add("hello");
       l.add("world");
       l.forEach(s -> System.out.println("string " + s + " length " + s.length()));
Que doit-on faire pour que le code fonctionne

-le code suivant ne marche pas car différents types peuvent être contenu dans linkedLink, il faut utiliser un type paramétré pour qu'un seul type d'objet soit accepté quand on crée un LinkedLink


Exercice3
========

1) Rappeler quel est l'intérêt d'utiliser un type paramétré ici ?
-ici le type paramétré permet qu'un seul type d'objet soit stoqué dans la LinkedList

2) Paramétrer la classe fr.uge.data.LinkedLink pour que celle-ci soit générique.

```java
package fr.uge.data;

import java.util.function.Consumer;

public class LinkedLink<T> {
	private Link head;
	private int length;
	
	public void add(T value) {
		head = new Link(value, head);
		length++;
	}
	
	public T get(int index) {
		if(index > length || index < 0) throw new IndexOutOfBoundsException();	
		
		var a = head;
		for(int i=0; i<index; i++) {
			a = a.link();
		}
		return (T) a.value();
	}
	
	public void forEach(Consumer<T> consumer) {
		 
		var a = head;
		while(a!=null) {
			consumer.accept((T) a.value());
			//System.out.println(a.value());
			a=a.link();
			
		}
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		var a = head;
		while(a!=null) {
			
			sb.append(a.value());
			if(a.link()!=null) {
				sb.append("-->");				
			}
			a=a.link();
			
		}
		return sb.toString();
	}
	

}

```
3) Modifier la classe fr.uge.data.main.Main en conséquence.
```java
package fr.uge.data;

public class Main {
    public static void main(String[] args) {
		var linkList = new LinkedLink<Integer>();
		linkList.add(3);
		linkList.add(2);
		linkList.add(1);
		//linkList.forEach(i -> System.out.print(i));
		System.out.println(linkList.toString());
		
	    var l = new LinkedLink<String>();
	    l.add("hello");
	    l.add("world");
	    l.forEach(s -> System.out.println("string " + s + " length " + s.length()));
	}	
}

```
