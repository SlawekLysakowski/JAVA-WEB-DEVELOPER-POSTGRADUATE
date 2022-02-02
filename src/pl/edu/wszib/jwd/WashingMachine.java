package pl.edu.wszib.jwd;

public class WashingMachine {
    private int temperature;
    private int spining;

    public void modeForSensitiveClothes() {
        temperature = 30;
        spining = 800;
    }

    public void modeForTowelsAndBedlLinen() {
        temperature = 90;
        spining = 1600;
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "temperature=" + temperature +
                ", spining=" + spining +
                '}';
    }
}
