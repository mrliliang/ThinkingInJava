package com.liang.interfaces.interfaceprocessor;

import java.util.Arrays;

public abstract class StringProcessor implements Processor {
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    public abstract Object process(Object input);

    public static String s = "If she weighs the same as a duck. she's made of wood";

    public static void main(String[] args) {
        Apply.process(new Upcase(), s);
        Apply.process(new Downcase(), s);
        Apply.process(new Splitter(), s);
    }
}

class Upcase extends StringProcessor {

    @Override
    public Object process(Object input) {
        return ((String)input).toUpperCase();
    }
}

class Downcase extends StringProcessor {

    @Override
    public Object process(Object input) {
        return ((String)input).toLowerCase();
    }
}

class Splitter extends StringProcessor {

    @Override
    public Object process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}
