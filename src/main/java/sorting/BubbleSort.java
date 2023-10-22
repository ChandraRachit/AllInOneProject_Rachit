package sorting;

/**
 * Bubble sort
 * Worst and Average Case Time Complexity: O(n*n). 
 * Worst case occurs when array is reverse sorted.
 * Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
 * Auxiliary Space: O(1)
 * Boundary Cases: Bubble sort takes minimum time (Order of n) 
 * when elements are already sorted.
 * @author Rachit Chandra
 *
 */
public class BubbleSort {

	public static void main(String args[]) {
		//Array to be sorted
		int[] arr = { 5,4,3,2,1,9,1 };

		//Printing array before sorting
		System.out.println("Elements before sorting");
		System.out.print("[");
		for(int element : arr) {
			System.out.print(element+" ");
		}
		System.out.println("]");

		//Calling sorting method to sort the array
		bubbleSort(arr);

		//Printing array after selection sort
		System.out.println("Elements after selection sorting");
		System.out.print("[");
		for(int element : arr) {
			System.out.print(element+" ");
		}
		System.out.println("]");
	}

	//Method for Bubble Sort
	public static void bubbleSort(int[] arr) {
		boolean flag;
		for(int k=0;k<arr.length-1;k++) {
			flag=false;
			for(int i=0;i<arr.length-k-1;i++) {
				if(arr[i] > arr[i+1]) {
					int temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
					flag=true;
				}
			}
			if(flag==false) {
				break;
			}
		}
	}
}
