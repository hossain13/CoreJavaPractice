
public class SingleCheckedLockingSingleton {

	// private instance
	private static SingleCheckedLockingSingleton instance;

	// private constructor
	private SingleCheckedLockingSingleton() {
	};

	// public method to access the instance
	public static synchronized SingleCheckedLockingSingleton getInstance() {

		if (instance == null) {
			instance = new SingleCheckedLockingSingleton();
		}

		return instance;

	}

}
