package javaIntro.arv;

public class AnimalMain {
    public static void main(String[] args) {
        System.out.println("----animal----");
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        System.out.println(animal);


        System.out.println("----dog1-----");
        Dog dog1 = new Dog();
        System.out.println(dog1);
        dog1.eat();
        dog1.sleep();
        System.out.println(dog1.color);

        System.out.println("----cat1----");
        Cat cat1 = new Cat();

        System.out.println(cat1);

        System.out.println("----animalCat----");
        Animal animalCat = new Cat();
        System.out.println(animalCat);

        //System.out.println(animalCat.getColor());
      /*  System.out.println("-----fish-----");
        Fish fish = new Fish();
        fish.color*/
    }
}
