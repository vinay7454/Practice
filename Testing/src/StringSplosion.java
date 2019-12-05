
public class StringSplosion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Code";
		
		String newStr = "";
		
		for(int i = 0; i <= str.length(); i++) {
				newStr += str.substring(0, i);
		}
		
		System.out.println(newStr);
	}

}
