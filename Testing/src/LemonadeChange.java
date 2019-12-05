import java.util.Arrays;

public class LemonadeChange {

	public static boolean lemonadeChange(int[] bills) {
		// we want to keep count of how many notes we have of 5's
		int count5 = 0, count10 = 0;
		for (int i = 0; i < bills.length; i++) {
			if (bills[i] == 5) {
				count5++;
			} else if (bills[i] == 10) {
				count5--;
				count10++;
			} else if (bills[i] == 20) {
				if (count10 >= 1 && count5 >= 1) {
					count10--;
					count5--;
				} else if (count5 >= 3) {
					count5--;
					count5--;
					count5--;
				} else {
					count5--;
					count5--;
					count5--;
					break;
				}
			}
		}
		if (count5 >= 0) {
			return true;
		} else {
			return false;
		}
	}	
	
	public static int findContentChildren(int[] g, int[] s) {
		final int childCount = g.length;
	    final int cookiesCount = s.length;

	    Arrays.sort(g);
	    Arrays.sort(s);
	    
	    int result = 0;
	    for (int i = 0, j = 0; i < cookiesCount && j < childCount; i++) {
	        final int cookieSize = s[i];

	        if (g[j] > cookieSize) continue; // greed of child j is bigger than current cookie size.
	        // child j can be content with current cookie.
	        result++;
	        j++;

	    }
	    return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] bills = {5,5,5,10,20};
		//System.out.println(lemonadeChange(bills));
		
		int[] g = {1,2,3};
		int[] s = {7,9,10};
		System.out.println(findContentChildren(g, s));

	}

}
