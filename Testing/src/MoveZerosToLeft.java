
public class MoveZerosToLeft {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4,0,5,60,7,0,0};
		int i = arr.length - 1, j = arr.length -1;
		
		while(i >= 0) {
			if(arr[i] == 0) {
				//countZero++;
				i--;
			} else {
				if(i == j) {
					arr[j] = arr[i];
					
				} else {
					arr[j] = arr[i];
					arr[i] = 0;
				}
				j--;
				i--;
			}
		}
		
	}

}
