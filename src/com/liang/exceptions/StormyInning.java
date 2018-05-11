package com.liang.exceptions;


import com.sun.xml.internal.ws.api.ha.StickyFeature;

class BaseballException extends Exception {}

class Foul extends BaseballException {}

class Strike extends BaseballException {}

abstract class Inning {
    public Inning() throws BaseballException {}

    public void event() throws BaseballException {

    }

    public abstract void atBat() throws Strike, Foul;

    public void walk() {}
}

class StormException extends Exception {}

class RainedOut extends StormException {}

class PopFoul extends Foul {}

interface Storm {
    void event() throws RainedOut, BaseballException;

    void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm {

    public StormyInning() throws RainedOut, BaseballException {

    }
//
    public StormyInning(String s) throws Foul, BaseballException {

    }

//    public void walk() throws PopFoul {}

//    public void event() throws RainedOut {}


    @Override
    public void atBat() throws PopFoul {

    }

    @Override
    public void rainHard() throws RainedOut {

    }

    @Override
    public void event() {

    }


    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        } catch (PopFoul popFoul) {
            System.out.println("Pop foul");
        } catch (RainedOut rainedOut) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }


        try {
            Inning in = new StormyInning();
            in.atBat();
        } catch (Strike e) {
            System.out.println("Strike");
        } catch (Foul e) {
            System.out.println("Foul");
        } catch (RainedOut rainedOut) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }
    }

}