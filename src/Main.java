import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Person s = new Person("", 1);

        try {
            s.printClassLoaders();
        } catch (Exception e) {

        }
    }

    private static void setting(Person p) {
        System.out.println(p);
        System.out.println("p = " + p.hashCode());
        p.name = "장원익";
        p.age = 20;
    }
}

class Person {
    String name;
    Integer age;

    public void printClassLoaders() throws ClassNotFoundException {

        System.out.println("Main of this class:"
                + Main.class.getClassLoader());

        System.out.println("Classloader of ArrayList:"
                + ArrayList.class.getClassLoader());
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}