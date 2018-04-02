package com.liang.access.dessert;

public class CookieExtend extends Cookie {
    public CookieExtend() {
        System.out.println("ChocolateChip constructor");
    }

    public void chomp() {
        bite();
    }

    public static void main(String[] args) {
        CookieExtend x = new CookieExtend();
        x.chomp();

        Cookie cookie = new Cookie();
        cookie.bite();

//        Soup2.access();
//        Soup1.makeSoup();
    }
}
