package chapters.chapter8.test1.test12;

public class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    double area(){
        System.out.println("the area of the figure is not defined");
        return  0;
    }
}
