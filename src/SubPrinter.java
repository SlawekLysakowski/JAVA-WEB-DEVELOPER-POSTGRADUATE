public class SubPrinter extends Printer {
    int  z = 3;

    @Override
    void printMe() {
        System.out.println("z wynosi: " + z);
        System.out.println("Jestem egzemplarzem klasy" + this.getClass().getName());
    }

    public static void main(String[] args) {
        SubPrinter subPrinter = new SubPrinter();

        subPrinter.printMe();
    }
}

