
public class InsertionSort {

	static int[] arr = {2,4,3,-10};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertionSortImp(arr);
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
	}

	public static void insertionSortImp(int[] input) {
		for(int i = 1; i < input.length; i++) {
			int key = input[i];
			int j = i - 1;
			
			while(j >= 0 && input[j] > key) {
				input[j + 1] = input[j];
				j = j - 1;
			}
			input[j + 1] = key;
		}
	}
	
}
