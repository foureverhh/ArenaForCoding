package javaIntro.classArv.javaTwo.drivers;

public class Person {
    protected String name = "person";
    protected String address = "person address";
    protected int age = 100;
    protected Home home;


    public Person() {
        this.home = new Home("person address");
    }

    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

 /*   public Home createHome(){
        home =  new Home(address);
        return home;
    }*/

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void pressAge(){
        System.out.println( name + " is at " + age);

    }

    @Override
    public String toString() {
        return this.name+" lives in "+this.address+" and at age "+this.age;
    }
}
