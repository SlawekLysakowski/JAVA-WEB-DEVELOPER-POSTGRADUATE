public class Shop {
    public static void main(String[] args) {
        Product p1 = new Product("Mleko", 3.28);
        Product p2 = new  Product("Mleko", 3.28);
        System.out.println(System.identityHashCode(p1));
        System.out.println(System.identityHashCode(p2));
        System.out.println(p1.equals(p2));


    }
}
