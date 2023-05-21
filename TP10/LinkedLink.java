package fr.uge.data;

import java.util.function.Consumer;

public class LinkedLink<T> {
	private Link head;
	private int length;
	
	public void add(T value) {
		head = new Link(value, head);
		length++;
	}
	
	public T get(int index) {
		if(index > length || index < 0) throw new IndexOutOfBoundsException();	
		
		var a = head;
		for(int i=0; i<index; i++) {
			a = a.link();
		}
		return (T) a.value();
	}
	
	public void forEach(Consumer<T> consumer) {
		 
		var a = head;
		while(a!=null) {
			consumer.accept((T) a.value());
			//System.out.println(a.value());
			a=a.link();
			
		}
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		var a = head;
		while(a!=null) {
			
			sb.append(a.value());
			if(a.link()!=null) {
				sb.append("-->");				
			}
			a=a.link();
			
		}
		return sb.toString();
	}
	

}
