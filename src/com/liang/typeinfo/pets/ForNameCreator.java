package com.liang.typeinfo.pets;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {

    private static List<Class<? extends Pet>> types = new ArrayList<>();
    private static String[] typeNames = {
      "com.liang.typeinfo.pets.Mutt",
      "com.liang.typeinfo.pets.Pug",
      "com.liang.typeinfo.pets.EgyptianMau",
      "com.liang.typeinfo.pets.Manx",
      "com.liang.typeinfo.pets.Cymric",
      "com.liang.typeinfo.pets.Rat",
      "com.liang.typeinfo.pets.Mouse",
      "com.liang.typeinfo.pets.Hamster",
    };

    private static void loader() {
        for (String name : typeNames) {
            try {
                types.add((Class<? extends Pet>)Class.forName(name));
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static {
        loader();
    }

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}
