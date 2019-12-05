import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

public class CorpFlightbooking {

	public static int[] corpFlightBookings(int[][] bookings, int n) {
		int[] ans = new int[n];
        for(int[] booking : bookings) {
            int startFlight = booking[0];
            int endFlight = booking[1];
            int seatsBooked = booking[2];
            
            for(int i = startFlight; i<=endFlight; i++) {
                ans[i-1] += seatsBooked;
            }
        }
        
        	
        	for(int j : ans) {
        		System.out.println(j);
        	}
        	return ans;
        }
        
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] bookings = {{1,2,10},{2,3,20},{6,7,25}};
		int n = 5;
		//corpFlightBookings(bookings, n);
		
		
		String name = "Vinay";
		char[] ltr = name.toCharArray();
	}

}
