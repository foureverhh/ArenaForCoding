package lambdaSample.example2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class LambdaExample2 {

    public static void main(String[] args) throws FileNotFoundException {
        MyInterface myInterface = text -> System.out.println(text);
        myInterface.printIt("text");
        myInterface.printUtf8To("Hello File",new FileOutputStream("date.txt"));
        MyInterface.printItToSystemOut("Hello out!");
    }
}
