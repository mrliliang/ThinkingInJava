package com.liang.typeinfo.toys;

import static com.liang.util.Print.print;

interface HasBatteries {}

interface Waterproof {}

interface Shoots {}

class Toy {
    Toy() {

    }

    Toy(int i) {

    }
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
    FancyToy() {
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class cc) {
        print("Class name: " + cc.getName() + " is interfacea? [" + cc.isInterface() + "]");
        print("Simple name: " + cc.getSimpleName());
        print("Canoncial name " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("com.liang.typeinfo.toys.FancyToy");
        } catch (ClassNotFoundException e) {
            print("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        print();

        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }
        print();

        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            print("Can't instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            print("Can't access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}
