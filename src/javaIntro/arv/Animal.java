package javaIntro.arv;

public class Animal {

    protected  String color = "purple";
    public String size = "large";
    public Animal(){

    }
    public Animal(String color){
        this.color = color;
    }
    /*
    * Instance method in Animal
    * */
    public void eat(){
        System.out.println("Animal eats.");
    }

    /*
     * Instance method in Animal
     * */
    public void sleep(){
        System.out.println("Animal sleeps.");
    }

    protected void showColor(){
        System.out.println("Protected color is "+this.color);
    }

/*    protected void swim(){
        System.out.println("swim");
    }*/

    protected String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "I am a " + this.color + " animal.";
    }
}
