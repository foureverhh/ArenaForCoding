package javaIntro.ployDemo;

public class Animal {
    public int age =100;
    public void eat(){
        System.out.println("Animal eats");
    }

    public void sleep(){
        System.out.println("Animal sleeps");
        eat();
    }
}
