package com.liang.polymorphism.shape;

import static com.liang.util.Print.print;

public class Triangle extends Shape {
    public void draw() {
        print("Triangle.draw()");
    }

    public void erase() {
        print("Triangle.erase()");
    }
}
