package javaIntro.arv;

public class Cat extends Animal {
    protected String color = "white";
    public Cat(){
        super();
        //this.color = color;
    }
    public void meow(){
        System.out.println("Meow....");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected String getColor() {
        return this.color;
    }
}
