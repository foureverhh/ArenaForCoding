package javaIntro.ployDemo;

public class Dog extends Animal {
    public int age =10;
    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    public void bark(){
        System.out.println("Wang");
    }
}
