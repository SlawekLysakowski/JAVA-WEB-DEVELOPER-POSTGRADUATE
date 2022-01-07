public class ZadanieDomowe_2_2 {
//    Napisz program wyświetlający świąteczną choinkę składającą się z losowych elementów
//    następującego zbioru znaków ASCII: ‘+’, ‘.’, ‘*’, ‘~’, ‘^’, ‘o’.
//    Wysokość choinki powinna być podawana jako argument programu.
//    Jeżeli wysokość nie zostanie określona to powinna zostać przyjęta domyślna wartość 18.

// String [] marks = {‘+’, ‘.’, ‘*’, ‘~’, ‘^’, ‘o’};

    public static void main(String[] args) {

        char[] str = {'+', '.', '*', '~', '^', 'o'};
        int random = (int)Math.floor(Math.random()*(5-0+1)+0);
        char randomChar = str[random];
        System.out.println(randomChar);

//    christmasTreeMaker(10);

    }


}
