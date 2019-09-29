package javaIntro.classArv.javaOne;

public class Boss {

    public static void main(String[] args) {
        Employee david = new Employee("David","David Home","1");
        Employee mike = new Employee("Mike","Mike Home","2");
        david.setSalary(100);
        mike.setSalary(10);
        david.setSalary(david.promotion());
        System.out.println(david.getSalary());
        System.out.println(mike.getSalary());
        System.out.println(david.getName());
        System.out.println(mike.getName());

        System.out.println();
        System.out.println("-----Test polymorphism-----");
        Person personEmployee = new Employee();//new Employee("David","David Home","1");
        System.out.println(personEmployee.getAddress()+personEmployee.getId()+personEmployee.getName());


        Mouse mouse = new Mouse();
        System.out.println("mouse color: "+mouse.color);
        System.out.println("mouse size: "+mouse.size);
        //System.out.println(mouse.getColor());
        System.out.println();
        System.out.println("Test gender:");
        Person person = new Person();
        System.out.println(david.gender+" "+mike.gender);
        System.out.println(person.gender);
        personEmployee.setGender("Male");
        System.out.println(person.gender);
        System.out.println(personEmployee.gender);

    }

}
