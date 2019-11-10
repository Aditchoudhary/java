package serialization.externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Teacher extends Human implements Externalizable {
    int salary;

    public Teacher(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public Teacher() {
        super();
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override public void writeExternal(ObjectOutput out) throws IOException {

        out.writeInt(salary);
        out.writeObject(getName() + "Check");
        out.writeInt(getAge());

    }

    @Override public void readExternal(ObjectInput in)
            throws IOException, ClassNotFoundException {

        salary = in.readInt();
        String name = (String) in.readObject();
        name = name.substring(0, name.length() - 5);
        setName(name);
        setAge(in.readInt());

    }

    @Override public String toString() {
        return "Teacher{" + "salary=" + salary + ", name='" + name + '\''
                + ", age=" + age + '}';
    }
}
