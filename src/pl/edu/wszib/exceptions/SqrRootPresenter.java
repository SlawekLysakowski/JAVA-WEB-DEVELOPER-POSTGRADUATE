package pl.edu.wszib.exceptions;

import java.util.Scanner;

public class SqrRootPresenter {

    void sqrtCalc(int x) {
        try {
            System.out.println(Math.sqrt(x));
            if (x < 0) {
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("number is negative");

        }
    }


    public static void main(String[] args) {
        int number = 0;
        System.out.print("Enter a number ");

        Scanner scanner = new Scanner(System.in);
      number = scanner.nextInt() ;

      SqrRootPresenter srp = new SqrRootPresenter();

      srp.sqrtCalc(number);

    }

}
