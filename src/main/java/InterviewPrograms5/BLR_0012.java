package InterviewPrograms5;

import java.util.HashMap;

public class BLR_0012 {

	public static void main(String[] args) {
		int n=1121323;
		String value=Integer.toString(n);
		int count=0;
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<value.length();i++) {
			if(hm.containsKey(value.charAt(i))) {
				count=hm.get(value.charAt(i));
				hm.put(value.charAt(i), count+1);
			}else {
				hm.put(value.charAt(i), 0);
			}
		}
		
		System.out.println(hm);
		

	}

}
