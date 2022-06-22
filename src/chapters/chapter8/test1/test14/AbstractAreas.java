package chapters.chapter8.test1.test14;

public class AbstractAreas {
    public static void main(String[] args) {
        //    Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref;

        figref = r;
        System.out.println("The area is " + figref.area());

        figref = t;
        System.out.println("The area is " + figref.area());
    }

}
