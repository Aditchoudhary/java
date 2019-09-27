package singleton;

import serialization.SerializationUtil;

public class SingletonSerializationTest {

    public static void main(String[] args) {

        LazyLoadingSingletonWithSerialization obj1 =
            LazyLoadingSingletonWithSerialization.getInstance();

        LazyLoadingSingletonWithSerialization obj2 =
            LazyLoadingSingletonWithSerialization.getInstance();
        try {
            obj2.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        String filename = "singleton";

        SerializationUtil.Serialize(obj1, filename);
        System.out.println("obj1-> " + obj1.hashCode());
        System.out.println("obj2-> " + obj2.hashCode());

        LazyLoadingSingletonWithSerialization obj1new = (LazyLoadingSingletonWithSerialization) SerializationUtil.deserialize(filename);
        System.out.println("obj1new -> " + obj1new.hashCode());

    }


}
