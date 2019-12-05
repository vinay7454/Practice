import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args) {
		doStuffEnemy(theEnemy);
	}
	
	
	public static void doStuffEnemy(EnemyShip anEnemyShip ) {
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
}
