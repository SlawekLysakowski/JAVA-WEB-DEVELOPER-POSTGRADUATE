public class Loops {
    public static void main(String[] args) {

        int n = 30;
        System.out.print("n = " + n);
        System.out.print(" matrix");
        System.out.println("\n" + "--------");

        for (int i = 0; i < n ; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println();
        }

    }
}
