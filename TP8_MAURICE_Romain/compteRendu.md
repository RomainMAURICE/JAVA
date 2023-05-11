TP8
===
Romain MAURICE

Exercice1
========
On souhaite écrire, dans une classe Lambdas, une méthode statique upperCaseAll qui prend en paramètre une liste de chaînes de caractères et met chaque chaîne en majusucules.

1) Rappeler comment on met une chaîne de caractères en majusucules, indépendamment de la langue dans laquelle l'OS est configuré.
```java
.toUpperCase(Locale.ROOT)
```
2) On va utiliser la méthode List.replaceAll pour mettre toutes les chaînes de caractères en majuscules. Quelle est l'interface fonctionnelle utilisée par la méthode replaceAll ?

-java.util.function.Function

3) À quel type de fonction cela correspond-il ? Autrement dit, que prend la fonction en argument et que renvoie-t-elle ?

-la fonction prend un argument quelconque et renvoie un résultat

4) Sachant que l'on appelle replaceAll avec une liste de String, quel est le type des paramètres de la lambda et quel est son type de retour ?

-les paramètres sont des String, et son type de retour est un string

5) Écrire le code de la méthode upperCaseAll
```java
	public static void upperCaseAll(ArrayList<String> list){
		Objects.requireNonNull(list);
		list.replaceAll(e->e.toUpperCase(Locale.ROOT));
	}
```

Exercice2
========
On souhaite calculer le nombre d'occurences de chaque chaîne de caractères dans une liste de chaînes de caractères. Par exemple, avec la liste ["foo", "bar", "foo"], la méthode occurences va renvoyer {"foo" = 2, "bar" = 1}.


1) Quelle est le type du paramètre de la méthode occurences ?
-le paramètre sera de type ArrayList
Quelle est le type de retour de la méthode occurences ?
-la paramètre retour sera de type HashMap, la clée sera le mot, et la valeurs sera le nombre d'itération du mot

2) Quelle est l'implantation que l'on doit choisir ici ?

3) On veut parcourir la liste avec la méthode forEach. Quelle interface fonctionnelle prend-elle en paramètre ? Quel est le type fonction correspondant ? Ici, quels sont les types des paramètres / de retour de la lambda que vous allez utliser ?

-Elle prend en paramètre une l'interface fonctionnelle Consumer, le type de fonction correspondant est 'T'.

4) Pour compter le nombre d'occurences, on va utiliser la méthode merge de la structure de données que vous avez choisi de renvoyer. Quelle interface fonctionnelle prend-elle en paramètre ? Quel est le type fonction correspondant ? Ici, quels sont les types des paramètres / de retour de la lambda que vous allez utliser ?

-merge prend en paramètre l'interface fonctionnelle BiFunction, le type de fonction correspondant est "apply(T t, U u)"

5) Écrire le code de occurences, toujours dans la classe Lambdas.
```java
	public static HashMap<String,Integer> occurences(List<String> list){
		Objects.requireNonNull(list);
		HashMap<String,Integer> hashMap = new HashMap<>();
		
		list.forEach(str -> hashMap.merge(str, 1, Integer::sum));
		return hashMap;
	}
```
6) On peut noter qu'il existe une méthode statique sum dans la classe java.lang.Integer qui fait la somme de deux valeurs, on peut donc l'utiliser sous forme de method reference à la place de la lambda, lors de l'appel à merge. Modifier le code pour l’utiliser (garder la précédente version en commentaires).


Exercice3
========

1) Quel est le type de paramètre de actorGroupByFirstName ? Quel est le type de retour de actorGroupByFirstName ?

-le paramètre de actorGroupFirstName est une ArrayList<Actor>. Le type de retour est HashMap<String,List<Actor>>

2) Rappeler comment marche la méthode Map.computeIfAbsent. Son second paramètre est une interface fonctionnelle, à quel type de fonction correspond-elle ? Expliquer à quoi correspondent le premier paramètre et le second paramètre de Map.computeIfAbsent, puis comment on peut l'utiliser pour grouper les acteurs selon leur prénom.

-Son second paramètre est une interface fonctionnelle de type Function. Le premier paramètre représente la clé dont on souhaite obtenir la valeur. Le second paramètre est utilisée pour faire un action si la clé n'existe pas, comme ajouter un élément a la map. on peut utiliser map.computeIfAbsent pour lire la liste de nom des acteurs, si un nom apparait pour la première fois, on va créer une nouvelle liste, puis insérer dans cette liste le nom et prénom de l'acteur.

3) Dans notre cas, quel doit être le type de la lambda passée en second paramètre de computeIfAbsent ?

- k -> new ArrayList<>()).add(i);
  
4) Écrire la méthode actorGroupByFirstName()
```java
	public static HashMap<String,List<Actor>> actorGroupByFirstName(ArrayList<Actor> list) {
		HashMap<String, List<Actor>> map = new HashMap<>();
		for(var i : list) {
			map.computeIfAbsent(i.firstName(), k -> new ArrayList<>()).add(i);
		}
		return map;
	}
```
5) Si on veut maintenant grouper les acteurs par rapport à leur nom (lastName) au lieu du prénom, on va écrire à peu près le même code. On veut généraliser le code en écrivant une méthode actorGroupBy. qui prend en paramètre une liste d'acteurs ainsi qu'une fonction qui, étant donné un acteur, renvoie la valeur par laquelle il va être groupé. Et elle renvoie une Map des valeur par lesquelles on les groupe, associées aux listes d'acteurs groupés.