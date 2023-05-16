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
