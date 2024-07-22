package class1;

import java.lang.reflect.Array;

public class Datatypes {

    // Primitive types
    byte b;
    int i;
    short s;
    double d;
    long l;
    float f;
    char ch;
    boolean bool;


    // Non primitive Types
    String string;
    int[] arr = {1, 2, 3, 4, 5};

    class Person {
        String name;
        int age;
    }

    interface Animal {
        void makeSound();
    }

    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    Day today = Day.MONDAY;


}
