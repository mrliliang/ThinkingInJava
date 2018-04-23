package com.liang.interfaces.nesting;


class A {
    interface B {
        void f();
    }

    public class BImpl implements B {
        public void f() {

        }
    }

    private class BImpl2 implements B {
        public void f() {

        }
    }

    public interface C {
        public void f();
    }

    class CImpl implements C {
        public void f() {

        }
    }

    private interface D {
        void f();
    }

    private class DImpl implements D {
        public void f() {

        }
    }

    public class DImpl2 implements D {
        public void f() {

        }
    }

    public D getD() {
        return new DImpl2();
    }

    private D dRef;
    public void receiveD(D d) {
        dRef = d;
        dRef.f();
    }
}

interface E {
    interface G {
        void f();
    }

    public interface H {
        void f();
    }

    void g();

//    private interface I { }
}

public class NestingInterfaces {
    public class BImp implements A.B {
        @Override
        public void f() {

        }
    }

    class CImp implements A.C {
        @Override
        public void f() {

        }
    }

//    class DImp implements A.D {
//        public void f() {
//
//        }
//    }

    class EImp implements E {
        @Override
        public void g() {

        }
    }

    class EGImp implements E.G {
        @Override
        public void f() {

        }
    }

    class EImp2 implements E {
        @Override
        public void g() {

        }
    }

    public static void main(String[] args) {
        A a = new A();
//        A.D ad = a.getD();
//        A.DImpl2 di2 = a.getD();
//        a.getD().f();
        A a2 = new A();
        a2.receiveD(a.getD());
    }
}
