package pl.edu.wszib.enums;

public class Computationtest {
    public static void main(String[] args) {
        double x = 5;
        double y = 7;

        System.out.println("dodawanie " + Computation.ADD.perform(x, y));
        System.out.println("odejmowanie " + Computation.DIVIDE.perform(x, y));
        System.out.println("mnżenie " + Computation.MULTIPLY.perform(x, y));
        System.out.println("dzielenie " + Computation.DIVIDE.perform(x, y));
    }
}
