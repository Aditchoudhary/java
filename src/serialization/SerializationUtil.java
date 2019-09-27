package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializationUtil {

	/**
	 * Serialisation 
	 * @param obj
	 * @param fileName
	 */
	public static void Serialize(Object obj, String fileName)   {
	
		try(FileOutputStream fileOutputStream = new FileOutputStream(fileName))
		{
		ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
		oos.writeObject(obj);
		}catch(FileNotFoundException fne) {
			System.out.println(fne.getMessage());
		}catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		
	}
	
	public static Object deserialize(String filename) {
		
		Object obj= new Object();
		
		try(FileInputStream fis = new FileInputStream(filename)){
			ObjectInputStream ois = new ObjectInputStream(fis);
			 obj = ois.readObject();
			
		}catch(FileNotFoundException fne) {
			System.out.println(fne.getMessage());
		}catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return obj;
		
	}
	
	
}
