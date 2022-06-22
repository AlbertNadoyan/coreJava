package chapters.chapter7;

import static chapters.chapter7.VarArgs.vaTest;

public class VarArgsDemo {
    public static void main(String[] args) {
        vaTest(10);
        vaTest(1,2,3);
        vaTest();
    }
}
