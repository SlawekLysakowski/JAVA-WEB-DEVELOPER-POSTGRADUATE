package laboratorium14;

import java.util.Objects;

public class Cat extends Animal{
    private int instances;



    @Override
    String getType() {
        System.out.println("cat");
        return "cat";
    }

    @Override
    int getInstance() {
        if (getType().equals("cat")) {
            instances++;

        }
        return this.instances;
    }


}
