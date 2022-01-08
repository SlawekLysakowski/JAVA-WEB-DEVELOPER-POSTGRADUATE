public class CorrectCalculator {
    public int add (int a, int b) {
        return a + b;
    }
    public int add (int a, int b, int c) {
        return a + b + c;
    }
    public double add (double a, double b) {
        return a + b;
    }

    public double add (double a, double b, double c) {
        return a + b + c;
    }




    public static void main(String[] args) {
        CorrectCalculator correctCalculator = new CorrectCalculator();
        System.out.println(correctCalculator.add(2,5));
        System.out.println(correctCalculator.add(2,5,7));
        System.out.println(correctCalculator.add(2.5,5.0,7.2));
    }
}
