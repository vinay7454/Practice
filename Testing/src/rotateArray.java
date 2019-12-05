import java.util.Arrays;

public class rotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[] { 1, 2, 3, 5, 6 };
		int num = 0, startingIndex = 0;

		int[] newArray = new int[array.length];

		if (num < 0) {
			startingIndex = array.length + num;
		} else if (num > 0) {
			startingIndex = num;
		}
		
		for (int i = 0; i < array.length; i++) {

			if (startingIndex == array.length) {
				startingIndex = 0;
			}
			newArray[startingIndex] = array[i];
			startingIndex++;
		}

		System.out.println(num);
		System.out.println(Arrays.toString(newArray));

	}
}
