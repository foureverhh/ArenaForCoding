package OOPIntro.scannerTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class ScanCSV {
    public static void main(String[] args) {
        Map<String,Integer> findTallPerson = new HashMap<>();
        try (Scanner scanner = new Scanner(new File("files/practise.txt"))){

            scanner.useDelimiter("\n");
            while (scanner.hasNextLine()){
                String name = null;
                int height = 0;
                String str1 = scanner.nextLine();
                //String str2 = scanner.nextLine();
                String[] strs = str1.split(",");
                name = strs[0];
                for(String str: strs){
                    System.out.print(str+" ");
                }
                System.out.println();
                str1 = scanner.nextLine();
                strs = str1.split(",");
                height = Integer.parseInt(strs[2].trim());
                for(String str: strs){
                    System.out.print(str+" ");
                }
                System.out.println();
                findTallPerson.put(name,height);
                /*
                String name = scanner.next().trim();
                System.out.println(name);

                String address = scanner.next().trim();
                System.out.println(address);

                String post = scanner.next().trim();
                System.out.println(post);

                int age = Integer.parseInt(scanner.next().trim());
                System.out.println(age);

                int weight = Integer.parseInt(scanner.next().trim());
                System.out.println(weight);

                int height = Integer.parseInt(scanner.next().trim());
                System.out.println(height);

                System.out.println();
                //System.out.println(name + "lives in "+address+" "+post+" is "+age+" and weighs "+weight+" in height "+height);
                */
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
/*
        System.out.println();
        System.out.println("Read by BufferedReader:");
        try(BufferedReader reader = Files.newBufferedReader(Paths.get("files/practise.txt"))){
            String str = null;
            while ((str =  reader.readLine())!=null){
                String[] strings = str.split(",");
                for(String string : strings){
                    System.out.print(string+" ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        Set<String> names = getKeys(findTallPerson,200);
        System.out.println("There are "+names.size()+" tall persons:");
        for(String name : names){
            System.out.println(name);
        }
    }

    static Set<String> getKeys (Map<String,Integer> map, Integer value){
        Set<String> keys = new HashSet<>();
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue()>=value){
                keys.add(entry.getKey());
            }
        }
        return keys;
    }

}
