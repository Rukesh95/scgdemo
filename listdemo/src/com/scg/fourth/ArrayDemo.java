package com.scg.fourth;

import java.util.*;

public class ArrayDemo {
	public static ArrayList<String> al = new ArrayList<String> ();
	
	public void insert() {
		al.add("Volvo");
		al.add("BMW");
		al.add("Hyundai");
	}
	
	public void delete() {
		al.remove(0);
	}
	
	public void display() {
		System.out.println("ArrayList elements are :");
		System.out.println(al);
	}
	
	public void getdemo() {
		System.out.println("Element at 1st Index is : "+al.get(1));
	}
	public void setdemo() {
		System.out.println("Demonstration of Set Method for ArrayList");
		al.set(0," Maruthi ");
		for(String i : al) {
			System.out.println(i);
		}
	}
	public void sizedemo() {
		System.out.println("Size of ArrayList is :"+al.size());
	}
	
		
}
