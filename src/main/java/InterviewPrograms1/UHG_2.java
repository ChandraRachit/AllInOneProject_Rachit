package InterviewPrograms1;

import java.util.HashMap;
import java.util.Iterator;

public class UHG_2 {
	public static void main(String args[]) {
		HashMap<Character,Integer> hm=new HashMap<>();
		String name="MyName Is Rachit A";
		name=name.trim().toLowerCase().replace(" ", "");
		char[] charName=name.toCharArray();
		for(int i=0;i<name.length();i++) {
			if(hm.containsKey(charName[i])) {
				hm.put(charName[i],hm.get(charName[i])+1);
			}else {
				hm.put(charName[i],1);
			}
		}
		hm.forEach((a,b)->{
			if(hm.get(a)>1) {
				System.out.println("Key="+a+" Value="+b);
			}
		});
		
		System.out.println("------------------");
		
		String myName="RachitChandra";
		HashMap<Character,Integer> maps=new HashMap<>();
		myName=myName.toLowerCase().trim();
		for(int i=0;i<myName.length();i++) {
			if(maps.containsKey(myName.charAt(i))) {
				maps.put(myName.charAt(i),maps.get(myName.charAt(i))+1 );
			}else {
				maps.put(myName.charAt(i),1 );
			}
		}
		maps.forEach((a,b)->{
			if(b>1) {
				System.out.println("Key="+a+" Value="+b);
			}
		});
	}

}
