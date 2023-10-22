package InterviewPrograms1;

public class YoutubeMaxMinArray {
	
	public static void main(String args[]) {
		int a[]= {2,3,4,45,56,243,23};
		int max = a[0],min = a[0];
		for(int i : a) {
			if(max<i) {
				max=i;
			}
			if(min>i) {
				min=i;
			}
		}
		System.out.println("Max= "+max);
		System.out.println("Min= "+min);
	}

}
