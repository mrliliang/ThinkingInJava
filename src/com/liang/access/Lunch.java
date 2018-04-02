package com.liang.access;

public class Lunch {
    void testPrivate() {
//        Soup1 soup = new Soup1();
    }

    void testStatic() {
        Soup1 soup = Soup1.makeSoup();
    }

    void testSingleton() {
        Soup2.access().f();
    }
}

class Soup1 {
    private Soup1() {

    }

    public static Soup1 makeSoup() {
        return new Soup1();
    }
}

class Soup2 {
    public static Soup2 ps = new Soup2();
    private static Soup2 ps1 = new Soup2();

    public static Soup2 access() {
        return ps1;
    }

    public void f() {

    }
}
