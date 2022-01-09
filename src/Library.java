public class Library {

    public static void main(String[] args) {

        Book[] books = {
        new Book("Sposoby parzenia herbaty", "XiaoYu Wang", "Shinseisha", 1992),
        new Book("Sztuka Wojny", "Sun Tsu", "Shinseisha", 1999),
        new Book("Sposoby parzenia herbaty", "XiaoYu Wang", "Shinseisha", 1992),
        };

        Book book1 = books[0];
        Book book2 = books[1];
        Book book3 = books[2];


        System.out.println("Kasiążka 1: " + book1);
        System.out.println("Kasiążka 2: " + book2);
        System.out.println("Kasiążka 3: " + book3);

        if(book1.equals(book3)) {
            System.out.println("To ta sama książka");
        } else {
            System.out.println( "To dwie różne książki");
        }

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }


}


