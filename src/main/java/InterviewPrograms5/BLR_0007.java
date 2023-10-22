package InterviewPrograms5;

import java.util.HashMap;

public class BLR_0007 {

	public static void main(String[] args) {
		String value="This is hashmap program.This is very important program";
		String split[]=value.split(" ");
		HashMap<String,Integer> hm=new HashMap<>();
		for(int i=0;i<split.length;i++) {
			if(hm.containsKey(split[i])) {
				int count=hm.get(split[i]);
				hm.put(split[i], count+1);
			}else {
				hm.put(split[i], 1);
			}
		}
		System.out.println(hm);
	
		}

	}


