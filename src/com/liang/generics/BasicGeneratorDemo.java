package com.liang.generics;

import com.liang.util.BasicGenerator;
import com.liang.util.Generator;

import java.nio.channels.ClosedSelectorException;

public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
    }
}
