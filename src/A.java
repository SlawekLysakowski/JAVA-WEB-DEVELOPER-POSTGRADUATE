public class A {
    public A() {
        super();
        System.out.println("działa konstruktor A");
    }

    public A(boolean silent) {
        if (silent = true) {

        } else {

            System.out.println("działa konstruktor A");
        }
    }

    public static void main(String[] args) {
//        A a = new A();
    }

}

class B extends A {

    public B() {

        super();
        System.out.println("działa konstruktor B");
    }

    public B(boolean silent) {
        super(true);
        if (silent = true) {
        } else {
            A a = new A(false);
        }
    }


    public static void main(String[] args) {
//        B b = new B(false);
    }

}

class C extends B {

    public C() {

        super();
        System.out.println("działa konstruktor C");
    }
    public C(boolean silent) {
        if (silent = true) {
        } else {
          A a = new A(false);


        }
    }



    public static void main(String[] args) {
        C c = new C(false);



    }
}