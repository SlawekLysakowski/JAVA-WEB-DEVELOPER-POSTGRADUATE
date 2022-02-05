package pl.edu.wszib;

public class Hamster extends Animal{
    private static int counter;
    private static String type = "chomik";

    @Override
    String getType() {
        return type ;
    }

    @Override
    int getInstanceNumber() {
        return counter;
    }

    public Hamster() {
        counter++;
    }
}
