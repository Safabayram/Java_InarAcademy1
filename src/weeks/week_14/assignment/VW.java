package week_14.assignment;


public class VW {
    protected String brand;
    protected int wheels;
    protected int airbag;
    protected String color;
    protected int year;

    public VW() {
        this("WV", 0, 0, null, 0);
    }

    public VW(String brand, int wheels, int airbag, String color, int year) {
        this.brand = brand;
        this.wheels = wheels;
        this.airbag = airbag;
        this.color = color;
        this.year = year;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getAirbag() {
        return airbag;
    }

    public void setAirbag(int airbag) {
        this.airbag = airbag;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Brand : " + brand + "\nWheels : " + wheels + "\n Air Bag : " + airbag + "\n Color : " + color + " \n Year : " + year;
    }

}
