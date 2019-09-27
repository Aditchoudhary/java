package immutable;

import java.util.Date;
/**
 * @refernce https://javaranch.com/journal/2003/04/immutable.htm
 * @author aditm
 *
 */
public class Immutable {

	public static void main(String[] args) {
		
		Date AdjustAge = new Date();
		
		User user = new User(20, "Adit", AdjustAge);
		
		int i = user.getAge();
		System.out.println(user.getAge()+1);
		
		int age = user.getAge();
		age++;
		System.out.println(user.getAge());
		
		AdjustAge.setYear(new Date().getYear()+2);
		
		
		Date newDate = user.getDob();
		newDate.setMonth(newDate.getMonth()+1);
		
		System.out.println(user.getDob());
	}

}


final class User{
	
	final private int age;
	final private String name;
	final private Date dob;
	
	public User(int age, String name, Date dob) {
		super();
		this.age = age;
		this.name = name;
		this.dob = new Date(dob.getTime());
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public Date getDob() {
//		return new Date(dob.getTime());
		return (Date)dob.clone();
	}
		
}