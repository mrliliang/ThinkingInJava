package com.liang.generics;

import java.util.List;

interface superPower {}

interface XRayVision extends superPower {
    void seeThroughWalls();
}

interface SuperHearing extends superPower {
    void hearSubtleNoises();
}

interface SuperSmell extends superPower {
    void trackBySmell();
}

class SuperHero<POWER extends superPower> {
    POWER power;

    SuperHero(POWER power) {
        this.power = power;
    }

    POWER getPower() {
        return power;
    }
}

class SuperSleuth<POWER extends XRayVision> extends SuperHero<POWER> {
    SuperSleuth(POWER power) {
        super(power);
    }

    void see() {
        power.seeThroughWalls();
    }
}

class CanineHero<POWER extends SuperHearing & SuperSmell> extends SuperHero<POWER> {
    CanineHero(POWER power) {
        super(power);
    }

    void hear() {
        power.hearSubtleNoises();
    }

    void smell() {
        power.trackBySmell();
    }
}

class SuperHearSmell implements SuperHearing, SuperSmell {
    @Override
    public void hearSubtleNoises() {

    }

    @Override
    public void trackBySmell() {

    }
}

class DogBoy extends CanineHero<SuperHearSmell> {
    DogBoy() {
        super(new SuperHearSmell());
    }
}

public class EpicBattle {
    static <POWER extends SuperHearing> void useSuperHearing(SuperHero<POWER> hero) {
        hero.getPower().hearSubtleNoises();
    }

    static <POWER extends SuperHearing & SuperSmell> void superFind(SuperHero<POWER> hero) {
        hero.getPower().hearSubtleNoises();
        hero.getPower().trackBySmell();
    }

    public static void main(String[] args) {
        DogBoy dogBoy = new DogBoy();
        superFind(dogBoy);
        List<? extends SuperHearing> audioBoys;
//        List<? extends SuperHearing & SuperSmell> dogBoys;
    }
}
