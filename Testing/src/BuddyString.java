import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class BuddyString {

	public boolean buddyStrings(String A, String B) {
		int lenA = A.length();
		int lenB = B.length();
		if (lenA == lenB) {
			char[] arrA = A.toCharArray();
			char[] arrB = B.toCharArray();
			int[] arr = new int[2];
			for (int i = 0; i < lenA; i++) {
				if (arrA[i] != arrB[i]) {
					arr[i]=i;
					if(arr.length == 2) {
						break;
					}
				}
				if (arr.length < 3) {
					int first = arr[0];
					int second = arr[1];
					return (arrA[first] == arrB[second] && arrA[second] == arrB[first]);
				} else {
					return false;
				}

			}

		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "ab";
		String B = "ba";
		BuddyString b = new BuddyString();
		System.out.println(b.buddyStrings(A, B));
	}

}
