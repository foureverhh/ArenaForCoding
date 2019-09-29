package javaIntro.classArv.javaTwo.vehicle;

import javaIntro.classArv.javaTwo.drivers.Person;

public class WomanDriver extends Person {
    protected String name = "woman";
    protected String address = "woman address";
    protected int age =20 ;

    public WomanDriver(){

    }
    public WomanDriver(String name, String address, int age){
        super(name,address,age);
    }


    public void pressAge(){
        System.out.println( name + " is at " +age);
    }

    @Override
    public int getAge() {
        return age;
    }



}
