package chapters.chapter2;

public class IfSimple {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;

        if(x < y){
            System.out.println("x less y");
        }
        x = x * 2;
        if(x == y){
            System.out.println("x equals y");
        }
        x = x * 2;
        if(x > y){
            System.out.println("x larger y");
        }
        if(x == y){
            System.out.println("you won't see that");
        }
    }
}
