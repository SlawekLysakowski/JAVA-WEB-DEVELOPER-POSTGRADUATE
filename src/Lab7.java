public class Lab7 {
    public static void main(String[] args) {
        int n = 15;
int c = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print("\n");
            int b = c++;
            for(int j = b; j < n+b; j++) {

                System.out.print(j);

            }
        }
    }
}
