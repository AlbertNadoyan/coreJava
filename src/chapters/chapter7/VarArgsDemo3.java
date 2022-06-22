package chapters.chapter7;

import static chapters.chapter7.VarArgs3.vaTest;

public class VarArgsDemo3 {
    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("test: ", 10, 20);
        vaTest(true, false, false);
    }
}
