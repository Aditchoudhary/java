package serialization.inheritance;

import java.io.*;

public class MainTest {
    public static void main(String[] args)
            throws IOException, ClassNotFoundException {
        Country country = new State("India", "UP");

        FileOutputStream fileOutputStream = new FileOutputStream("inheritance");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                fileOutputStream);

        objectOutputStream.writeObject(country);

        FileInputStream fileInputStream = new FileInputStream("inheritance");
        ObjectInputStream objectInputStream = new ObjectInputStream(
                fileInputStream);
        Country country1 = (Country) objectInputStream.readObject();
        System.out.println("country1 = " + country1);
    }
}
