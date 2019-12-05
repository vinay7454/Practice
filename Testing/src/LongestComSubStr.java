
public class LongestComSubStr {
	//this is topDown approach
	public int findLCSLength(String s1, String s2) {
		if(s1.length() == 0 || s2.length() == 0 ) {
			return 0;
		}
		
		String s1WithoutFinalChar = s1.substring(0, s1.length()-1);
		String s2WithoutFinalChar = s2.substring(0, s2.length()-1);
		
		char s1FinalChar = s1.charAt(s1.length()-1);
		char s2FinalChar = s2.charAt(s2.length()-1);
		
		if(s1FinalChar == s2FinalChar) {
			return 1 + findLCSLength(s1WithoutFinalChar, s2WithoutFinalChar);
		} else {
			return Math.max(findLCSLength(s1, s2WithoutFinalChar), findLCSLength(s1WithoutFinalChar, s2));
		}
		
	}

	public static void main(String[] args) {
		LongestComSubStr lcs = new LongestComSubStr();
		System.out.println(lcs.findLCSLength("abdca", "cbda"));
		System.out.println(lcs.findLCSLength("passport", "ppsspt"));
		}

}
