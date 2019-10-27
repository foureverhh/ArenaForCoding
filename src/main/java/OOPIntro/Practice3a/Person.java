package OOPIntro.Practice3a;

public class Person {
    private String name;
    private String personNumber;

    public Person() {
    }

    public Person(String name, String personNumber) {
        this.name = name;
        this.personNumber = personNumber;
    }

    public String getName() {
        return name;
    }

    public String getPersonNumber() {
        return personNumber;
    }
}
