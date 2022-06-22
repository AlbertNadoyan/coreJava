package chapters.chapter7;

public class OverloadCons2 {
    public static void main(String[] args) {
        Box2 myBox1 = new Box2(10, 20, 30);
        Box2 myBox2 = new Box2();
        Box2 myCube = new Box2(7);

        Box2 myClone = new Box2(myBox1);

        double vol;
        vol = myBox1.volue();
        System.out.println("myBox1 = " + vol);

        vol = myBox2.volue();
        System.out.println("myBox2 = " + vol);

        vol = myCube.volue();
        System.out.println("myBox3 = " + vol);

        vol = myClone.volue();
        System.out.println("Clone = " + vol);

    }
}
