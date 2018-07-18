package com.liang.generics;

import java.util.ArrayList;
import java.util.List;

class FruitExtend extends Fruit {

}

public class GenericsAndCovariance {
    public static void main(String[] args) {
        List<? extends Fruit> flist = new ArrayList<Apple>();
//        flist.add(new Apple());
//        flist.add(new Fruit());
//        flist.add(new Object());
        flist.add(null);

        Fruit f = flist.get(0);
    }
}
