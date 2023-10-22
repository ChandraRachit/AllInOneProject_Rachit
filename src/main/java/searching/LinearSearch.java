package searching;

public class LinearSearch {
	public static void main(String args[]) {
		int[] arr= {33,34,56,78,1,22,333,6,5,3,8,9,3};
	linearSearch(arr,3338);

	}
	static void linearSearch(int[] arr, int j) {
		int flag=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==j) {
				flag=i+1;
			}
		}
		if(flag!=0) {
			System.out.println("Element Found at "+flag);
		}else {
			System.out.println("Element not Found");
		}
	}
}
