public class Human {

    void eat() {
        System.out.println("eats a lot");
    }

    public static void main(String[] args) {
        Human human = new Human();
       human.eat();

    }

}

 class Boy extends Human {
     void eat() {
         System.out.println("Also eats a lot :)");
     }

     public static void main(String[] args) {
         Boy boy = new Boy();
         boy.eat();
     }


 }
