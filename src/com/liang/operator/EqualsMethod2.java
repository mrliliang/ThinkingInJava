package com.liang.operator;

import static com.liang.util.Print.print;

public class EqualsMethod2 {
    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        print(v1.equals(v2));
    }
}

class Value {
    int i;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof Value) {
            Value other = (Value)obj;
            return this.i == other.i;
        }

        return false;
    }
}
