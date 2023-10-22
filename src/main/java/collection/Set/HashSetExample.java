package collection.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String args[]) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(7);
		al.add(4);
		al.add(6);
		al.add(9);
		al.add(4);
		al.add(5);
		al.add(6);
		
		Set<Integer> hs=new HashSet<Integer>(al);
		for(int a : hs) {
			System.out.print(a+" ");
		}
		
		System.out.println();
		
		al.clear();
		al.addAll(hs);
		Collections.sort(al);
		
		for(int b : al) {
			System.out.print(b+" ");
		}
	}
}
