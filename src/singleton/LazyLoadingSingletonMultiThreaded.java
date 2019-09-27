package singleton;
/**
 * 
 * @author Adit Choudhary
 *
 */
public class LazyLoadingSingletonMultiThreaded {

	private static LazyLoadingSingletonMultiThreaded instance;

	private LazyLoadingSingletonMultiThreaded() {
		
	}

	/**
	 *  this is for Multi Threaded Environment
	 *  but degrades the performance 
	 * @return
	 */
	public synchronized static  LazyLoadingSingletonMultiThreaded getInstance() {
		
		if(instance== null) {
			instance = new LazyLoadingSingletonMultiThreaded();
		}
		
		return instance;
	}
	
}
