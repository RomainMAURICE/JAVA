package fr.uge.data;

import java.util.function.IntConsumer;

public class LinkedLink {
	private Link head;
	private int length;
	
	public void add(int value) {
		head = new Link(value, head);
		length++;
	}
	
	public int get(int index) {
		if(index > length || index < 0) throw new IndexOutOfBoundsException();	
		
		var a = head;
		for(int i=0; i<index; i++) {
			a = a.link();
		}
		return a.value();
	}
	
	public void forEach(IntConsumer intConsumer) {
		
		var a = head;
		while(a!=null) {
			intConsumer.accept(a.value());
			System.out.print(a.value());
			a=a.link();
			
		}
		
	}
	
    public static void main(String[] args) {
		var list = new LinkedLink();
		list.add(1);
		list.forEach(i -> System.out.println(i+""));
	}	
}
