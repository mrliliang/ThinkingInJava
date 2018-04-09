package com.liang.reusing;

import static com.liang.util.Print.print;

class WithFinals {
    private void f() {
        print("WithFinals.f()");
    }

    private void g() {
        print("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals {
    private final void f() {
        print("OverridingPrivate.f()");
    }

    private void g() {
        print("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {
    public final void f() {
        print("OverridingPrivate2.f()");
    }

    public void g() {
        print("OverridingPrivate2.g()");
    }
}

public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();

        OverridingPrivate op = op2;
//        op.f();

        WithFinals wf = op2;
//        wf.f();
//        wf.g();
    }
}
