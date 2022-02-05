package pl.edu.wszib;

public class Dog extends Animal {
    private static int counter;
    private static String type = "pies";

    @Override
    String getType() {
        return type ;
    }

    @Override
    int getInstanceNumber() {
        return counter;
    }

    public Dog() {
        counter++;
    }






}
