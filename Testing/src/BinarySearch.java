
public class BinarySearch {

	static int[] arr = {-10,1,2,3,4,7,8,10};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value = 8;
		int lowIndex = 0;
		int highIndex = arr.length - 1;
		
		while(lowIndex <= highIndex) {
			int middleIndex = lowIndex + (highIndex-lowIndex)/2;
			
			if(arr[middleIndex] > value) {
				highIndex = middleIndex - 1;
			} else if(arr[middleIndex] < value) {
				lowIndex = middleIndex + 1;
			} else {
				System.out.println(middleIndex);
				return;
			}
		}
		
		

	}

}
