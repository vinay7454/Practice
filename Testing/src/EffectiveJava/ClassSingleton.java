package EffectiveJava;

public class ClassSingleton {

	private static ClassSingleton instance = null;
	
	//we make this private so that no other class can call public constructor and make instances
	private ClassSingleton() {
	}
	
	
	public static ClassSingleton getInstance() {
		if(instance == null) {
			instance = new ClassSingleton();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getInstance();
		test();
		
	}
	
	public static void test() {
		getInstance();
	}
	

}
