package chapters.chapter2;

public class BlockTest {
    public static void main(String[] args) {
        int x, y;
        y = 20;
        for (x = 0; x < 10; x++){
            System.out.println("Value x: " + x);
            System.out.println("Value y: " + y);
            y -= 2;
        }
    }
}
