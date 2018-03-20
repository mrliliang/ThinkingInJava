package com.liang.initialization;

import com.liang.util.Print;

public class InitialValues {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitialValues reference;

    void printInitialValues() {
        Print.print("Data type           Initial value");
        Print.print("boolean             " + t);
        Print.print("char                [" + c + "]");
        Print.print("byte                " + b);
        Print.print("short               " + s);
        Print.print("int                 " + i);
        Print.print("long                " + l);
        Print.print("float               " + f);
        Print.print("reference           " + reference);
    }

    public static void main(String[] args) {
        InitialValues iv = new InitialValues();
        iv.printInitialValues();
    }
}
