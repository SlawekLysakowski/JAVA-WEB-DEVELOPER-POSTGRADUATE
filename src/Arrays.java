import java.awt.*;

public class Arrays {
    public static void main(String[] args) {

int[][] arr = new int [2][2];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;

        int teges[];
        int smeges[];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");

            }
            System.out.println();

        }


        String [] dogs = {"rex", "maks", "burek"};
        String [] people = {"Ania", "Wojtek", "Dorota"};
        String [][] names = {people, dogs};

        for (String dogNames : dogs) {
            System.out.println(dogNames);
        }

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }




    }

}
