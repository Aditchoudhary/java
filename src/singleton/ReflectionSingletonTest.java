package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSingletonTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		ReflectionBreakSingleton obj1 = ReflectionBreakSingleton.getInstance();
		System.out.println(obj1.hashCode());
		ReflectionBreakSingleton obj2=null ;
		Constructor[] constructors =ReflectionBreakSingleton.class.getDeclaredConstructors();
		
		for (Constructor constructor : constructors) {
			constructor.setAccessible(true);
			obj2=(ReflectionBreakSingleton)constructor.newInstance();
			break;
		}
		
		System.out.println(obj2.hashCode());
	}

}
