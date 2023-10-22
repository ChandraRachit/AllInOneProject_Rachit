package collection.List;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * like an array, but there is no size limit
 * contain duplicate elements
 * maintains insertion order
 * non synchronized
 * allows random access because array works at the index basis
 * manipulation is little bit slower than the LinkedList in Java 
 * because a lot of shifting needs to occur if any element is removed from the array list
 * @author Rachit
 *
 */
public class ArrayListExample {
	public static void main(String args[]) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("First");
		al.add("Third");
		al.add(1,"Second");

		for(String str : al) {
			System.out.print(str+" ");
		}

		System.out.println();
		System.out.println("Value at index 0= "+al.get(0));
		System.out.println("Index position of 'Second' in ArrayList= "+al.indexOf("Second"));
		al.remove("First");
		System.out.println("'First' is removed from ArrayList");
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
			System.out.print(itr.next()+" ");  
		}  

	}
}

