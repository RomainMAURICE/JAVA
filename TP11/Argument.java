package fr.uge.cmdline1;

import java.util.ArrayList;
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
