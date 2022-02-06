package pl.edu.wszib.enums;

public enum TshirtSize {
    S(48,71,36),
    M(53, 74, 38),
    L(56, 76, 41),
    XL(61, 79, 41);


    private int chestWidth;
    private int shirtLenght;
    private int sleeveLenght;

    TshirtSize(int chestWidth, int shirtLenght, int sleeveLenght) {
        this.chestWidth = chestWidth;
        this.shirtLenght = shirtLenght;
        this.sleeveLenght = sleeveLenght;
    }

    public int getChestWidth() {
        return chestWidth;
    }

    public void setChestWidth(int chestWidth) {
        this.chestWidth = chestWidth;
    }

    public int getShirtLenght() {
        return shirtLenght;
    }

    public void setShirtLenght(int shirtLenght) {
        this.shirtLenght = shirtLenght;
    }

    public int getSleeveLenght() {
        return sleeveLenght;
    }

    public void setSleeveLenght(int sleeveLenght) {
        this.sleeveLenght = sleeveLenght;
    }

    @Override
    public String toString() {
        return "TshirtSize{" +
                "chestWidth=" + chestWidth +
                ", shirtLenght=" + shirtLenght +
                ", sleeveLenght=" + sleeveLenght +
                '}';
    }
}
