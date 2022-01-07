public class ReversedString {
    public static void main(String[] args) {
        String str = "trzeba odwrocic ten string";

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));

        }
    }
}
