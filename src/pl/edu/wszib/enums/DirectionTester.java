package pl.edu.wszib.enums;

public class DirectionTester {
    private Directions direction;
    private String action;

    public DirectionTester(Directions direction, String action) {
        this.direction = direction;
        this.action = action;
    }

    @Override
    public String toString() {
        return action + " " + direction;
    }

    public static void main(String[] args) {


     DirectionTester dt = new DirectionTester(Directions.NORTH, "go");
     DirectionTester dt2 = new DirectionTester(Directions.SOUTH_EAST, "Please head");
        System.out.println(dt);
        System.out.println(dt2);










    }
}
