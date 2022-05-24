package com.digital.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListSort {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList(Arrays.asList(5, 8, 0, 44, 95, 1));

		// Ascending Order sorting using Collections Class
		Collections.sort(list);
		System.out.println(list);

		// Ascending Order sorting using implementation
		list.sort(new AscendingOrder());
		System.out.println(list);

		// Descending Order sorting using implementation
		list.sort(new DescendingOrder());
		System.out.println(list);

		// Ascending Order using Lambda Expression
		list.sort((o1, o2) -> o1.compareTo(o2));
		System.out.println(list);

		// Descending Order using Lambda Expression
		list.sort((o1, o2) -> o2.compareTo(o1));
		System.out.println(list);


	}
}

class AscendingOrder implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}

}

class DescendingOrder implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}

}