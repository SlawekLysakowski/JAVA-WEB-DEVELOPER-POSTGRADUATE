package pl.edu.wszib;

import java.util.Calendar;
import java.util.Objects;

public class Car {
    // Zaimplementuj klasę Car, przechowującą takie informacje o samochodzie jak brand, color, year.
    // Klasa powinna possiadać konstruktor gdzie parametrami są wszystkie atrybuty klasy,
    // oraz konstruktor gdzie możemy tylko podać markę a domyślnie zostanie przypisany biały kolor oraz  obecny rok produkcji.
    // Wyposaż klasę  w metody toString() oraz equals().

    private String brand;
    private String color;
    private int year;

    public Car (String brand, String color, int year ) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    public Car (String brand) {
        this.brand = brand;
        this.color = "white";
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        this.year = currentYear;
    }

    @Override
    public String toString() {
        return "Car: " +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ';';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(brand, car.brand) && Objects.equals(color, car.color);
    }

    public static void main(String[] args) {
        Car car = new Car("Mazda");
        System.out.println(car);
    }


}
