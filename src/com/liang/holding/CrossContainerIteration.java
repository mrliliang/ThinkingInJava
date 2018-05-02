package com.liang.holding;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.*;

public class CrossContainerIteration {

    public static void display(Iterator<Pet> it) {
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Pet> pets = Pets.arrayList(8);
        LinkedList<Pet> petsLL = new LinkedList<>(pets);
        HashSet<Pet> petHS = new HashSet<>(pets);
        TreeSet<Pet> petTS = new TreeSet<>(pets);
        display(pets.iterator());
        display(petsLL.iterator());
        display(petHS.iterator());
        display(petTS.iterator());
    }
}
