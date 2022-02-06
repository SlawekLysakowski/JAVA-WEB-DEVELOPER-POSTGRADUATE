package pl.edu.wszib.enums;

import org.w3c.dom.ls.LSOutput;

public class Tshirt {
    private TshirtSize size;
    private String manufacturer;


    public Tshirt(TshirtSize size, String manufacturer) {
        this.size = size;
        this.manufacturer = manufacturer;
    }

    public TshirtSize getSize() {
        return size;
    }

    public void setSize(TshirtSize size) {
        this.size = size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Tshirt{" +
                "size=" + size +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Tshirt tshirt1 = new Tshirt(TshirtSize.L, "Polex");
        Tshirt tshirt2 = new Tshirt(TshirtSize.S, "Polex");
        System.out.println(tshirt1 + " - " + tshirt1.getSize().getSleeveLenght());

    }
}

