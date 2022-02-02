package pl.edu.wszib.podyplomowe;

public class PackageTesterApp {
    public static void main(String[] args) {

        pl.edu.PackageTester packageTester = new pl.edu.PackageTester();
        packageTester.introduce();

        pl.edu.wszib.jwd.PackageTester packageTester2 = new pl.edu.wszib.jwd.PackageTester();
        packageTester2.introduce();

        pl.edu.wszib.podyplomowe.PackageTester packageTester3 = new pl.edu.wszib.podyplomowe.PackageTester();
        packageTester3.introduce();



    }


}
