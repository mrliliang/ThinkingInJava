package com.liang.typeinfo.packageaccess;


import com.liang.typeinfo.interfacea.A;

import static com.liang.util.Print.print;

class C implements A {
    @Override
    public void f() {
        print("public c.f()");
    }

    public void g() {
        print("public c.g()");
    }

    void u() {
        print("package C.u()");
    }

    protected void v() {
        print("protected C.v()");
    }

    private void w() {
        print("private C.w()");
    }
}

public class HiddenC {
    public static A makeA() {
        return new C();
    }
}
