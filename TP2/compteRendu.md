Exercice 1
==========
1) Quel est le type de s ? Comment le compilateur fait-il pour savoir qu'il existe une méthode length() sur s ?
-s est de typejava.lang.string, "var" permet de à la variable d'être du bon type
2) Qu'affiche le code suivant ? Expliquer.
-le code suivant affiche true pour la première comparaison et false pour la seconde.
-s2 est copié au niveau de la mémoire, pour s3, un nouvel objet à une nouvelle adresse mémoire est crée. La comparaison vérifie si les deux variables ont la même adresse car "==" est utilisé.
3) Quelle est la méthode à utiliser si l'on veut tester si le contenu des chaînes de caractères est le même ?
-Il faut utiliser la methode .equal()
4) Qu'affiche le code suivant ? Expliquer
-le code suivant affiche true, les deux variables sont initialisés avec la même chaine de charactère. les deux variables sont référées à la même adresse mémoire.
5) Expliquer pourquoi il est important que java.lang.String ne soit pas mutable.
-java.lang.string ne doit pas être mutable pour des raisons de séurité, et pour éviter les modifications involontaires des variables en cas de confils avec les adresses mémoires
6) Qu'affiche le code suivant ?
-Le code suivant affiche "HELLO", la methode toUpperCase() passe la chaine de charactère mis en paramètre, en majuscule

Exercice 2
==========
1) Utiliser dans un premier temps l'opérateur + qui permet la concaténation de chaînes de caractères
```java
public class Morse {
    public static void main(String[] args) {
        for(String i : args){
            System.out.print(i+" Stop. ");
        }
    }
}
```
2) A quoi sert l'objet java.lang.StringBuilder ?
-java.lang.StringBuilder permet des opérations sur les chaines de charactères.
Pourquoi sa méthode append(String) renvoie-t-elle un objet de type StringBuilder ?
-la methode append(String) renvoie un objet de type StringBuilder pour pouvoir appliquer des méthodes de cette classe à notre objet

3) Réécrire la classe Morse en utilisant un StringBuilder.
Quel est l'avantage par rapport à la solution précédente ?
-l'aventage est que le code ne print qu'une seule fois.
```java
import java.lang.StringBuilder;

public class Morse {
    public static void main(String[] args) {
        var builder = new StringBuilder();
        for(String i : args){
            builder.append(i);
            builder.append(" Stop. ");
        }
        System.out.println(builder.toString());
    }
}

```
4) Pourquoi peut-on utiliser ' ' à la place de " " ?
-On peut utiliser ' ' à la place de " " lorsque notre variable désigne un seul caractère, un char. Pour les char on utilise ' ' et pour les strings " "
Compiler le code puis utiliser la commande javap pour afficher le bytecode Java (qui n'est pas un assembleur) généré. Que pouvez-vous en déduire ?
-StringBuilder() permet d'éxectuer le code en faisant moins d'action

5) Compiler le code de la question 1, puis utiliser la commande javap pour afficher le bytecode Java généré.
Que pouvez-vous en déduire ?
-"+" nécécite au code plus d'actions que stringBuilder()
Dans quel cas doit-on utiliser StringBuilder.append() plutôt que le + ?
Et pourquoi est-ce que le chargé de TD va me faire les gros yeux si j'écris un + dans un appel à la méthode append?
-On doit utiliser StringBuilder.append() plutot que le + quand on doit ajouter plusieurs fois des éléments à notre chaines de charactère.

Exercice 3
==========
