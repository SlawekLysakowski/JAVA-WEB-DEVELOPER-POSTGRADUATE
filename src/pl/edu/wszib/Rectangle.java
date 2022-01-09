package pl.edu.wszib;

public class Rectangle extends Shape{

    private int length;
    private int width;


    @Override
    double getArea() {
        return length  * width;
    }
}
