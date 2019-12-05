
public class DailyTemp {
	
	public static int[] dailyTemperatures(int[] t) {
        int[] arr = new int[t.length];
        	for(int i = 0; i < t.length; i++) {
        		if(t[i] < t[i+1]) {
        			arr[i] = 1;
        		} else if(t[i] > t[i+1] ) {
        			int diff = t[i] - t[i+1];
        			arr[i] = diff;
        		}
        	}
        arr[t.length] = 0;	
        return arr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] t = {73, 74, 75, 71, 69, 72, 76, 73};
		System.out.println(dailyTemperatures(t));
		
		
	}

}
