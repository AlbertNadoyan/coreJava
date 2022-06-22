package chapters.chapter7;

public class OverloadCons {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 30);
        Box myBox2 = new Box();
        Box myBox3 = new Box(7);
        double vol;
        vol = myBox1.volume();
        System.out.println("Mybox1 = " + vol);

        vol = myBox2.volume();
        System.out.println("Mybox2 = " + vol);

        vol = myBox3.volume();
        System.out.println("Mybox3 = " + vol);
    }
}
