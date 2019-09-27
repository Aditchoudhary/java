package serialization;

import java.io.IOException;

public class SubclassSerializationTest {

	public static void main(String[] args) {
		
		
		String fileName="subclassOBJs.ser";
		SubClass subclass = new SubClass();
		subclass.setName("Adit");
		subclass.setId(1);
		subclass.setValue("1000K");
		
		SerializationUtil.Serialize(subclass, fileName);
		
		
		SubClass SubClassNew = null;
		
		SubClassNew= (SubClass) SerializationUtil.deserialize(fileName);
		
		System.out.println("subclass Object::"+subclass);
		System.out.println("subclassNew Object::"+SubClassNew);
	


	}

}
