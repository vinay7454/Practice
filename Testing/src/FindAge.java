
public class FindAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10,20,30,40,50,60,10,10,10,10,20,20,10,10};
		System.out.println(findMedianAge(arr));
	}
	
	public static float findMedianAge(int[] arr) {
		int count = 0, minAge = 0, median = 0, medianIndex = 0;
		float medianValue = 0.0f;
		if (arr.length % 2 == 0) {
			medianIndex = 2;
			median = arr.length / 2;
		} else {
			medianIndex = 1;
			median = (arr.length / 2) + 1;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (minAge == arr[j]) {
					minAge = arr[j];
					count++;
					if (count == median && medianIndex > 0) {
						if ((int) medianIndex == 1 &&  arr.length % 2 != 0) {
							medianValue = arr[j];
							medianIndex--;
							break;
						} else {
							medianValue += arr[j];
							medianIndex--;
							median++;

						}
					}
				}
			}
			minAge++;
		}
		return (arr.length % 2 == 0) ? medianValue / 2 : medianValue;
	}
}
