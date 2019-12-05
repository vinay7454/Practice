import java.util.Arrays;
import java.util.Collections;

public class MaximumSumCircularSubarray {
	
	public int maxSubarraySumCircular(int[] A) {
		int maxEndHere = 0;
		int maxSoFar = 0;
		for (int i = 0; i < A.length; i++) {
			maxEndHere = maxEndHere + A[i];
			if (maxEndHere < 0) {
				maxEndHere = 0;
			}
			if (maxSoFar < maxEndHere) {
				maxSoFar = maxEndHere;
			}
		}
		return maxSoFar;
	}
	
	
	public int maxSubarraySumCircularOneSkip(int[] A) {
		int delete = A[0], result = A[0], keep=A[0];
        int n = A.length;
        for(int i =1; i < n; i++){
            delete = Math.max(keep, delete + A[i]);
            keep = Math.max(keep + A[i], A[i]);
            result = Math.max(result, Math.max(delete,keep));
        }
        return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,-2,0,3};
		
		
		MaximumSumCircularSubarray maxValue = new MaximumSumCircularSubarray();
		System.out.println(maxValue.maxSubarraySumCircularOneSkip(arr));
	}

}
