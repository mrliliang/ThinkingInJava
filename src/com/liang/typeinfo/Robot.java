package com.liang.typeinfo;

import com.liang.util.Null;

import java.util.List;

public interface Robot {
    String name();

    String model();

    List<Operation> operation();

    class Test {
        public static void test(Robot r) {
            if (r instanceof Null) {
                System.out.println("[Null Robot]");
            }
            System.out.println("Robot name: " + r.name());
            System.out.println("Robot model: " + r.model());
            for (Operation operation : r.operation()) {
                System.out.println(operation.description());
                operation.command();
            }
        }
    }
}
