package equalsHash;

import java.util.Date;

public class EqualHashCompare {

	public static void main(String[] args) {

	}
}

class Person implements Comparable<Person> {

	private int age;
	private String name;
	private Date dob;

	public Person(int age, String name, Date dob) {
		super();
		this.age = age;
		this.name = name;
		this.dob = dob;
	}

	@Override
	public int hashCode() {
		final int prime = 37;
		int result = 1;

		result = prime * result + age;
		result = prime * result + (dob == null ? 0 : dob.hashCode());
		result = prime * result + (name == null ? 0 : name.hashCode());

		return result;

	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null || this.getClass() != obj.getClass())
			return false;

		if (this == obj)
			return true;

		Person p = (Person) obj;
		if (age == p.age && (p.name != null && name.equals(p.name)) && (p.dob != null && dob.equals(p.dob))) {
			return true;
		}

		return false;
	}
	
	/**
	 * Comapare on basics of Age,name. 
	 */
	@Override
	public int compareTo(Person o) {
		if(this.age>o.age)
			return 1;
		else if (this.age<o.age) {
			return -1;
		}else if(this.name.length()>o.name.length())
		{// Heres age is same. we compare on length of name now
			return 1;
		}
		return 0;
	}

}