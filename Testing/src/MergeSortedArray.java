
public class MergeSortedArray {

	public static int[] bruteForce(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length+arr2.length];
		int i = 0, j = 0, k=0;
		
		while(k < arr3.length) {	
			if(i < arr1.length && arr1[i] < arr2[j]) {
				arr3[k] = arr1[i];
				k++;
				i++;
			} else if(j <= arr2.length) {
				arr3[k] = arr2[j];
				k++;
				j++;
			}
		}
		
		return arr3;
	}
	
	public static int[] usingPriorityQueue() {
		return null;
		
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,4,8};
		int[] arr2 = {3,4,5,7,9};
		
		int[] arr3 = usingPriorityQueue(arr1, arr2);
		
		for(int l = 0; l < arr3.length; l++) {
			System.out.print(arr3[l] + " ");
		}
	}
}
