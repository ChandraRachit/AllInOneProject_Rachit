package collection.Map.Hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDuplicate {
	
	public static void main(String args[]) {
		
		String value="RachitChandraisaverygoodboybbbbb";
		value=value.toLowerCase();
		
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<value.length();i++) {
			
			if(hm.containsKey(value.charAt(i))) {
				hm.put(value.charAt(i), hm.get(value.charAt(i))+1);		
			}else {
				hm.put(value.charAt(i), 1);
			}
		}
		
		
		//System.out.println("Values = "+hm);
		
		Iterator it=hm.keySet().iterator();
		while(it.hasNext()) {
			char value1= (char) it.next();
			if(hm.get(value1)>0) {
				System.out.println("Key = "+value1+" Value = "+hm.get(value1));	
			}
		}
		
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		for(Map.Entry<Character, Integer> entry : hm.entrySet()) {
			System.out.println("Key = "+entry.getKey()+" Value = "+entry.getValue());
		}
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		for(Character a : hm.keySet())
		{
			System.out.println("Key = "+a+" Value = "+hm.get(a));
		}
		
	}

}
