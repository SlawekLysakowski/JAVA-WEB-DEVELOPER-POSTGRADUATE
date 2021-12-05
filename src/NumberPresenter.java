public class NumberPresenter {
    public static void main(String[] args) {

        //deklaracja zmiennej lokalnej
        int i = 121;

        showInt(i);
        showIntAsBinary(i);
        showIntAsOctal(i);
        showIntAsHex(i);

        }
    public static int  showInt(int i) {
        System.out.println("dziesietnie: \t" + i);
        System.out.println("------------------------");
        return i;

    }
    public static String showIntAsBinary (int i) {
        System.out.println("binarnie: \t\t" + Integer.toBinaryString(i));
        System.out.println("------------------------");
        return Integer.toBinaryString(i);
   }

    public static void showIntAsOctal (int i) {
        System.out.println("osemkowo: \t\t" + Integer.toOctalString(i));
        System.out.println("------------------------");
    }

    public static void showIntAsHex( int i) {
        System.out.println("szesnastkowo: \t" + Integer.toHexString(i));
}

    }
