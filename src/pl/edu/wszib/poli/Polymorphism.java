package pl.edu.wszib.poli;

public class Polymorphism {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        System.out.println(rectangle instanceof Rectangle);
        shape = new Rectangle();
        System.out.println(shape instanceof Triangle);

        shape = new Circle();
        shape.draw();



    }
}
