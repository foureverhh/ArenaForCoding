package javaIntro.arv;

public class Dog extends Animal {

    public void bark(){
        System.out.println();
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("I eat dog food.");
    }

    @Override
    public String toString() {
        return "I am a "+color+" dog.";
    }
}
