package pl.edu.wszib.poli;

public class Dog extends Animal{

    public Dog(String name) {
        this.name = name;

    }

    @Override
    String showName() {
        return "pies " + name;
    }

    @Override
    String makeSound() {
        return "hau hau";
    }
}
