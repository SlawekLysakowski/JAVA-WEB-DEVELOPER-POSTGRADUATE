package laboratorium14;

public class GuineaPig extends Animal {
    private int instances;



    @Override
    String getType() {
        System.out.println("guinea pig");
        return "guinea pig";
    }

    @Override
    int getInstance() {
        if (getType().equals("guinea pig")) {
            this.instances++;
        }
        return this.instances;
    }
}
