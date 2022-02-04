package laboratorium14;

public class Dog extends Animal {
    private int instances;


    @Override
    String getType() {
        System.out.println("dog");
        return "dog";
    }

    @Override
    int getInstance() {
        if (getType().equals("dog")) {
            instances++;
        }
        return this.instances;
    }

}