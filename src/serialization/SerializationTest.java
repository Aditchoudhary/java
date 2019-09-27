package serialization;

import java.io.IOException;

public class SerializationTest {

	public static void main(String[] args) {
		
		
		String fileName="employee.txt";
		Employee emp = new Employee();
		emp.setAge(100);
		emp.setName("Adit");
		emp.setSalary(5000);
		
		SerializationUtil.Serialize(emp, fileName);
		
		
		Employee empNew = null;
		
			empNew = (Employee) SerializationUtil.deserialize(fileName);
			
			
		System.out.println("emp Object::"+emp);
		System.out.println("empNew Object::"+empNew);
	


	}

}
