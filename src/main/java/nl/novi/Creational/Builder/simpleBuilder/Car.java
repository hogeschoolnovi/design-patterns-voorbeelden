package nl.novi.Creational.Builder.simpleBuilder;


import java.util.UUID;

public class Car {

    private UUID id;
    private String brand;
    private String model;
    private String vin;
    private String color;
    private int numberOfDoors;

    public Car(String brand, String model, String vin,  String color, int numberOfDoors) {
        this.brand = brand;
        this.model = model;
        this.vin = vin;
        this.color= color;
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}

