package javaIntro.classArv.javaTwo.drivers;

public class App {
    public static void main(String[] args) {
        Person person = new Person();
        Driver driver = new Driver();
        System.out.println(person.home.getAddress());
        System.out.println(driver.home.getAddress());

        Person personDriver = new Driver();
        System.out.println(personDriver.home.getAddress()+" "+personDriver.age);

    }
}
