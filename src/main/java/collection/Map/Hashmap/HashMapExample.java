package collection.Map.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String args[]) {
		Map<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "First");
		hm.put(2, "Second");
		hm.put(3, "Third");
		
		System.out.println("Size of Hashmap = "+hm.size());
		
		System.out.println(hm);
		
		System.out.println("Value of 1 = "+hm.get(1));
		
		System.out.println("Keys = "+ hm.keySet());
		
		System.out.println("Values = "+ hm.values());
		
		System.out.println("Contains 1 = "+ hm.containsKey(1));
		
		System.out.println("Contains First = "+ hm.containsValue("First"));
		
		for(Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}
}
