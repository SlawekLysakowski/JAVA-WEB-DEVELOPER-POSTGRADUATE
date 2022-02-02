public class Car {

    String modelName;
    String modelColor;
    int modelYear;


    public Car(String modelName, String modelColor, int modelYear) {
        this.modelName = modelName;
        this.modelColor = modelColor;
        this.modelYear = modelYear;
    };

    public static String randomModel() {
        String[] models = {"Yaris", "Corolla", "Aygo"};

        return models[(int) (Math.random() * 3)];
    };

    public static String randomColor() {
        String[] colors = {"silver", "blue", "black"};
        return colors[(int) (Math.random() * 3)];
    };

    public static int randomYear() {
        int[] modelYears = {2018, 2019, 2020};

        return modelYears[(int) (Math.random() * 3)];
    };

    @Override
    public String toString() {
        return  modelColor + " Toyota " + modelName + ", model year " + modelYear + ";";
    }

    public static void main(String[] args) {
        int silverYaris2020 = 0;
        int silver = 0;
        int blue = 0;
        int black = 0;
        int [] silverBlueBlack = {0,0,0};

       Car [] motomachi = new Car[5000];
       Car [] tsutsumi = new Car[4500];
       Car [] tahara = new Car[1700];

        for (int i = 0; i < motomachi.length; i++) {

            motomachi[i] = new Car(randomModel(), randomColor(), randomYear());
            if (motomachi[i].modelName.equals("Yaris") & motomachi[i].modelColor.equals("silver") & motomachi[i].modelYear == 2020) {
                silverYaris2020 += 1;
            }
//            System.out.println(motomachi[i].modelName + " " + motomachi[i].modelColor + " " + motomachi[i].modelYear );
//            System.out.println(silverYaris2020);
        }

        System.out.println("There are " + silverYaris2020 + " silver Toyota Yaris model year 2020 on Motomachi parking lot.");


        for (int i = 0; i < tsutsumi.length; i++) {

            tsutsumi[i] = new Car(randomModel(), randomColor(), randomYear());

            if(tsutsumi[i].modelColor == "silver") {
                silverBlueBlack[0]++;
            } else if (tsutsumi[i].modelColor == "blue") {
                silverBlueBlack[1]++;
            } else {
                silverBlueBlack[2]++;
            }
        }
        int NbrOfColorCars = silverBlueBlack[0];
        for (int i = 0; i < silverBlueBlack.length; i++) {
            if (silverBlueBlack[i] > NbrOfColorCars) {
                NbrOfColorCars = silverBlueBlack[i];
            }
        }

        String frequentColor = "";
        String[] colors = {"silver", "blue", "black"};
        for (int i = 0; i < silverBlueBlack.length; i++) {
            if (silverBlueBlack[i] == NbrOfColorCars) {
                frequentColor = colors[i];
            }
        }

        System.out.println("The most frequent color on Tsutsumi parking lot is " + frequentColor + " and there are " + NbrOfColorCars + " such cars." );

//        System.out.println(silverBlueBlack[0]);
//        System.out.println(silverBlueBlack[1]);
//        System.out.println(silverBlueBlack[2]);



        for (int i = 0; i < tahara.length ; i++) {
            tahara[i] =  new Car(randomModel(), randomColor(), randomYear());
        }

        System.out.println("The first ten cars on Tahara parking lot are: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(tahara[i].toString());
        }



    }
}
