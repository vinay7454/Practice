import java.util.HashMap;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abba";
		String pattern = "dog cat cat dog";

		Testing test = new Testing();
		System.out.println(test.wordPattern(pattern, str));
		
	}

	
	public boolean wordPattern(String pattern, String str) {
		char[] letter = str.toCharArray();
		String[] word = pattern.split(" ");

		HashMap<Character, String> map = new HashMap<Character, String>();

		if (letter.length == word.length) {
			int i = 0, j = letter.length - 1;
			//here we want to do is 
			while(i <= j) {
				if() {
				if(map.containsKey(letter[i])) {
					if(map.get(letter[i]).equals(word[i])) {
						
					} else {
						return false;
					}
				} else if(map.containsValue(word[i])) {
					return false;
				
				} else {
					map.put(letter[i], word[i]);
				}
				i++;
				j--; } else {
					return false;
				}
			}
		} else {
			return false;
		}
		return true;

	}
}
