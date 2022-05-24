package com.digital.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

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

		// Returns the length of the arraylist.
		System.out.println(list.size());

		// Iterate through an Enhanced For Loop
		System.out.println("==========Iterating using Enhaced For Loop");
		for (Integer number : list)
			System.out.print(number + "\t");
		System.out.println();

		// Iterate through an forEachMethod
		System.out.println("==========Iterating using forEachMethod");
		list.stream().forEach(System.out::print);
		System.out.println();

		// Iterate through an Iterator
		System.out.println("==========Iterating using Iterator");
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
		System.out.println();

		// Iterate in reverse order through an List Iterator
		System.out.println("==========Iterating using List Iterator");
		ListIterator<Integer> listIterator = list.listIterator(list.size());
		while (listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + "\t");
		}
	}
}
