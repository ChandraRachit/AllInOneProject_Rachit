package collection.List;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Uses a doubly linked list to store the elements
 * Provides a linked-list data structure
 * Inherits the AbstractList class
 * Implements List and Deque interfaces
 * Contain duplicate elements.
 * Maintains insertion order
 * Non synchronized
 * Manipulation is fast because no shifting needs to occur
 * Used as a list, stack or queue
 * @author Rachit
 *
 */
public class LinkedListExample {

	public static void main(String args[]) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("First");
		ll.add("Second");
		ll.add("First");
		ll.add("Third");
		ll.add("Fourth");
		ll.add("Second");
		
		Iterator it=ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
