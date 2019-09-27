package singleton;

/**
 * 
 * @author Adit Choudhary
 *
 */
public class LazyLoadingSingletonMultiThreaded2Locking {

	private static LazyLoadingSingletonMultiThreaded2Locking instance;

	private LazyLoadingSingletonMultiThreaded2Locking() {

	}

	/**
	 * this is for Multi Threaded Environment will not degrades the performance 
	 * 
	 * @return
	 */
	public static LazyLoadingSingletonMultiThreaded2Locking getInstance() {
		
		if (instance == null) {
			
			synchronized (LazyLoadingSingletonMultiThreaded2Locking.class) {
				if (instance == null) {
					instance = new LazyLoadingSingletonMultiThreaded2Locking();
				}

			}
		}
		return instance;
	}

}
