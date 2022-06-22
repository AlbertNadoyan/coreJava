package chapters.chapter8.test1.test14;

abstract class Figure {
    double dim1;
    double dim2;
    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}
