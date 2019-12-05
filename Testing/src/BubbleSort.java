
public class BubbleSort {

	static int[] arr = {10,2,-6,-10,3,4,2,5};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = arr.length - 1; i > 1; i--) {
			for(int j = 0; j < i; j++) {
				if(arr[j] > arr[j+1]) {
					swape(j, j+1);
				}
			}
		}
		
		for(int i : arr) {
			System.out.println(i);
		}

	}

	private static void swape(int indexOne, int indexTwo) {
		int temp = arr[indexTwo];
		arr[indexTwo] = arr[indexOne];
		arr[indexOne] = temp;
		
	}

}
