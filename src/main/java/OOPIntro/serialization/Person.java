package OOPIntro.serialization;

import java.io.Serializable;

public class Person implements Serializable {
    static final long serialVersionUID = 2L;
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person with name: "+name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
