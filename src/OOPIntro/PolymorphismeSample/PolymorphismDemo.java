package OOPIntro.PolymorphismeSample;

public class PolymorphismDemo {
    Person pTall;
    Person pShort;

    public class Person{
        public void speak(){
            System.out.println("Person speaks");
        }
    }

    class TallMan extends Person{
        @Override
        public void speak() {
            System.out.println("Tall man speaks");
        }
    }

    class ShortMan extends Person{
        @Override
        public void speak() {
            System.out.println("short man speaks");
        }
    }

    public PolymorphismDemo(){
        Person a = new TallMan();
        Person b =  new ShortMan();
        a.speak();
        b.speak();



        pTall = new TallMan();
        pShort = new ShortMan();
    }

}
