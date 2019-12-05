import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class SingletonPattern {
	
	private static SingletonPattern firstnstance = null;
	
	String[] scrabbleLetters = {"a", "a", "a", "a", "a", "a", "a", "a", "a",
			"b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e", 
			"e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h", 
			"h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l", 
			"l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o", 
			"o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r", 
			"r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u", 
			"u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z",};
	
	private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));
	
	static boolean firstThread = true;
	
	private SingletonPattern() { }
	
	public static SingletonPattern getInstance() {
		if(firstnstance == null) {
		
			if(firstThread) {
				firstThread = false;
				
				Thread.currentThread();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			firstnstance = new SingletonPattern();
			
			Collections.shuffle(firstnstance.letterList	);
			
		}
		return firstnstance;
	}
	
	public LinkedList<String> getLetterList(){
		return firstnstance.letterList;
	}
	
	public LinkedList<String> getTiles(int howManyTiles){
		LinkedList<String> tilesToSend = new LinkedList<String>();
		for(int i = 0; i < howManyTiles; i++) {
			tilesToSend.add(firstnstance.letterList.remove(0));
		}
		return tilesToSend;
	}
	
}
