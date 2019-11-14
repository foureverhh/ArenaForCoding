package sprint4.properties;

import java.io.*;
import java.util.Enumeration;
import java.util.Properties;

public class PropertyDemo {
    public static void main(String[] args) throws IOException {
        Person p = new Person();
        Properties properties = new Properties();
        properties.load(new FileInputStream("/Users/foureverhh/ArenaForCoding/src/main/resources/demo.properties"));
        String name = properties.getProperty("name");
        String id = properties.getProperty("id");
        String gender = properties.getProperty("gender");
        String address = properties.getProperty("address");
        p.setName(name);
        p.setId(id);
        p.setGender(gender);
        p.setAddress(address);
        System.out.println(p);

/*        OutputStream os = new FileOutputStream("/Users/foureverhh/ArenaForCoding/src/main/resources/john.properties");
        properties.setProperty("name","John");
        properties.setProperty("id","1234");
        properties.store(os,null);*/

        //Test xml
        properties.loadFromXML(new FileInputStream("/Users/foureverhh/ArenaForCoding/src/main/resources/person.xml"));
        p.setAddress(properties.getProperty("address"));
        p.setGender(properties.getProperty("gender"));
        p.setId(properties.getProperty("id"));
        p.setName(properties.getProperty("name"));
        System.out.println(p);

        Enumeration enumeration = properties.propertyNames();
        while (enumeration.hasMoreElements()){
            String key = (String) enumeration.nextElement();
            String value = properties.getProperty(key);
            System.out.println(key+" "+value);
        }


    }
}
