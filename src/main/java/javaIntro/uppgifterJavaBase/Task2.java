package javaIntro.uppgifterJavaBase;

import java.io.*;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Random;

public class Task2 {
    private static char[] chars;
    private static int[] result;

    public static void main(String[] args) {
        int castTimes = 1000;
        File numbers = new File("numbers.txt");
        createFile(castTimes, numbers);
        chars = createArray(numbers);
        result = analyseArray(chars);
        checkResult();
    }

    private static int castDiceWithRandom() {
        //return random in [1,6]
        Random random = new Random();
        return random.nextInt(6) + 1;
    }


    private static char[] createArray(File file) {
        String result = null;
        try (InputStream is = new BufferedInputStream(new FileInputStream(file))) {
            byte[] buffer = new byte[1024];
            int load = 0;
            while (-1 != (load = is.read(buffer))) {
                result = new String(buffer, 0, load);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result == null ? new char[]{'0'} : result.toCharArray();
    }

    private static int[] analyseArray(char[] chars) {


        int[] result = new int[6];
        for (int i = 0; i <chars.length ; i++) {
            result[Character.getNumericValue(chars[i])-1]++;
        }
/*        for (int i = 1; i <= 6; i++) {
            int counter = 0;
            for (int j = 0; j < chars.length; j++) {
                if (i == Character.getNumericValue(chars[j])) {
                    counter++;
                }
            }
            result[i - 1] = counter;
        }*/
        return result;
    }

    private static void createFile(int castTimes, File file) {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(file)))) {
            for (int i = 1; i <= castTimes; i++) {
                writer.print(castDiceWithRandom());
            }
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File write failed");
        }
    }

    private static void checkResult() {
        System.out.println("Result of createArray():");
        for (int i = 1; i <= chars.length; i++) {
            System.out.print(chars[i - 1]);
            if (i % 100 == 0)
                System.out.println();
        }
        System.out.println("The length of char array created by createArray() is: " + chars.length);

        System.out.println();
        System.out.println("Result of analyseArray():");
        System.out.println(Arrays.toString(result));
        IntSummaryStatistics summaryStatistics = Arrays.stream(result)
                .summaryStatistics();
        long itemsTotal = summaryStatistics.getSum();
        System.out.println("The number of items in the result of analyseArray() is: " + itemsTotal);

    }
}



