package laboratorium14;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class AnimalShelter {


    public static void setAnimalShelter(Object[] arr, Object[] animals) {
         int random = (int) (Math.random() * 3);
        Arrays.fill(arr, animals[random]);
    }

    public static void main(String[] args) {

        Random random = new Random();

        Cat cat = new Cat();
        Dog dog = new Dog();
        GuineaPig guineaPig = new GuineaPig();
        Animal [] animals = {new Cat(), new Dog(), new GuineaPig()};

        Animal [] animalShelter = new Animal[100];
        setAnimalShelter(animalShelter, animals);

        for (int j = 0; j < animalShelter.length; j++) {
            int i = random.nextInt(3);
          animalShelter[j] = animals[i];
//           animalShelter[j].getType();
           animalShelter[j].getInstance();
        }

        System.out.println("The animal in coop number 33 is " + animalShelter[33].getType() +
                " and there are " + (animalShelter[33].getInstance() - 1) + " such animals" );

//        System.out.println(dog.instances);

    }
}
