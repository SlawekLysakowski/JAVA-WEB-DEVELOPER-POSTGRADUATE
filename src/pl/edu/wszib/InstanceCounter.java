package pl.edu.wszib;

public class InstanceCounter {
    private static int numInstances = 0;

    public static int getCount() {
        return numInstances;
    }

    public static void addInstance() {
        numInstances++;
    }

    public InstanceCounter() {
        addInstance();
    }

    public static void main(String[] args) {

        InstanceCounter ic = new InstanceCounter();
         new InstanceCounter();
         new InstanceCounter();
        new InstanceCounter();
        new InstanceCounter();
        new InstanceCounter();

        System.out.println(InstanceCounter.getCount());



    }
}


