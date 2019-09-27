package singleton;
/**
 * 
 * @author Adit Choudhary
 *
 */
public enum EnumSingleton {

	instance; 
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
