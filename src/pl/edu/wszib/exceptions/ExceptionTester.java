package pl.edu.wszib.exceptions;

public class ExceptionTester {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        try {
            System.out.println("Nasz numer to: " + numbers[3]);
//            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println("nie ma takiego indeksu!" + e.getMessage());

        } catch (Exception e) {
            System.out.println("ocś poszło nie tak! " + e.getMessage());

        } finally {
            System.out.println("koniec");
        }



    }
}
