package singleton;
/**
 * 
 * @author Adit Choudhary
 *
 */
public class EagerLoadingSingeton {

	private static EagerLoadingSingeton instance;
	
	static {
		instance = new  EagerLoadingSingeton();
	}
	
	private EagerLoadingSingeton() {
		
	}


	public static EagerLoadingSingeton getInstance() {
		return instance;
	}
}
