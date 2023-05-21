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
