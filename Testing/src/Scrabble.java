import java.util.LinkedList;

public class Scrabble {
	
	public static void main(String[] args) {
		
		SingletonPattern newInstance = SingletonPattern.getInstance();
		System.out.println("Instance 1 Id : " + System.identityHashCode(newInstance));
		
		System.out.println(newInstance.getLetterList());
		
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		System.out.println("Player 1 : " + playerOneTiles);
		
		System.out.println(newInstance.getLetterList());
		
		SingletonPattern instanceTwo = SingletonPattern.getInstance();
		System.out.println("Instance 2 Id : " + System.identityHashCode(instanceTwo));
		
		System.out.println(newInstance.getLetterList());
		
		LinkedList<String> playerTwoTiles = newInstance.getTiles(7);
		System.out.println("Player 2 : " + playerTwoTiles);
		
		
	}
}
