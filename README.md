
# JAVA COLLECTIONS FRAMEWORK

The Java collections framework is a set of classes and interfaces that implement commonly reusable collection data structures. Although referred to as a framework, it works in a manner of a library. The collections framework provides both interfaces that define various collections and classes that implement them.




## Authors

- [@srikanth-goshikonda](https://www.github.com/srikanth-goshikonda)


## Minimum Requirment
- JDK 1.8

- Eclipse IDE

 - Maven Plugin




## Classes

* [Collections](https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html):
* [ArrayList<E>](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html):
* [LinkedList<E>](https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html):
* [Stack<E>](https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html):
* [Vector<E>](https://docs.oracle.com/javase/7/docs/api/java/util/Vector.html):
* [HashSet<E>](https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html):
* [LinkedHashSet<E>](https://docs.oracle.com/javase/7/docs/api/java/util/LinkedHashSet.html):
* [TreeSet<E>](https://docs.oracle.com/javase/7/docs/api/java/util/TreeSet.html):
* [ArrayDeque](https://docs.oracle.com/javase/7/docs/api/java/util/ArrayDeque.html):
* [PriorityQueue](https://docs.oracle.com/javase/7/docs/api/java/util/PriorityQueue.html):
* [HashMap](https://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html):
* [LinkedHashMap](https://docs.oracle.com/javase/7/docs/api/java/util/LinkedHashMap.html):
* [TreeMap](https://docs.oracle.com/javase/7/docs/api/java/util/TreeMap.html):
* [HashTable](https://docs.oracle.com/javase/7/docs/api/java/util/Hashtable.html):


## Collections Hirerachy

![Structure](https://www.javacodeexamples.com/wp-content/uploads/java-collections-cheat-sheet.png)


## ArrayList Sample Program

```java
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

