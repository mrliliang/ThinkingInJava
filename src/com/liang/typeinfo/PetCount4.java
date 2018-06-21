package com.liang.typeinfo;

import com.liang.typeinfo.pets.Pet;
import com.liang.typeinfo.pets.Pets;
import com.liang.util.TypeCounter;

import static com.liang.util.Print.print;
import static com.liang.util.Print.printnb;

public class PetCount4 {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for (Pet pet : Pets.creatArray(20)) {
            printnb(pet.getClass().getSimpleName() + " ");
            counter.count(pet);
        }
        print();
        print(counter);
    }
}
