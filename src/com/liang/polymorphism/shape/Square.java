package com.liang.polymorphism.shape;

import static com.liang.util.Print.print;

public class Square extends Shape {
    public void draw() {
        print("Square.draw()");
    }

    public void erase() {
        print("Square.erase()");
    }
}
