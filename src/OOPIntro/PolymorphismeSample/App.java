package OOPIntro.PolymorphismeSample;

public class App {
    public static void main(String[] args) {
        System.out.println("We get a and b to speak from constructor");
        PolymorphismDemo polymorphismDemo = new PolymorphismDemo();



       System.out.println();
        System.out.println("We let pTall to speak");

        polymorphismDemo.pTall.speak();


        System.out.println();
        System.out.println("We let pTall to speak");
        polymorphismDemo.pShort.speak();

    }
}
