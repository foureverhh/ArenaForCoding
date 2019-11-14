package sprint4.properties;

public class Person {
    private String name;
    private String id;
    private String gender;
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name+" "+id+" "+gender+" "+address;
    }
}
