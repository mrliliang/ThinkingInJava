package com.liang.demo;

import java.util.Formatter;

public class Demo {
    public static void main(String[] args) {
        byte[] bytes = {0x20, 0x20, 0x20};
        System.out.println("x" + new String(bytes) + "x");
        System.out.println(String.format("%012d", 0));

        Formatter f = new Formatter(System.out);
        f.format("%02X", 10);
    }
}
