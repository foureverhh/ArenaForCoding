package javaIntro.classArv.javaTwo;

import javaIntro.classArv.javaTwo.drivers.Person;
import javaIntro.classArv.javaTwo.vehicle.WomanDriver;

public class App {
    public static void main(String[] args) {
        WomanDriver womanDriver = new WomanDriver();
        System.out.println(womanDriver);
        womanDriver.pressAge();
        Person p = new WomanDriver();
        System.out.println("p is: "+p);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
