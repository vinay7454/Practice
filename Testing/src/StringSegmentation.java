import java.util.HashSet;
import java.util.Set;

public class StringSegmentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> dict = new HashSet<String>();
	    String s = new String();
	    s = "applepie";

	    dict.add("pie");
	    dict.add("pear");
	    dict.add("apple");
	    dict.add("peach");

	    System.out.println("Result = " + can_segment_string(s, dict));

	}

	private static boolean can_segment_string(String s, Set<String> dict) {
		for(int i = 0; i < s.length(); i++) {
			if(dict.contains(s.substring(0, i))) {
				String second = s.substring(i);
				if(second == null || second.length() == 0 || dict.contains(second) || can_segment_string(second, dict)) {
					return true;
				}
			}
		}
		return false;
	}

}
