package com.liang.initialization;

public class TerminationCondition {
    public static void main(String[] args) {
        Book noval = new Book(true);
        noval.checkIn();
        new Book(true);
        System.gc();
    }
}

class Book {
    boolean checkOut = false;

    Book(boolean checkOut) {
        this.checkOut = checkOut;
    }

    void checkIn() {
        checkOut = false;
    }

    @Override
    protected void finalize() throws Throwable {
        if (checkOut) {
            System.out.println("Error: checked out");
        }
        super.finalize();
    }
}
