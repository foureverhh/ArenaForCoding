package OOPIntro.bank;

import OOPIntro.bank.people.Person;

import java.beans.Customizer;

public class App {
    public static void main(String[] args) {
        Person.Customer customer1 = Person.Customer.getInstance();
        System.out.println(customer1);

        System.out.println(customer1.getClass().getSimpleName());
        //System.out.println(customer.getName().equals(Person.Customer.class));
    }
}
