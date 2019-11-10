package serialization.inheritance;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class State extends Country implements Serializable {
    String stateName;

    public State() {
        super();
    }

    public State(String name, String stateName) {
        super(name);
        this.stateName = stateName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    private void readObject(ObjectInputStream ois)
            throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        setName((String) ois.readObject());

    }

    private void writeObject(ObjectOutputStream oos)
            throws IOException, ClassNotFoundException {

        oos.defaultWriteObject();
        oos.writeObject(getName());
    }

    @Override public String toString() {
        return "State{" + "stateName='" + stateName + '\'' + ", name='" + name
                + '\'' + '}';
    }
}
