package serialization;

import java.io.IOException;

public class DeserializationTest {

	public static void main(String[] args) {
		String fileName="employee.txt";
		
		
		Employee empNew = null;
		
			empNew = (Employee) SerializationUtil.deserialize(fileName);
		
		
		System.out.println("empNew Object::"+empNew);
	


	}

}
