package chapters.chapter8.test1;

public class Simpleinheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Content superOb: ");
        superOb.showij();
        System.out.println();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Content subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("Sum is i, j, k in object subOb: ");
        subOb.sum();
    }
}
