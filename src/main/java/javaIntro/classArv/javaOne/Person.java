package javaIntro.classArv.javaOne;

public class Person {
    private String name = "Person";
    private String address = "Person Home";
    private String id = "0";
    public String gender = "No sure";

    public Person() {
    }

    public Person(String name, String address, String id) {
        this.name = name;
        this.address = address;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return this.name+" "+this.address+" "+this.id;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
}
