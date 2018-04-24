package com.liang.innerclasses;

class Parcel4 {
    private class PContents implements Content {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    private class PDestination implements Destination {
        private String label;

        private PDestination(String whereTo) {
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Content content() {
        return new PContents();
    }
}

public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Content c = p.content();
        Destination d = p.destination("Tasmania");
//        Parcel4.PContents pc = p.new PContents();
    }
}
