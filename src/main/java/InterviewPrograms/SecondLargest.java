package InterviewPrograms;

public class SecondLargest {
	public static void main(String args[]) {
		System.out.println("Second Largest Number="+findSecondLargest(new int[] {1,2,3,4,5,6,6,7,8,33,32}));
	}
	static int findSecondLargest(int num[]) {
		int first;
		int second;
		if(num[0]>num[1]) {
			first = num[0];
			second= num[1];
		}else {
			first = num[1];
			second= num[0];
		}
		for(int i=2;i<num.length;i++)
		{
			if(num[i]>first) {
				second=first;
				first=num[i];
			}else if(num[i]<first && num[i]>second){
				second=num[i];
			}
		}
		return second;
	}

}
