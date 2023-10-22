package InterviewPrograms;

import java.util.HashMap;

public class CountWords {

	public static void main(String args[]) {
		String value="My name is Rachit I am from Hajipur Bihar";
		String[] values=value.split(" ");
		HashMap<String,Integer> hm=new HashMap<>();
		
		for(int i=0;i<values.length;i++)
			if(hm.containsKey(values[i])) {
				int count=hm.get(values[i])+1;
				hm.put(values[i], count);
			}else {
				hm.put(values[i], 1);
			}
		System.out.println(hm);
		
		
	}
}
