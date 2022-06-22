package chapters.chapter8.test1.test12;

public class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a, b);
    }

    double area(){
        System.out.println("B area of the quadrilateral.");
        return dim1 * dim2;
    }
}
