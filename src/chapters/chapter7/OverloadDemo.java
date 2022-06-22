package chapters.chapter7;

public class OverloadDemo {
    public static void main(String[] args) {
        Overload overL = new Overload();
        overL.test();
        overL.test(10);
        overL.test(10, 20);
        double result = overL.test(123.25);
        System.out.println("result call method ob.test(123.25): " + result);

    }
}
