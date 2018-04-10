package com.liang.polymorphism.music;

import static com.liang.util.Print.print;

class Instrument {
    public void play(Note n) {
        print("Instrument.play()");
    }
}

public class Wind extends Instrument {
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}