package serialization.externalizable;

import java.io.*;

public class MainClass {
    public static void main(String[] args)
            throws FileNotFoundException, IOException, ClassNotFoundException {

        Human human = new Teacher("Khurana", 30, 500000);
        FileOutputStream fileOutputStream = new FileOutputStream("fileName");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                fileOutputStream);
        objectOutputStream.writeObject(human);

        FileInputStream fileInputStream = new FileInputStream("fileName");
        ObjectInputStream objectInputStream = new ObjectInputStream(
                fileInputStream);
        Human readhuman = (Human) objectInputStream.readObject();
        System.out.println("readhuman = " + readhuman);

    }

}
