package pl.edu.wszib.jwd;

public class WashingMachineTester {
    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine();


        wm.modeForSensitiveClothes();

        System.out.println(wm.toString());

        wm.modeForTowelsAndBedlLinen();
        System.out.println(wm.toString());

    }

}
