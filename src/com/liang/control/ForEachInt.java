package com.liang.control;

        import static com.liang.util.Print.print;
        import static com.liang.util.Print.printnb;
        import static com.liang.util.Range.range;

public class ForEachInt {
    public static void main(String[] args) {
        for (int i : range(10)) {
            printnb(i + " ");
        }
        print();
        for (int i : range(5, 10)) {
            printnb(i + " ");
        }
        print();
        for (int i : range(5, 20, 3)) {
            printnb(i + " ");
        }
        print();
    }
}
