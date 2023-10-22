package InterviewPrograms;

public class ArraySort {

	public static void main(String[] args) {
		int[] value= {18,2,11,22,4,1,7,88,3,442,0,14};
		int temp;
		for(int i=0;i<value.length;i++) {
			for(int j=i+1;j<value.length;j++) {
				if(value[i]>value[j]) {
				temp=value[i];
				value[i]=value[j];
				value[j]=temp;
				}
			}
		}
		for(int a : value) {
			System.out.print(a+" ");
		}

	}

}
