package com.digital.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPrograms {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("Red");
		list1.add("Green");
		list1.add("Orange");
		list1.add("White");
		list1.add("Black");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Red");
		list2.add("Green");
		list2.add("Black");
		list2.add("White");
		list2.add("Pink");

		copyList(list1);
		shuffle(list1);
		reverse(list1);
		extractSubList(list1, 1);
		compareLists(list1, list2);
		swap(list1);
		join(list1, list2);
		remove(list1);
		isEmpty(list2);
		trim(list2);
	}

	// Write a Java program to copy one array list into another.
	public static void copyList(List<String> list) {
		ArrayList<String> newList = new ArrayList<String>(5);
		newList.addAll(list);
		System.out.println("After Copy");
		System.out.println(newList);
	}

	// Write a Java program to shuffle elements in a array list.
	public static void shuffle(List<String> list) {
		Collections.shuffle(list);
		System.out.println("After Shuffling");
		System.out.println(list);
	}

	public static void reverse(List<String> list) {
		Collections.reverse(list);
		System.out.println("After Reversing the elements");
		System.out.println(list);

	}

	// Write a Java program to extract a portion of a array list.
	public static void extractSubList(List<String> list, int posistion) {
		List<String> subList = list.subList(posistion, list.size());
		System.out.println("AFter Extracting");
		System.out.println(subList);
	}

	// Write a Java program to compare two array lists.
	public static void compareLists(List<String> list1, List<String> list2) {

		System.out.println(list1.containsAll(list2) ? "Equal" : "Not Equal");

	}

	// Write a Java program of swap two elements in an array list.
	public static void swap(List<String> list) {
		System.out.println("Before Swapping");
		System.out.println(list);
		Collections.swap(list, 1, 2);
		System.out.println("After Swapping");
		System.out.println(list);
	}

	// Write a Java program to join two array lists
	public static void join(List<String> list1, List<String> list2) {

		ArrayList<String> list3 = new ArrayList<String>();
		list3.addAll(list1);
		list3.addAll(list2);
		System.out.println("After Adding Two Lists");
		System.out.println(list3);
	}

	// Write a Java program to empty an array list
	public static void remove(List<String> list) {
		ArrayList<String> list1 = new ArrayList<String>(list);
		list1.removeAll(list1);
		System.out.println("After Removed Copied List");
		System.out.println(list1);
	}

	// Write a Java program to test an array list is empty or not
	public static void isEmpty(ArrayList<String> list) {
		System.out.println("Checking list is empty or not");
		System.out.println(list.isEmpty());
	}

	// Write a Java program to trim the capacity of an array list the current list
	// size.
	public static void trim(ArrayList<String> list) {
		System.out.println("Trimming its size");
		list.trimToSize();
	}

}
