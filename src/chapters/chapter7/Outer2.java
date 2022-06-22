package chapters.chapter7;

public class Outer2 {
    int outerX = 100;
    void test(){
        Inner inner = new Inner();
        inner.display();
    }

    class Inner{
        int y = 10;
        void display(){
            System.out.println("outerX: " + outerX);
        }
    }

//    void showy(){
//        System.out.println(y);
//    }
}
