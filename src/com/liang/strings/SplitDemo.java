package com.liang.strings;

import java.util.Arrays;
import java.util.regex.Pattern;

import static com.liang.util.Print.print;

public class SplitDemo {
    public static void main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";
        print(Arrays.toString(Pattern.compile("!!").split(input)));
        print(Arrays.toString(Pattern.compile("!!").split(input, 3)));
    }
}
