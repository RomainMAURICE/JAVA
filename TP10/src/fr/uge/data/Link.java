package fr.uge.data;

//visibilité package
record Link(int value, Link link) {
	public static void main(String[] args) {
		Link link1 = new Link(13, null);
		Link link2 = new Link(144, null);
	}
}
