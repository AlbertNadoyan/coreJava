package chapters.chapter8.test1.test5;

public class B extends A{
    int i;
    B(int a, int b){
        super.i = a;
        i = b;
    }

    void show(){
        System.out.println("I in superClass: " + super.i);
        System.out.println("I in subClass: " + i);
    }
}
