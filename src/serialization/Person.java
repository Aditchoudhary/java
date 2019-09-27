package serialization;

import java.io.Serializable;

public class Person implements Serializable {

	/** 
	 * this UID is same as in employee
	 */
												 
	private static final long serialVersionUID = 8343055374288715118L;
	
	private String name;
	private int age;
	transient private int salary;
	
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", salary=" + salary + ", id=" + id + "]";
	}
	
	
	
}
