//Double-Checked Locking Singleton
public class DoubleCheckedLockingSingleton {

//private instance
	private static DoubleCheckedLockingSingleton instance;

//private constructor 
	private DoubleCheckedLockingSingleton() {
	};

// public Method to access the instance 

	public static DoubleCheckedLockingSingleton getInstance() {

		if (instance == null) {
			synchronized (DoubleCheckedLockingSingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckedLockingSingleton();
				}
			}
		}

		return instance;
	}

}