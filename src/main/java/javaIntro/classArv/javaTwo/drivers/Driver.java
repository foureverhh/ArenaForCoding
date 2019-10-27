package javaIntro.classArv.javaTwo.drivers;

public class Driver extends Person {
    protected Home home;
    public Driver() {
        this.home = new Home("driver home");
    }
/*
    @Override
    public Home createHome() {
        home =new Home("driver home");
        return home;
    }*/

    public Driver(String name, String address, int age) {
        super(name, address, age);
    }
}
