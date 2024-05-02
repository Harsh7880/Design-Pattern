package DesignPattern.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Singleton
 */
public class Singleton {

    public static void main(String[] args) throws RuntimeException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        System.out.println("Design pattern");

        // classA firstClass = classA.getObject();
        // classA secondClass = classA.getObject();
        // System.out.println(firstClass.hashCode());
        // System.out.println(secondClass.hashCode());

        // Break Singleton Pttern with reflection API;
        classA firstObj = classA.getObject();
        System.out.println(firstObj.hashCode());

        Constructor <classA> constructor = classA.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        classA secondObj = constructor.newInstance();
        System.out.println(secondObj.hashCode());
    }
}