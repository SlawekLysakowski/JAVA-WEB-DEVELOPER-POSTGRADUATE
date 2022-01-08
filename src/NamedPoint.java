import java.awt.*;

public class NamedPoint extends Point {
    String name;

    public NamedPoint(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }

    private void showInfo() {
        System.out.println(name + "(" + x + "," + y + ")");
    }

    public static void main(String[] args) {

        NamedPoint np = new NamedPoint(5,5,"smallPoint");
        System.out.println("x wynosi " + np.x);
        System.out.println("y wynosi " + np.y);
        System.out.println("name wynosi " + np.name);

        np.showInfo();

        np = new NamedPoint(123, 456, "BigPoint");
        np.showInfo();




    }


}
