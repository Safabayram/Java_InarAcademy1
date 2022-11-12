package week_14.assignment;

public final class Polo extends VW {
    private String model;
    private int engine;


    public Polo(String brand, int wheels, int airbag, String color, int year, int engine) {
        super(brand, wheels, airbag, color, year);
        this.engine = engine;
    }

    public Polo() {
        this(2000);


    }

    public Polo(int engine) {
        this.engine = engine;


    }

    public final double getTax(double price) {
        return price * engine * year;
    }

    public String toString() {
        return "Brand : " + brand +"\nWheels : " +  wheels + "\n Air Bag : "
                + airbag + "\n Color : " + color + " \n Year : " + year + "\n Model : " + model + "\n Engine : " + engine ;

    }



}


