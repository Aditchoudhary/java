package singleton;
/**
 * 
 * @author Adit Choudhary
 *
 */
public class LazyLoadingSingleton {

	private static LazyLoadingSingleton instance;

	private LazyLoadingSingleton() {
		
	}

	/**
	 *  this is best only for single threaded app
	 * @return
	 */
	public static LazyLoadingSingleton getInstance() {
		
		if(instance== null) {
			instance = new LazyLoadingSingleton();
		}
		
		return instance;
	}
	
}
