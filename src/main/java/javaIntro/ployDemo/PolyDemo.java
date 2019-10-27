package javaIntro.ployDemo;

public class PolyDemo {
    public static void main(String[] args) {
        Animal dogAnimal = new Dog();
        dogAnimal.eat();
        dogAnimal.sleep();
        System.out.println(dogAnimal.age);
    }

}
