package javaIntro.classArv.javaTwo.vehicle;

import javaIntro.classArv.javaTwo.drivers.Driver;

public class Car implements Cloneable{
    private int registrationNumber;
    private String model;
    private String brand;
    private Driver driver;

    public void changeOwner(){
        Driver newDriver = new Driver();
        driver = newDriver;
    }

    public Car(String model){
        this.model = model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
