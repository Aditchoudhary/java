package singleton;
/**
 * 
 * @author Adit Choudhary
 *
 */
public class LazyLoadingBestPractice {

/** Inner Class Loads at the time of getInstance call 
 * and
 * Loads the singleton Object
 * also work fine for multi-threaded environment 
 * 
 *
 */
	private static class SingletonHelper{
		private static final LazyLoadingBestPractice instance=
				new LazyLoadingBestPractice();
	}
	
	private LazyLoadingBestPractice() {
		
	}


	public static LazyLoadingBestPractice getInstance() {
		return SingletonHelper.instance;
	}
}
