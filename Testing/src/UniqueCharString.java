import java.util.HashMap;
import java.util.HashSet;

public class UniqueCharString {
	
	public boolean isUnique(char[] arr) {
		HashSet<Character> set = new HashSet<Character>();
		for(char c : arr) {
			if(set.contains(c)) {
				return false;
			} else {
				set.add(c);
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Vinaya";
		char[] arr = name.toCharArray();
		UniqueCharString ur = new UniqueCharString();
		System.out.println(ur.isUnique(arr));
		
		
		
	}

}
