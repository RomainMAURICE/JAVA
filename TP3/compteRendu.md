TP3 JAVA
========

Exercice 1
==========

1) Déclarer un record Book avec les composants title et author.

2) Puis essayer le code suivant dans une méthode main du record Book.

3) Créer une classe Main (dans un fichier Main.java) et déplacer le main de la classe Book dans la classe Main.
Quel est le problème ? Comment peut-on le corriger ?

4) On peut remarquer que le code permet de créer des livres ayant un titre ou un auteur null. Comment faire pour éviter ce problème sachant qu'il existe une méthode static requireNonNull dans la classe java.util.Objects.

5) En fait, on peut simplifier le code que vous avez écrit à la question précédente en utilisant un constructeur compact (compact constructor). Commenter le code précédent et utiliser un constructor compact à la place.

6) Écrire un autre constructeur qui prend juste un titre et pas d'auteur et ajouter un code de test dans le main.
On initialisera le champ author avec "<no author>" dans ce cas

7) Comment le compilateur fait-il pour savoir quel constructeur appeler ?

8) On souhaite maintenant pouvoir changer le titre d'un livre déjà existant en utilisant une méthode nommée withTitle qui prend en paramètre le nouveau titre. Pourquoi le code suivant ne marche pas ? Écrire le code correspondant et ajouter un code de test dans le main.

Exercice 2
==========

1) Qu'affiche le code ci-dessous ?

2) Comment faire pour tester si deux objets ont le même contenu ?
Écrire le code qui affiche si b1 et b2, puis b1 et b3 ont le même contenu.

3) Écrire une méthode isFromTheSameAuthor() qui renvoie vrai si deux livres sont du même auteur.
Et vérifier avec les deux livres suivants :

4) Comment faire pour que le code suivant affiche.

5) Utiliser l'annotation @Override (java.lang.Override) sur la méthode ajoutée à Book.


6) A quoi sert l'annotation @Override ?

