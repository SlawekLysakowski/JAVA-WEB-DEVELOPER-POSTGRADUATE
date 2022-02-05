package pl.edu.wszib;

public class Cat extends Animal{
    private static int counter;
    private static String type = "kot";
    @Override
    String getType() {
        return type ;
    }

    @Override
    int getInstanceNumber() {
        return counter;
    }

    public Cat() {
        counter++;
    }


}
