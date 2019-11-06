package sprint3_swing_learning.treadLearing.övning12;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.util.Scanner;


public class MedicineReminder {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many types medicines do you have?"); System.out.flush();
        int types = scanner.nextInt();
        Medicine[] medicines = new Medicine[types];
        for (int i = 0; i < medicines.length; i++) {
            System.out.println("Medicine type "+(i+1));
            System.out.print("  Medicine type: "); System.out.flush();
            String type = scanner.next();
            System.out.print("  How many times per minute should medicine be taken?");System.out.flush();
            int times = scanner.nextInt();
            medicines[i] = new Medicine(type,60/times);
            medicines[i].thread.setName(type);
        }

        for(Medicine medicine : medicines){
            medicine.thread.start();
        }
        Thread.sleep(61010);
        System.exit(0);
    }
}
