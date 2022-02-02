import java.awt.*;

public class Test {
    public static void main(String[] args) {


        Point p = new Point(1,3);
        System.out.println(p.toString());

        MarsRobot marsRobot = new MarsRobot("5435",2,3);
        System.out.println(marsRobot);
        Employee employee = new Employee("Kowalski", 32, 4_500);
        System.out.println(employee);


    }

}
