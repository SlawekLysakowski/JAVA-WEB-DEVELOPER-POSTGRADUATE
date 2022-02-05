package pl.edu.wszib.exceptions;

public class AgeTester {

   static void checkAge(int age) {
        if (age < 18) {
            throw new AgeRangeException("Uwaga osoba niepełnoletnia");
        } else {
            System.out.println("Dostęp przyznany...");
        }
    }

    public static void main(String[] args) {

        checkAge(45);
        try {
            checkAge(17);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("naruszenie zadad" + e.getMessage());
        }


    }
}
