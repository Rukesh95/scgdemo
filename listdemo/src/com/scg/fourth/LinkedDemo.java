package com.scg.fourth;
import java.util.*;

public class LinkedDemo {
	public static LinkedList<String> ll = new LinkedList<String> ();
	
	public void insert() {
		ll.add("Bengaluru");
		ll.add("Trivendrum");
		ll.add("Mangalore");
	}
	public void display() {
		System.out.println("LinkedList elements are \n" + ll);
	}
	public void delete() {
		ll.removeFirst();
		System.out.println("LinkedList elements after remover operation \n" + ll);
		
	}
}
