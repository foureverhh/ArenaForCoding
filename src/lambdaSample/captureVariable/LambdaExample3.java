package lambdaSample.captureVariable;

public class LambdaExample3 {
    static  String thirdText = "Hey, a third text";
    public static void main(String[] args) {
        final String otherText = "Hello: ";
        MyInterface myInterface = text -> System.out.println(otherText+text+" "+thirdText);
        myInterface.printIt("world");

        thirdText = "blablabla";
        myInterface.printIt("test static string as ");
    }

}
