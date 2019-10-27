package OOPIntro.streamPractice;

import sun.rmi.server.InactiveGroupException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class App {
    public static void main(String[] args) {

        List<Double> array = new ArrayList<>();
      try(//FileReader reader = new FileReader("files/5a.txt");
          BufferedReader reader = new BufferedReader(new FileReader("files/5a.txt"));
            //FileWriter writer = new FileWriter("files/practiseCopy.txt")
      ){
            /*
            try(FileInputStream reader = new FileInputStream("files/practise.txt");
            FileOutputStream writer = new FileOutputStream("files/practiseCopy.txt")){
            */
            //int item = -1;
            String item = null;
            while ((item=reader.readLine())!=null){
                //writer.write(item);
                array.add(Double.parseDouble(item.trim()));
                System.out.print(Double.parseDouble(item.trim()));
                System.out.println();
                //writer.flush();
            }
          System.out.println(array);
            sort(array);
          System.out.println(array);
          System.out.println("Lowest is: "+array.get(0));
          System.out.println("Largest is："+array.get(array.size()-1));
          System.out.println("Average is: "+average(array));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void sort(List<Double> list){
        for (int i = 0; i < list.size()-1; i++) {
            for(int j = 0; j < list.size()-1-i;j++){
                if(list.get(j) > list.get(j+1)){
                    double temp = list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);
                }
            }
        }
    }
    static double average(List<Double> list){
        double sum = 0;
        for(Double d:list){
            sum += d;
        }
        return sum / list.size();
    }
}
