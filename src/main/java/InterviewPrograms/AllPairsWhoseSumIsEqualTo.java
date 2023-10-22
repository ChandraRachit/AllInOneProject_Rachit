package InterviewPrograms;

import java.util.Arrays;

public class AllPairsWhoseSumIsEqualTo {
	public static void main(String args[]) {
		findThePair(new int[] {1,2,3,4,5,6,7},8);
		findPair(new int[] {1,2,3,4,5,6,7},8);
	}
	
	static void findThePair(int a[],int sum) {
		System.out.println("Numbers");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==sum) {
					System.out.println(a[i]+"&"+a[j]);
				}
			}
		}
	}
	
	/**
	 * Program with different logic
	 * @param a
	 * @param sum
	 */
	static void findPair(int a[],int sum) {
		Arrays.sort(a);
		int i=0;
		int j=a.length-1;
		System.out.println("Pairs");
		while(i<j) {
			if(a[i]+a[j]==sum) {
				System.out.println(a[i]+"+"+a[j]+"="+sum);
				i++;
				j--;
			}else if(a[i]+a[j]<sum) {
				i++;
			}else {
				j--;
			}
		}
	}

}
