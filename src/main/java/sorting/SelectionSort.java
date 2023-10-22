package sorting;

/**
 * Selection Sort
 * Time Complexity: O(n2) as there are two nested loops.
 * Auxiliary Space: O(1)
 * It never makes more than O(n) swaps and can be useful, 
 * when memory write is a costly operation.
 * @author Rachit Chandra
 *
 */
public class SelectionSort {

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
		selectionSort(arr);

		//Printing array after selection sort
		System.out.println("Elements after selection sorting");
		System.out.print("[");
		for(int element : arr) {
			System.out.print(element+" ");
		}
		System.out.println("]");
	}

	//Method for selection sort
	public static void selectionSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) { 
			int min=i;
			//to find the minimum value
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			} 
			//Swapping the min value to the position
			int temp= arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
	}

}
