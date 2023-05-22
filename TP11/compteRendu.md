TP11
===
Romain MAURICE

Exercice1
========
1) On souhaite écrire une classe Argument avec un champ text de tel sorte à ce que le code suivant fonctionne et affiche les bonnes valeurs
```java
package fr.uge.cmdline1;

import java.util.List;
import java.util.Objects;

public sealed class Argument permits Option {
	
	final String text;//pas private pour que les fils l'utilise
	
	public Argument(String text) {
		Objects.requireNonNull(text);
		this.text = text;
	}
	
	
	@Override
	public String toString() {
		return "Argument{ text:'"+text+"' }";
	}
}

```
2) On souhaite écrire une méthode parseCmdLine dans la classe CmdLine1 qui renvoie pour chaque chaine de caractère l'argument correspondant le tout dans une liste.
```java
	public static List<Argument> parseCmdLine(String... args) {
		ArrayList<Argument> list = new ArrayList<>();
		for(var i : args) {
			Argument a = new Argument(i);
			list.add(a);
		}
		return list;
	}
```
3) On souhaite maintenant écrire une classe Option qui va représenter les options de la ligne de commande avec un texte (text) et la valeur de l'enum OptionInfo correspondant (nommé info) tel que le code suivant fonctionne correctement. Comme c'est un TP sur l'héritage, on vous demande d'utiliser l'héritage.
```java
package fr.uge.cmdline1;

import java.util.Objects;

public final class Option extends Argument {
	//private final String text;
	private final OptionInfo info;
	
	public Option(String text, OptionInfo info) {
		super(text);
		//Objects.requireNonNull(text);
		Objects.requireNonNull(info);
		//this.text = text;
		this.info = info;
	}
	
	@Override
	public String toString() {
		return "Option{ text: '"+text+"', info: "+info+" }";
	}
}

```
4) On veut maintenant modifier la méthode parseCmdLine pour reconnaitre les arguments et les options. Pour cela, nous allons introduire une méthode intermédiaire asOptionInfo qui prend en paramètre un argument sous forme de chaine de caractère et renvoie soit la bonne valeur de l'enum OptionInfo soit null si la chaine de caractère ne correspond pas à une des options "-v", "--verbose", "-a" ou "--all"

```java
	public static OptionInfo asOptionInfo(String arg) {
		Objects.requireNonNull(arg);
		switch (arg) {
		case "-v":
			return OptionInfo.VERBOSE;
		case "--verbose":
			return OptionInfo.VERBOSE;
		case "-a":
			return OptionInfo.ALL;
		case "--all":
			return OptionInfo.ALL;
		default:
			return null;
		}
	}
	
	public static List<Argument> parseCmdLine(String... args) {
		Objects.requireNonNull(args);
		ArrayList<Argument> list = new ArrayList<>();
		for(var i : args) {
			if(asOptionInfo(i)!=null) {
				Option option = new Option(i, asOptionInfo(i));
				list.add(option);
			}
			else {
				Argument a = new Argument(i);
				list.add(a);
			}
		}
		return list;
	}
```