public class ChristmasTreeMaker {

//    Napisz program wyświetlający świąteczną choinkę składającą się z losowych elementów
//    następującego zbioru znaków ASCII: ‘+’, ‘.’, ‘*’, ‘~’, ‘^’, ‘o’.
//    Wysokość choinki powinna być podawana jako argument programu.
//    Jeżeli wysokość nie zostanie określona to powinna zostać przyjęta domyślna wartość 18.

// String [] marks = {‘+’, ‘.’, ‘*’, ‘~’, ‘^’, ‘o’};

    public static void main(String[] args) {
        //       height = Integer.parseInt(args[0]);

        int height = 18;
        if (args.length > 0) {
            height = Integer.parseInt(args[0]);
        }

       int counter = 1;
       int spaces = height - 1;
        char[] str = {'+', '.', '*', '~', '^', 'o'};
        int random = (int) (Math.random() * (5 - 0 + 1) + 0);
        char randomChar = str[random];


            for (int row = 1; row <= height; row++) {

                for (int i = 1; i <= spaces ; i++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= counter; j++) {
                    random = (int)Math.floor(Math.random() * (5 - 0 + 1) + 0);
                    randomChar = str[random];
                    System.out.print(randomChar);

                }
                System.out.println("");
                counter += 2;
                spaces--;
            }
        }

    }


