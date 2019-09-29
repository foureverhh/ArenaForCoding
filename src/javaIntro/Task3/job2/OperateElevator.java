package javaIntro.Task3.job2;

public class OperateElevator {
    public static void main(String[] args) {
        Elevator elevator1 = new Elevator();

        elevator1.goTo(-2);
        System.out.println("Elevator1 now is on floor "+elevator1.where());
        System.out.println();

        elevator1.goTo(10);
        System.out.println("Elevator1 now is on floor "+elevator1.where());
        System.out.println();

        elevator1.goTo(5);
        System.out.println("Elevator1 now is on floor "+elevator1.where());
        System.out.println();

        elevator1.goTo(20);
        System.out.println("Elevator1 now is on floor "+elevator1.where());
        System.out.println();

        elevator1.goTo(-5);
        System.out.println("Elevator1 now is on floor "+elevator1.where());
        System.out.println();



        Elevator elevator2 = new Elevator();
        elevator2.goTo(5);
        System.out.println("Elevator2 now is on floor No."+elevator2.where());

    }

}
