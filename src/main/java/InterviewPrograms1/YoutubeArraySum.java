package InterviewPrograms1;

public class YoutubeArraySum {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int sum=0,sum2=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum="+sum);
		
		for(int value : a) {
			sum2=sum2+value;
		}
		System.out.println("Sum="+sum2);
	}

}
