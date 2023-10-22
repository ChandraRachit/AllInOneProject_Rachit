package collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExampleSorting {
	
	public static void main(String args[]){
		ArrayList<Integer> al=new ArrayList<>();
		al.add(4);
		al.add(6);
		al.add(3);
		al.add(8);
		al.add(2);
		al.add(1);
		al.add(6);
		al.add(4);
		al.add(3);
		al.add(2);
		
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		Collections.sort(al);
		
		Iterator ait=al.iterator();
		while(ait.hasNext()) {
			System.out.print(ait.next()+" ");
		}
		
	}

}
