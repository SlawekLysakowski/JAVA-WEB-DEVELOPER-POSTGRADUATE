public class Loops {
    public static void main(String[] args) {

        int n = 6;
        System.out.print("n = " + n);
        System.out.print("\nmatrix");
        System.out.println("\n----------");

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println();
        }
        int x = 5;
        switch (x) {
            case 1:
                System.out.println("pala");
                break;
            case 2:
                System.out.println("zdane");
                break;
            case 5:
                System.out.println("zajebiscie!");
                break;
            default:
                System.out.println("cos poszlo nie tak");
        }


    }
}
