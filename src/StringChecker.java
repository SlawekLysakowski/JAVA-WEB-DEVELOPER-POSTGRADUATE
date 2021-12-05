import java.util.Locale;

public class StringChecker {
    public static void main(String[] args) {
        String str = "lannister zawsze splaca swoje dlugi";


        System.out.println("tekst to: " + str);
        System.out.println("dlugosc tekstu to " + str.length());
        System.out.println(str.substring(10, 26));
        System.out.println("ZNAK NA POZYCJI 6 to: " + str.charAt(5));
        System.out.println("indeks \"t\" to: " + str.indexOf('t'));
        System.out.println("indeks \"dlugi\" to: " + str.indexOf("dlugi"));

        double pi = Math.PI;

        System.out.println(pi);
        System.out.printf(new Locale("us"), "%.5f%n", pi);

        boolean cond = true;

        while (cond) {
            System.out.println("petla dziala");
            if ((int) (Math.random() * 10 + 1) == 5) {
                cond = false;
                System.out.println("petla przestala dzialac");
            }

//            int rand = (int) (Math.random() * 10 + 1);
//            System.out.println(rand);

        }
    }
}
