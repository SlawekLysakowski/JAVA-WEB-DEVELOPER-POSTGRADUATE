import java.util.Scanner;

public class ArrayOperator {

    public static int[] arrayMaker(int n) {
        int arr[] = new int[n];
        return arr;
    }
        public static int[] arrayFiller(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i +1;
        }
     return arr;
    }

    public static void show (int arr[]) {
        System.out.print("Array = [ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]\n");
    }
    public static int[] arrayConverter (int arr[]) {
        int[] converterArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            converterArray[i] = arr[arr.length - 1 - i];
            }

        return converterArray;
    }

    public static void showConverted (int arr[]) {
        System.out.print("Converted Array = [ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]\n");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter desired array size: ");
        int n = scanner.nextInt();
        int[] arr = arrayMaker(n);
        arrayFiller(arr);
        show(arr);
        arr = arrayConverter(arr);
        showConverted(arr);

    }
}
