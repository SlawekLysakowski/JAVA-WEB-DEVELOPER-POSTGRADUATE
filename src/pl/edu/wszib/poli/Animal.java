package pl.edu.wszib.poli;

public class Animal {
    String name;

    public Animal() {
        this.name = "bezimienny";
    }

    String showName() {
        return "zwierzę " + name;
    }

    String makeSound() {
        return "???";
    }

    void introduce() {
        System.out.println("jestem " + showName() + ": " + makeSound()) ;
    }

}
