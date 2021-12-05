import java.sql.SQLOutput;

public class NumberDemonstrator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        demo(a,b);

    }

    public static void demo(int int1, int int2) {
        int i = (int1 + int2);
        System.out.println("a = " + int1 + "\n" + "b = " + int2 + "\n" + "a + b = " + (i) + "\n" + "\n" +
        "binarnie" + "\n" + String.format("%8s", Integer.toBinaryString(int1).replace(' ' , '0')) + "\n" +
                String.format("%8s", Integer.toBinaryString(int2).replace(' ', '0')) + "\n" + "----------" + "\n" +
                String.format("%8s", Integer.toBinaryString((i)).replace(' ', '0')) + "\n" + "\n" +
        "osemkowo" + "\n" + Integer.toOctalString(int1) + "\n" + Integer.toOctalString(int2) + "\n" + "----------" + "\n" + Integer.toOctalString(i) + "\n" + "\n" +
        "szesnastkowo" + "\n" + Integer.toHexString(int1) + "\n" + Integer.toHexString(int2) + "\n" + "----------" + "\n" + Integer.toHexString(i));



    }
}
