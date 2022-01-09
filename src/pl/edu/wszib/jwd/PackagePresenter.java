package pl.edu.wszib.jwd;


public class PackagePresenter {

    public void packagePresenter() {
        System.out.println("Dzień dobry");
    }

    public static void main(String[] args) {


        PackagePresenter packagePresenter = new PackagePresenter();
packagePresenter.showPackage();

    }

    public void showPackage() {
        System.out.print("To jest obiekt klasy " + this.getClass().getSimpleName());
        System.out.print(", w pakiecie " + this.getClass().getPackageName());
    }
}