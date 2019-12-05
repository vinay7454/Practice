import java.util.List;

public class LowHighIndex {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 5, 5, 5, 5, 5, 5, 5, 20 };
		int key = 5;
		System.out.println(find_low_index(arr, key));

	}

	static int find_low_index(int[] arr, int key) {
		int lowIndex = 0;
		int highIndex = arr.length -1 ;
			
		while(lowIndex <= highIndex) {
			int middleIndex = lowIndex + (highIndex-lowIndex)/2;
			
			if(arr[middleIndex] > key) {
				highIndex = middleIndex - 1;
			} else if(arr[middleIndex] < key) {
				lowIndex = middleIndex + 1;
			} else {
				return middleIndex;
			}
		}
		return -1;
	}

	static int find_high_index(List<Integer> arr, int key) {
		// TODO: Write - Your - Code
		return -1;
	}

}
