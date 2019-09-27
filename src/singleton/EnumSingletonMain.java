package singleton;
/**
 * 
 * @author Adit Choudhary
 *
 */
public class EnumSingletonMain {

	public static void main(String args[]) {
		EnumSingleton obj = EnumSingleton.instance;
		
		obj.setName("Adit");
		System.out.println(obj.getName());
		obj.setName("Adit Choudhary");
		System.out.println(obj.getName());
	}
	
}
