package modifier;

public class Modfier2 {
	
	
	public static void method(){

	AccessModifier accessModifier = new AccessModifier();
	
	//System.out.println(accessModifier.name);
	//The field AccessModifier.name is not visible
	
	System.out.println(accessModifier.publicname);
	//The field accessModifier.publicname is visible
	
	System.out.println(accessModifier.getDefaultname());
	
	System.out.println(accessModifier.getPublicname());
	}
}
