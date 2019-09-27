package serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID;

public class SubClass extends SuperClass implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2602966255131607334L;

	private String Value;

	public String getValue() {
		return Value;
	}

	public void setValue(String value) {
		Value = value;
	}
	
	@Override
	public String toString() {
		return "SubClass [Value=" + Value  + ", Name= " + getName() + ", Id ="
				+ getId() + "]";
	}

	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();

		setId(ois.readInt());
		setName((String)ois.readObject());
		
	}
	
	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		
		oos.writeInt(getId());
		oos.writeObject(getName());
	}
	
	
}
