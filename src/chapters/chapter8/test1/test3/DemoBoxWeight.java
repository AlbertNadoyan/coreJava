package chapters.chapter8.test1.test3;

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        vol = myBox1.volume();
        System.out.println("Mybox1 = " + vol);
        System.out.println("Weight mybox1 = " + myBox1.weight);
        System.out.println();
        vol = myBox2.volume();
        System.out.println("MyBox2 = " + vol);
        System.out.println("Weight mybox2 = " + myBox2.weight);
    }
}
