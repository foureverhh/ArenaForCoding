package lambdaSample.captureVariable;

public class LambdaExample3 {
    static  String thirdText = "Hey, a third text";

    private String fourthText = "Fourth Text";

    public void doIt(){
        final String otherText = "Hello: ";
        MyInterface myInterface = text -> System.out.println(otherText+text+" "+fourthText);
        myInterface.printIt("world");

        thirdText = "blablabla";
        fourthText = "4";
        myInterface.printIt("test static string as ");

    }



    public static void main(String[] args) {
       LambdaExample3 lambdaExample3 = new LambdaExample3();
       lambdaExample3.doIt();

    }

}
