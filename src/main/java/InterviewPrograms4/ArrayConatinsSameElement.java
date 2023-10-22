package InterviewPrograms4;

import java.util.Arrays;

public class ArrayConatinsSameElement {

	public static void main(String[] args) {
		char[] a= {1,2,3};
		char[] b= {2,1,3};
		
		
		System.out.println(Arrays.equals(a, b));
		
		//compare size
		//sort
		//check one by one
		
		if(a.length==b.length) {
			a=sortArray(a);
			b=sortArray(b);
			System.out.println(compareArray(a,b));
		}else {
			System.out.println(false);
		}
	}
	
	static char[] sortArray(char[] c) {
		char temp[] = null;
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				temp[i]=c[i];
				c[i]=c[j];
				c[j]=temp[i];
			}
		}
		return c;
	}

	static boolean compareArray(char[] a,char[] b) {
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i]) {
				return false;
			}
		}
		return true;
	}
}
