package javaIntro.getName;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class GetName {
    public static void main(String[] args) throws IOException {
        List<String> lists = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("name.txt"));
        String name = null;
        int counterTotal = 0;
        int counterAIHakim = 0;

        while((name = reader.readLine())!= null){
            counterTotal++;
            lists.add(name);
            if(name.contains("AI Hakim")){
                counterAIHakim++;
            }
        }
        System.out.println(lists);

        for (int i = 0; i < lists.size()/2 ; i++) {
            String temp = lists.get(i);
            lists.set(i,lists.get(lists.size()-1-i));
            lists.set(lists.size()-1-i,temp);
        }

        //Collections.reverse(lists);
        System.out.println("Name list is as: "+lists+", number of persons are: "+counterTotal);
        System.out.println("The number with AI Hakim as last name are: "+ counterAIHakim);
    }
}
