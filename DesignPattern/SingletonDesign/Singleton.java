package DesignPattern.SingletonDesign;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Singleton
 */
public class Singleton {

    public static void main(String[] args) throws RuntimeException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, FileNotFoundException, IOException, ClassNotFoundException, CloneNotSupportedException {
        System.out.println("Design pattern");

        classA firstClass = classA.getObject();
        classA secondClass = classA.getObject();
        System.out.println(firstClass.hashCode());
        System.out.println(secondClass.hashCode());

        // Break Singleton Pttern with reflection API;
        classA firstObj = classA.getObject();
        System.out.println(firstObj.hashCode());

        Constructor <classA> constructor = classA.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        classA secondObj = constructor.newInstance();
        System.out.println(secondObj.hashCode());

        // Break singleton pattern with Desserlization 
        classA obj1 = classA.getObject();
        System.out.println(obj1.hashCode());

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bac.ob"));
        oos.writeObject(obj1);
        System.out.println("Serialization Done");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bac.ob"));
        classA obj2 = (classA) ois.readObject();
        System.out.println(obj2.hashCode());


        // Break Singleton Pattern with cloning
        classA obj3 = classA.getObject();
        System.out.println(obj3.hashCode());

        classA obj4 =  (classA) obj1.clone();
        System.out.println(obj4.hashCode());
        

    }
}