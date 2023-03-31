TP4
===

Exercice 1
===

1) Que fait sysout + Ctrl + Space dans un main ?

2) Que fait toStr + Ctrl + Space dans une classe ?

3) Définir un champs foo de type int, que fait get + Ctrl + Space, et set + Ctrl + Space .

4) Dans le menu Source, comment générer un constructeur initialisant le champ foo ?

5) Sélectionner le nom de la classe puis Alt + Shift + R, qu'obtient-on ? Même question avec le champ foo .

6) Écrire a = 2 + 3 + 4, puis sélectionner 2 + 3 puis Alt + Shift + L .

7) Écrire new Integer(2), en gardant le curseur après ')', appuyer sur Ctrl + 1, que se passe-t-il ?

8) Déclarer une variable s de type String et cliquer sur String en maintenant la touche Ctrl . Que se passe-t-il ?

9) Dans la méthode toString(), que fait un Ctrl + Clic sur super.toString() ?

10) Sélectionner le champs foo, puis Ctrl + Shift + G. Que se passe-t-il ?

11) À quoi sert Ctrl + Shift + O ?

12) À quoi sert Ctrl + Shift + C ?


Exercice 2
===

1) Écrire une classe Library avec un champs books de type ArrayList ainsi qu'un constructeur sans paramètre initialisant le champ books.

```java
public class Library {
    private final ArrayList<Book> books;

    public Library(){
        books = new ArrayList<>();
    }
}
```

2) Ajouter une méthode add qui permet d'ajouter des books (non null) à la liste de livres.
```java
    public void add(Book book){
        Objects.requireNonNull(book);
        books.add(book);
    }
```

3) Écrire une méthode findByTitle qui permet de trouver un livre en fonction de son titre dans la bibliothèque. La méthode doit renvoyer null dans le cas où aucun livre n'a le bon titre.
```java
    public Book findByTitle(String title){
        for(Book i : books){
            if(i.title().equals(title)){
                return i;
            }
        }
        return null;
    }
```

4) Comment le compilateur compile-t-il une boucle foreach sur une collection ?
-le compilateur compile une boucle foreach en utilisant java/util/Iterator

5) Expliquer pourquoi la méthode findByTitle doit renvoier null plutôt que de lever une exception.
-La methode findByTitle doit renvoyer null plutôt que de lever une exception, c'est une methode plus propre
pour gérer les erreurs.

6) Écrire une méthode toString permettant d'afficher les livres de la bibliothèque dans l'ordre d'insertion, un livre par ligne.
```java
    @Override
    public String toString() {
        var builder = new StringBuilder();
        var separator="";
        for(Book i : books){
            builder.append(i);
            builder.append(separator);
            separator="\n";
        }
        return builder.toString();
    }
```


Exercice 3
===

1) Quelle est la complexité de la méthode findByTitle de la classe Library ?

2) Quelle est la structure de données algorithmique dont java.util.HashMap est une implantation ?
Sachant que l'on veut améliorer la performance de findByTitle comment peut on utiliser la classe java.util.HashMap pour cela ?
Quelle sera alors la complexité de findByTitle ?

3) Commenter entièrement le code de la classe Library (pour ne pas perdre votre travail) et recopier les signatures des méthodes commentées. Pour l'instant, laisser la méthode toString de côté. Modifier les champs afin d'utiliser une java.util.HashMap et implanter les méthodes le constructeur et les méthodes add et findByTitle.

4) Expliquer pourquoi, ici, on a préféré utiliser une classe pour représenter Libary plutôt qu'un record.

5) Pour l'implantation de la méthode toString, quelle méthode de java.util.HashMap doit-on utiliser pour obtenir l'ensemble des valeurs stockées ? Si vous ne savez pas, lisez la javadoc !

6) En fait, la méthode toString ne fait pas exactement ce qui est demandé, car elle ne permet pas d'afficher les éléments dans l'ordre d'insertion. Sachant qu'il existe une classe LinkedHashMap, comment peut-on résoudre ce problème ?

7) Pourquoi votre implantation lève-t-elle une exception dans l'exemple suivant ?

8) En fait, il existe une méthode remove sur l'interface Iterator qui n'a pas ce problème, car le parcours et la suppression se font sur le même itérateur.
Implanter correctement la méthode removeAllBooksFromAuthor.

9) De façon optionnelle, si vous êtes balèze, il existe une méthode removeIf sur Collection qui permet d'écrire la méthode removeAllBooksFromAuthor en une ligne !

