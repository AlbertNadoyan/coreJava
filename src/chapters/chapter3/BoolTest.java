package chapters.chapter3;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b ravno " + b);
        b = true;
        System.out.println("b ravno " + b);

        if(b){
            System.out.println("Etot kod vipolnyaetsya");
        }
        b = false;
        if(b){
            System.out.println("Etot kod ne vipolnyaetsya");
        }
        System.out.println("10 > 9 ravno " + (10 > 9));
    }
}
