package javaIntro.classArv.javaOne;

public class App {
    public static void main(String[] args) {
        Person employee = new Employee("employee","employee address","employee 01");
        System.out.println(employee.getAddress());
        System.out.println(employee.getName());
        System.out.println(employee.getId());
        System.out.println(employee.gender);
    }
}
