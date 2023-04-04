package fr.uge.manifest;

public interface OnCargo {
	public abstract int price();
	public abstract int weight();
	public abstract String destination();
	public abstract boolean isContainer();
}
