package pl.edu.wszib.exceptions;

public class ExceptionThrowDemo {
    public static void main(String[] args) {
        ExceptionThrowDemo etd = new ExceptionThrowDemo();
        int hours =-3;
        int numberOfSeconds = 0;

        try {
            numberOfSeconds = etd.getNumbersOfSeconds(hours);
        } catch (IllegalArgumentException e) {
            System.out.println("Uwaga korekta danych wejściowych!");
            numberOfSeconds = etd.getNumbersOfSeconds(hours * -1);
        }








    }
    public int getNumbersOfSeconds(int hours) {
        if(hours < 0) {
            throw new IllegalArgumentException("wartość godzin musi być większa lub równa 0" + hours);
        }
        System.out.println(hours * 60 * 60);
        return hours *  60 * 60;

    }

}
