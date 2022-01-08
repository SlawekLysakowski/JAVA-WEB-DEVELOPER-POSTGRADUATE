import java.util.Scanner;

public class ArrayToN {
    //Napisz program, który:
    //
    //    stworzy tablicę liczb typu int o rozmiarze, który będziemy podawać jako argument przy starcie programu,
    //    wypełni tablicę kolejno liczbami od 1 do n, gdzie n to rozmiar tablicy,
    //    wyświetli zawartość tablicy.
    //
    //Przykład:
    //ArrayFiller 5
    //1 2 3 4 5

    static int[] arrayCreator (int n) {
        int[] arr = new int[n];
        System.out.print("Array: [ ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");

        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert desired array size: " );
        int n = scanner.nextInt();

        int [] arr = arrayCreator(n);

    }

}
