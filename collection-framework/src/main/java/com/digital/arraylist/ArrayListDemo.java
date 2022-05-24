package com.digital.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		// Add elements
		list.add(10);
		list.add(0);
		list.add(25);
		list.add(10);
		list.add(-15);
		list.add(null);
		System.out.println("Element");
		System.out.println(list);

		// Access elements
		System.out.println("Element at index 1: " + list.get(1));

		// change the element of the array list
		list.set(1, 6);
		System.out.println("Modified ArrayList: " + list);

		// remove element from index 2
		Integer removedElement = list.remove(2);
		System.out.println("Updated ArrayList: " + list);
	}
}
