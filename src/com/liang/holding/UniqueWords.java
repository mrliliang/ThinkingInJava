package com.liang.holding;

import net.mindview.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(new TextFile("src/com/liang/holding/SetOperation.java", "\\W+"));
        System.out.println(words);
    }
}
