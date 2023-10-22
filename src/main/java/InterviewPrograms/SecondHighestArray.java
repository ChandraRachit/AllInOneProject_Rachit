package InterviewPrograms;

public class SecondHighestArray {

	public static void main(String[] args) {
		int[] value= {32,34,24,52,1,56,35,6};

		for(int i=0;i<value.length;i++) {
			for(int j=i+2;j<value.length;j++) {
				if(value[i]>value[j]) {
					int temp=value[i];
					value[i]=value[j];
					value[j]=temp;
				}
			}
		}
		System.out.print(value[value.length-2]);
	}

}
