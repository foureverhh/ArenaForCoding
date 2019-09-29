package OOPIntro.arrayTest;

import com.sun.codemodel.internal.JForEach;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import javaIntro.ListDemo.ListDemo;
import sun.security.pkcs11.wrapper.CK_SSL3_KEY_MAT_OUT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayAsList {
    public static void main(String[] args) {
        String[] strings = {"a","b","c","d"};
        List<String> stringList = new ArrayList<>(Arrays.asList(strings));
        System.out.println(stringList.size());


        System.out.println(stringList.toArray().length);
        for (Object str: stringList.toArray()){
            System.out.println((String) str);
        }
    }


}
