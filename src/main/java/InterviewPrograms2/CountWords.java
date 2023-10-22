package InterviewPrograms2;

import java.util.HashMap;
import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String value=sc.nextLine();
		String[] values=value.split(" ");
		
		HashMap<String,Integer> hm=new HashMap<>();
		for(int i=0;i<values.length;i++) {
			if(hm.containsKey(values[i])) {
				hm.put(values[i], hm.get(values[i])+1);
			}else {
				hm.put(values[i], 1);
			}
		}
		
		hm.forEach((a,b)->{
//			System.out.print("Key = "+a+" Value = "+b);
//			System.out.println();
			if(b>1) {
				System.out.print("Key = "+a+" Value = "+b);
				System.out.println();
			}
		});
	}

}
