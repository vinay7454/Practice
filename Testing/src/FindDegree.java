
public class FindDegree {

	
	public static int returnDegree(int hr, int min) {
		int degree;
		hr = Math.abs(hr);
		min = Math.abs(min);
		
		if(hr == 0) {
			degree = 360/(60/min);
		} else if (min == 0) {
			degree = Math.abs(30*hr - 360);
		} else {
			degree = Math.abs(30*hr + (30/(60/min))- (360/(60/min))) ;
		}
		
		return degree;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(returnDegree(10, 1));
	}

}
