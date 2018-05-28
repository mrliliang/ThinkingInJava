package com.liang.strings;

import com.liang.util.Print;

import static com.liang.util.Print.print;

public class Replacing {
    static String s = SplitString.knights;

    public static void main(String[] args) {
        print(s.replaceFirst("f\\w+", "located"));
        print(s.replaceAll("shrubbery|tree|terring", "banana"));
    }
}
