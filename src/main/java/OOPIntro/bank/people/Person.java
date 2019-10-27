package OOPIntro.bank.people;

import OOPIntro.bank.aset.Loan;
import OOPIntro.bank.aset.Account;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private static String name;
    private static String personNumber;

    Person() {
    }

    Person(String name,String personNumber){
        Person.name = name;
        Person.personNumber = personNumber;
    }

    public String getName() {
        return name;
    }

    public String getPersonNumber() {
        return personNumber;
    }


    public static class Customer extends Person{
        private static List<Loan> loans = new ArrayList<>();
        private static List<Account> accounts = new ArrayList<>();
        private static Customer instance = new Customer(name,personNumber,loans,accounts);

        private Customer(String name, String personNumber, List<Loan> loans, List<Account> accounts){
            super(name, personNumber);
            Customer.loans = loans;
            Customer.accounts = accounts;
        }

        public static Customer getInstance(){
           return Customer.instance;
        }

        public List<Loan> getLoans() {
            return loans;
        }

        public List<Account> getAccount() {
            return accounts;
        }

        public static void setLoans(List<Loan> loans) {
            Customer.loans = loans;
        }

        public static void setAccounts(List<Account> accounts) {
            Customer.accounts = accounts;
        }
    }

    public static class Employee extends Person{
        private static List<Loan> loans = new ArrayList<>();
        private static double salary;

        private static Employee instance = new Employee(name,personNumber,loans,salary);

        private Employee(String name, String personNumber, List<Loan> loans,double salary) {
            super(name, personNumber);
            Employee.loans = loans;
            Employee.salary = salary;
        }

        public static Employee getInstance(){
            return Employee.instance;
        }
    }

    public static void setName(String name) {
        Person.name = name;
    }

    public static void setPersonNumber(String personNumber) {
        Person.personNumber = personNumber;
    }
}
