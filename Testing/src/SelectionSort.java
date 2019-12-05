
public class SelectionSort {

	static int[] arr = {10,2,-6,-10,3,4,2,5};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0; i < arr.length; i++) {
			int min = i;
			for(int j = i; j < arr.length; j++) {
				if(arr[min] < arr[j]) {
					min = j;
				}
				swape(min,j);
			}
			
		}
		
		for(int i : arr) {
			System.out.println(i);
		}
		
	}

	private static void swape(int min, int j) {
		int temp = arr[j];
		arr[j] = arr[min];
		arr[min] = temp;
		
	}

}
