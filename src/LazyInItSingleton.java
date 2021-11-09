//Lazy init Singleton
public class LazyInItSingleton {

	// private instance
	private static LazyInItSingleton instance;

	// private constructor 
	private LazyInItSingleton() {};

	
	//public method to access the instance 
	public static LazyInItSingleton getInstance() {

		if (instance == null) {
			instance = new LazyInItSingleton();
		}
		return instance;
	};

}

