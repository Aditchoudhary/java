package singleton;
/**
 * 
 * @author Adit Choudhary
 *
 */
public class ReflectionBreakSingleton {

	private static ReflectionBreakSingleton instance;

	private ReflectionBreakSingleton() {
		
	}

	/**
	 *  this is best only for single threaded app
	 * @return
	 */
	public static ReflectionBreakSingleton getInstance() {
		
		if(instance== null) {
			instance = new ReflectionBreakSingleton();
		}
		
		return instance;
	}
	
}
