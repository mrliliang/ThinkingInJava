package com.liang.generics;

import com.liang.typeinfo.Person;
import com.liang.typeinfo.pets.Pet;
import com.liang.util.New;

import java.util.List;
import java.util.Map;

public class LimitsOfInference {
    static void f(Map<Person, List<? extends Pet>> petPeople) {

    }

    public static void main(String[] args) {
        f(New.map());
    }
}
