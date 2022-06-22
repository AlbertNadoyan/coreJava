package chapters.chapter7;

public class Outer3 {
    int outerX = 50;
    void test(){
        for (int i = 0; i < 10; i++) {
            class Inner{
                void display(){
                    System.out.println(outerX);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}
