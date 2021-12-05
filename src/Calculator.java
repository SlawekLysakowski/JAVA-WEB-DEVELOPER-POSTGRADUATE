public class Calculator {
    public static void main(String[] args) {
        int a = 4;
        int b = 9;

        addition(a,b);
        subtraction(a,b);
        multiplication(a,b);

    }
    public static int addition(int int1, int int2) {
        System.out.println("a + b = " + (int1 + int2));
        return int1 + int2;
    }

    public static int subtraction(int int1, int int2) {
        System.out.println("a - b = " + (int1 - int2));
        return int1 - int2;
    }

    public static int multiplication(int int1, int int2) {
        System.out.println("a * b = " + (int1 * int2));
        return int1 * int2;
    }
}
