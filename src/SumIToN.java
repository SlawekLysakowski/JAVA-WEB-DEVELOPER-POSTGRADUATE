import javax.xml.transform.Source;
import java.util.Scanner;

public class SumIToN {
    public static void main(String[] args) {
        System.out.print("n = ");
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        int number = 1;
        int sum = 1;


        System.out.println(n);

        System.out.print("Suma 1");
        while (number < n) {
            number ++;
            sum += number;
            System.out.print(" + " + number);
        }
        System.out.println(" = " + sum);

        System.out.println(n);


    }
}
