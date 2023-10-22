package InterviewPrograms2;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String value=sc.nextLine();
		
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<value.length();i++) {
			if(hm.containsKey(value.charAt(i))) {
				hm.put(value.charAt(i), hm.get(value.charAt(i))+1);
			}else {
				hm.put(value.charAt(i), 1);
			}
		}
		hm.forEach((a,b)->{
			if(b==2) {
				System.out.print(a+" ="+b);
				System.out.println();
			}
		});
	}
}
