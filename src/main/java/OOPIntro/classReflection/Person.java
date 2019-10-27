package OOPIntro.classReflection;

import javax.xml.ws.EndpointReference;
import java.util.Arrays;

public class Person implements Cloneable{
    private String name = "Person";
    private String[] houses = {"house1","house2"};

    public Person(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHouses(String[] houses) {
        this.houses = houses;
    }

    public String getName() {
        return name;
    }

    public String[] getHouses() {
        return houses;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person newPerson = (Person) super.clone();
        newPerson.houses = this.houses.clone();
        return newPerson;
    }


    @Override
    public String toString() {
        return "Name is: " +name+", houses are "+ Arrays.toString(houses);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        try {
            Person p2 = (Person) p1.clone();
            System.out.println("p1: "+p1);
            System.out.println("p2: "+p2);
            p1.name = "name change";
            p1.getHouses()[0] = "house 0";
            System.out.println();
            System.out.println("p1: "+p1);
            System.out.println("p2: "+p2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
