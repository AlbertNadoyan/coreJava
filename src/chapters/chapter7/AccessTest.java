package chapters.chapter7;

public class AccessTest {
    public static void main(String[] args) {
        Test5 ob = new Test5();
        ob.a = 10;
        ob.b = 20;

//        ob.c = 100; error

        ob.setc(100);
        System.out.println(ob.a + ob.b + ob.getc());
    }

}
