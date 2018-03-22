package com.liang.initialization;

import com.liang.util.Print;

import java.util.Arrays;
import java.util.Random;

public class ArrayNew {
    public static void main(String[] args) {
        int[] a;
        Random rand = new Random();
        a = new int[rand.nextInt(20)];
        Print.print("length of a = " + a.length);
        Print.print(Arrays.toString(a));
    }
}
