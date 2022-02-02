import java.awt.*;

public class Box {
    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;

    public Box(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Box(Point topleft, Point bottomRight) {
    this(topleft.x, topleft.y, bottomRight.x, bottomRight.y);
    }

    public Box(Point topleft, int w, int h) {
        this(topleft.x, topleft.y, topleft.x + w, topleft.y + h);
    }

    void printBox() {
        System.out.print("Box: <" + x1 + ", " + y1);
        System.out.print(", " + x2 + ", " + y2 + ">");
    }

    public static void main(String[] args) {
        Box box;

        System.out.println("Wywołanie box ze współrzędnymi (25,25) i (50,50)");
        box = new Box(25,25,50,50);
        box.printBox();

        System.out.println("\nWywołanie box ze współrzędnymi 10,10) i (20,20)");
        box = new Box(new Point(10,10), new Point(20,20));
        box.printBox();

        System.out.println("\nWywołanie box ze współrzędnymi 10,10) o szeroksci 50 i wysokosci 50 ");
        box = new Box(new Point(10,10), 40, 40);
        box.printBox();
    }
}
