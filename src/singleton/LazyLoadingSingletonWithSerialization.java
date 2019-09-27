package singleton;

import java.io.Serializable;

/**
 * 
 * @author Adit Choudhary
 *
 */
public class LazyLoadingSingletonWithSerialization implements Serializable,Cloneable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2991472458958210032L;
	
	private static LazyLoadingSingletonWithSerialization instance;

	private LazyLoadingSingletonWithSerialization() {
		
	}

	/**
	 *  this is best only for single threaded app
	 * @return
	 */
	public static LazyLoadingSingletonWithSerialization getInstance() {
		
		if(instance== null) {
			instance = new LazyLoadingSingletonWithSerialization();
		}
		
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return getInstance();
	
	}
	
	
	
	protected Object readResolve() {
		return getInstance();
	}
}
