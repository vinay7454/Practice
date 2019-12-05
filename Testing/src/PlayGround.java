
public class PlayGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrA = new int[] {1,2,5,7,9,11};
		int[] arrB = new int[] {-1,0,3,4,10,11};
		int[] arrC = new int[] {-10,-2,1,2,5,8,11,13};
		
		int lenA = arrA.length;
		int lenB = arrB.length;
		int lenC = arrC.length;
		
		
		for(int i=0; i< lenA; i++) {
			for(int j=0; j < lenB; j++) {
				if(arrA[i] == arrB[j]) {
					for(int k = 0; k < lenC; k++) {
						if(arrB[j]==arrC[k]) {
							System.out.println(arrC[k]);
							break;
						}
					}
				}
			}
		}
		
	}

}
