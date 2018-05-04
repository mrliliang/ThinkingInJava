package com.liang.holding;

import typeinfo.pets.Hamster;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;
import typeinfo.pets.Rat;

import java.util.LinkedList;

import static com.liang.util.Print.print;


public class LinkListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<>(Pets.arrayList(5));
        print(pets);

        print("pets.getFirst(): " + pets.getFirst());
        print("pets.element(): " + pets.element());
        print("pets.peek(): " + pets.peek());

        print("pets.remove(): " + pets.remove());
        print("pets.removeFirst(): " + pets.removeFirst());
        print("pets.poll(): " + pets.poll());
        print(pets);

        pets.addFirst(new Rat());
        print("After addFirst(): " + pets);

        pets.offer(Pets.randomPet());
        print("After offer(): " + pets);

        pets.add(Pets.randomPet());
        print("After add(): " + pets);

        pets.addLast(new Hamster());
        print("After addLast(): " + pets);

        print("pets.removeLast(): " + pets.removeLast());
    }
}
