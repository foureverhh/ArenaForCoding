package sprint4.practice5a.data;

public class Person {
    private String name;
    private String mobile;
    private String date;
    private String email;

    public Person(String name, String mobile, String date, String email) {
        this.name = name;
        this.mobile = mobile;
        this.date = date;
        this.email = email;
    }

    @Override
    public String toString() {
        return name+" "+mobile+" "+date+" "+email;
    }

    public String getName() {
        return name;
    }
}
