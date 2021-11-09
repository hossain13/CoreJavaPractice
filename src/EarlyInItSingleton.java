// Early init singleton

public class EarlyInItSingleton {

	// private constructor 
	private EarlyInItSingleton() {};

	
	// creating an instance 
	private static final EarlyInItSingleton instance = new EarlyInItSingleton();

	// public method to access the instance 
	public static EarlyInItSingleton getInstance() {

		return instance;
	}

}
